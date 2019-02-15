package AlgorithmProject;

import java.util.*;
import javax.swing.JFrame;
// This class represents a directed graph using adjacency linked list representation

public class Graph {

    private int V;   // No. of vertices
    Vertex[] adjLists;
    Semester[] semesters;

    Graph(int v) {// Constructor
        V = v;
        adjLists = new Vertex[v];
        Course c = new Course();
        ArrayList<Course> list = c.readCourses();
        for (int i = 0; i < adjLists.length; i++) {
            adjLists[i] = new Vertex(list.get(i), null);
        }
        for (int i = 0; i < v; i++) {
            adjLists[i].adjList = new LinkedList();
        }
    }

    // A recursive function that uses visited[] and recStack[] to detect
    // cycle in subgraph reachable from vertex v.
    Boolean HasCycleDFS(int v, Boolean visited[], Boolean recStack[]) {
        int i;
        if (visited[v] == false) {
            // Mark the current node as visited and part of recursion stack
            visited[v] = true;
            recStack[v] = true;
            //System.out.print(adjLists[v].course.code+" ");//To prnit DFS Traversal
            Iterator<Integer> it = adjLists[v].adjList.iterator();
            while (it.hasNext()) {
                i = it.next();
                if (!visited[i] && HasCycleDFS(i, visited, recStack)) {
                    return true;
                } else if (recStack[i]) {
                    return true;
                }
            }
            // Recur for all the vertices adjacent to this vertex	
        }
        recStack[v] = false;
        return false;
    }

    // Returns true if the graph contains a cycle, else false.
    Boolean graphHasCycleDFS() {
        // Mark all the vertices as not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        Boolean recStack[] = new Boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
            recStack[i] = false;
        }
        // Call the recursive helper function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++) {
            if (HasCycleDFS(u, visited, recStack)) {
                return true;
            }
        }
        return false;
    }

    public void print() {//print the adjacency linked list
        System.out.println();
        for (int v = 0; v < adjLists.length; v++) {
            System.out.print(String.format("%-40s", adjLists[v].course.name));
            for (Integer nbr : adjLists[v].adjList) {
                System.out.print(" --> " + adjLists[nbr].course.name);
            }
            System.out.println("\n");
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adjLists[v].adjList.add(w);
    }

    // Function to do Topological Sort
    public int[] topologicalSort() {
        // calculate indegree
        int[] indegree = new int[V];
        ArrayList<int[]> prerequisites = new ArrayList<int[]>();
        prerequisites.add(new int[2]);
        for (int i = 0; i < V; i++) {
            if (!adjLists[i].course.preReq.get(0).equals("null")) {
                prerequisites.add(new int[]{i, searchCourse(adjLists[i].course.preReq.get(0))});
            }
        }
        //To adjacent list
        Map<Integer, List<Integer>> adjac = new HashMap<>();
        for (int[] edge : prerequisites) {
            int prev = edge[0];
            int dep = edge[1];
            if (adjac.containsKey(prev)) {
                adjac.get(prev).add(dep);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(dep);
                adjac.put(prev, list);
            }
            indegree[dep]++;
        }
        // track the order of each nodes
        int count = V - 1;
        int[] order = new int[V];

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (queue.size() != 0) {
            int course = queue.poll();
            order[count--] = course;
            if (adjac.containsKey(course)) {
                List<Integer> deps = adjac.get(course);
                for (int dep : deps) {
                    indegree[dep]--;
                    if (indegree[dep] == 0) {
                        queue.offer(dep);
                    }
                }
            }
        }
        return order;
    }

    public ArrayList<String> readEdges() {
        ArrayList<String> edgeList = new ArrayList<>();
        for (int i = 0; i < adjLists.length; i++) {
            String pre = adjLists[i].course.code;
            for (int j = 0; j < adjLists.length; j++) {
                for (String p : adjLists[j].course.preReq) {
                    if (pre.equals(p)) {
                        addEdge(i, j);
                        edgeList.add(adjLists[i].course.name + "-->" + adjLists[j].course.name + "\n");
                    }
                }
            }
        }
        return edgeList;
    }

    public Semester[] createSemesters(ArrayList<Integer> topSort) {
        semesters = new Semester[8];
        for (int i = 0; i < 8; i++) {
            semesters[i] = new Semester();
            semesters[i].totalCredit = 0;
        }
        Boolean included[] = new Boolean[V];
        for (int i = 0; i < V; i++) {
            included[i] = false;
        }
        Boolean preIncluded;
        semesters[6].semCourses.add(adjLists[searchCourse("0911410")].course);//project propsal 
        included[searchCourse("0911410")] = true;
        semesters[6].totalCredit = semesters[6].totalCredit
                + Integer.parseInt(adjLists[searchCourse("0911410")].course.credit);
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[0].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }
            if ((!included[cindex]) && preIncluded
                    && (semesters[0].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 15) {
                included[cindex] = true;
                semesters[0].semCourses.add(adjLists[cindex].course);
                semesters[0].totalCredit = semesters[0].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[1].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }
            if ((!included[cindex]) && preIncluded
                    && (semesters[1].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[1].semCourses.add(adjLists[cindex].course);
                semesters[1].totalCredit = semesters[1].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[2].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }
            if ((!included[cindex]) && preIncluded
                    && (semesters[2].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[2].semCourses.add(adjLists[cindex].course);
                semesters[2].totalCredit = semesters[2].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[3].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }
            if ((!included[cindex]) && preIncluded
                    && (semesters[3].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[3].semCourses.add(adjLists[cindex].course);
                semesters[3].totalCredit = semesters[3].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[4].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }
            if ((!included[cindex]) && preIncluded
                    && (semesters[4].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[4].semCourses.add(adjLists[cindex].course);
                semesters[4].totalCredit = semesters[4].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[5].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }

            if ((!included[cindex]) && preIncluded
                    && (semesters[5].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[5].semCourses.add(adjLists[cindex].course);
                semesters[5].totalCredit = semesters[5].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                if (n.equals("0911410")) {
                    preIncluded = false;
                }
                for (Course crs : semesters[6].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }

            if ((!included[cindex]) && preIncluded
                    && (semesters[6].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[6].semCourses.add(adjLists[cindex].course);
                semesters[6].totalCredit = semesters[6].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        for (Integer cindex : topSort) {
            preIncluded = true;
            for (String n : neededCourses(adjLists[cindex].course.code)) {
                for (Course crs : semesters[7].semCourses) {
                    if (crs.code.equals(n)) {
                        preIncluded = false;
                    }
                }
                if (!included[searchCourse(n)]) {
                    preIncluded = false;
                }
            }
            if ((!included[cindex]) && preIncluded
                    && (semesters[7].totalCredit) + Integer.parseInt(adjLists[cindex].course.credit) <= 16) {
                included[cindex] = true;
                semesters[7].semCourses.add(adjLists[cindex].course);
                semesters[7].totalCredit = semesters[7].totalCredit
                        + Integer.parseInt(adjLists[cindex].course.credit);
            }
        }
        return semesters;
    }

    public String[] courseNames() {
        String courseNames[] = new String[adjLists.length];
        for (int v = 0; v < adjLists.length; v++) {
            courseNames[v] = adjLists[v].course.name;
        }
        return courseNames;
    }

    class Semester {
        ArrayList<Course> semCourses = new ArrayList<>();
        int totalCredit;
    }

    class Vertex {

        Course course;
        LinkedList<Integer> adjList;

        Vertex(Course course, LinkedList<Integer> neighbors) {
            this.course = course;
            this.adjList = neighbors;
        }

        public String toString() {
            return "Course: " + course + "AdjList: " + adjList + "\n";
        }
    }

    public ArrayList<String> neededCourses(String code) {
        ArrayList<String> neededCourses = new ArrayList<>();
        int courseIndex = searchCourse(code);
        Course course = adjLists[courseIndex].course;
        for (String pre : course.preReq) {
            if (!pre.equals("null")) {
                neededCourses.add(pre);
                code = pre;
                courseIndex = searchCourse(code);
                if (!adjLists[courseIndex].course.preReq.get(0).equals("null")) {
                    do {
                        for (String p : adjLists[courseIndex].course.preReq) {
                            neededCourses.add(p);
                            code = p;
                            courseIndex = searchCourse(code);
                        }
                    } while (!adjLists[courseIndex].course.preReq.get(0).equals("null"));
                }
            }
        }
        Collections.reverse(neededCourses);
        return neededCourses;
    }

    public int searchCourse(String code) {
        for (int i = 0; i < adjLists.length; i++) {
            Course c = adjLists[i].course;
            if (code.equals(c.code)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        GUI gui = new GUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gui.setVisible(true);
        Course c = new Course();
        ArrayList<Course> list = c.readCourses();
        Graph g = new Graph(list.size());
        Graph g2 = new Graph(list.size());
        ArrayList<String> neededCourses;
        Scanner in = new Scanner(System.in);
        int userChoice;
        String code;
        boolean quit = false;
        do {
//            System.out.println("1. Show all courses of CS department");
//            System.out.println("2. Show adjacency linked list");
//            System.out.println("3. Show all edges");
//            System.out.println("4. Detect a cycle");
//            System.out.println("5. Show the Topological Order");
//            System.out.print("Your choice, 0 to quit: ");
            userChoice = in.nextInt();
            switch (userChoice) {
                case 1:
                    for (Vertex v : g.adjLists) {
                        System.out.println(v.course);
                    }
                    break;
                case 2:
                    g.readEdges();
                    g.print();
                    break;
                case 3:
                    System.out.println(g2.readEdges());
                    break;
                case 4:
                    //System.out.print("The Depth First Search Traversal: ");
                    if (g.graphHasCycleDFS()) {
                        System.out.println("\nGraph contains cycle, No Study Plan Possible");
                    } else {
                        System.out.println("\nGraph doesn't contain cycle");
                    }
                    break;
                case 5:
                    System.out.print("The Topological Order: ");
                    int[] topSort = g.topologicalSort();
                    for (int i = 0; i < topSort.length; i++) {
                        System.out.print(topSort[i] + " ");
                    }
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
            System.out.println();
        } while (!quit);
    }
}

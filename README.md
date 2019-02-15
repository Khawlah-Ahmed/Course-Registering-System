# Course Registering System:
A project developed in Java (GUI), that can help departments in universities create a valid 4-year study plan in which it considers the prerequisites of each course and manage how to arrange them. The information about the courses and their prerequisites are read from a CSV file. This project is dedicated to "Algorithm Analysis and Design" course.

# Problem Description:
In a properly built course registering system, students are not allowed to register for a course if they have not taken the prerequisite course(s). However, if there is a cycle of prerequisite courses then students cannot register some of the courses at all. You have been asked to develop a system to help a department in a university to identify if there are any such courses that the course registering system will not allow students to register. 

Additionally you have to create a study plan for 4 years. You can assume that there are two semesters in each year and in 4 years a student will take all the courses.  Assume that there is no elective courses. Ideally, you should assign the courses in such way that in each semester a student registers similar number of credit hours. As an example, if there are total of 120 credit hours, each semester ideally a student should take 120/8=15 credit hours. However, it might not always be possible since a course can be registered only after the prerequisites have been taken.

You need to manually create an input file consisting of courses offered in a department (eg. Computer Engineering, Civil Engineering etc.). You have to select a department (from KFU or outside) and create that input file consulting the course catalog of that department. The file should consist course name, prerequisite/s of the course and number of credit hours of the course. You have to read this file from your program. Then you have to check if there are any cycles of prerequisite courses. If there is a cycle output “No Study Plan Possible”, otherwise you have to create a study plan for 4 years.


# Project Abstract:
The aim of this project is to develop a system that helps computer science (CS) department at King Faisal University (KFU) to maintain the prerequisite(s) of each course and detect if there is a cycle of prerequisite courses. Therefore, it will support the course registering system to be built properly. The CS students in KFU are allowed to register for courses and are prevented to register if they did not take the prerequisite(s) for a specific course. ‏The system implies a 4-year study plan for the department with a total of 120 credit hours and consisting of 8 semesters each carrying about 15 credit hours. ‏The system reads an input file that consists of courses offered in the CS department. Then, it creates a proper study plan for 4 years so students will be able to register a specific course provided that they have taken the prerequisite(s) for that course. ‏The system uses directed graph (Digraph) implemented as an adjacency linked list to represent the courses with their prerequisites. In addition, the system should detect any cycle of prerequisite courses in the graph which can result when there is a path from a node (course) that leads to itself. The cycle of prerequisite courses will be detected by a Depth First Search (DFS) algorithm. After that, in case no cycle is detected, a Topological Sorting algorithm will generate a topological order to assign courses to each semester properly to create a 4-year study plan. Otherwise, if a cycle is detected, the system will show that no study plan is possible.

#### Keywords: Directed Graph (Digraph), Adjacency Linked List, Cycle Detection, Depth First Search (DFS) Algorithm, Topological Sorting Algorithm.




# Demo/Screenshots:

#### 1. Start Screen:

![capture](https://user-images.githubusercontent.com/40549682/52854205-d5660380-312e-11e9-98b2-ba46d5e62a06.PNG)


#### 2. Check Study Plan Validity:

![capture1](https://user-images.githubusercontent.com/40549682/52854708-596cbb00-3130-11e9-8ac3-ea35cc4e1cef.PNG)


#### 3. Study Plan Window (View Study Plan):

![capture2](https://user-images.githubusercontent.com/40549682/52854740-84efa580-3130-11e9-963b-68a7530dfd8e.PNG)


#### 4. Study Plan Window (Make Changes to the Study Plan):

![capture3](https://user-images.githubusercontent.com/40549682/52854784-acdf0900-3130-11e9-8c83-9c51a3f1bf32.PNG)

![capture4](https://user-images.githubusercontent.com/40549682/52854987-3db5e480-3131-11e9-98aa-f503930819c0.PNG)


#### 5. Study Plan Window (View Needed/Prerequisite Course/s) for a Specifics Coursee:

![capture5](https://user-images.githubusercontent.com/40549682/52855060-68a03880-3131-11e9-987d-94aabccd7eef.PNG)


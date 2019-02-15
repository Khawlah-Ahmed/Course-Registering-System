package AlgorithmProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Course {

    public String code;
    public String name;
    public String credit;
    ArrayList<String> preReq = new ArrayList<>();

    public Course(String code, String name, String credit, ArrayList<String> preReq) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.preReq = preReq;
    }

    public Course() {
    }

    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Credit Hours: " + credit + ", Prerequisite(S): " + preReq + "\n";
    }

    public ArrayList<Course> readCourses() {
        String line = "";
        BufferedReader br = null;
        Course crs;
        ArrayList<Course> courseList = new ArrayList<>();
        String cCode;
        String cName;
        String cCredit;

        try {
            br = new BufferedReader(new FileReader("inputFile.txt"));
            for (int i = 0; (line = br.readLine()) != null; i++) {
                ArrayList<String> cpreReq = new ArrayList<>();
                // use comma as separator                
                String[] sen = line.split(",");
                cCode = sen[0];
                cName = sen[1];
                cCredit = sen[2];
                for (i = 3; i < sen.length; i++) {
                    cpreReq.add(sen[i]);
                }
                crs = new Course(cCode, cName, cCredit, cpreReq);
                courseList.add(crs);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return courseList;
    }
}

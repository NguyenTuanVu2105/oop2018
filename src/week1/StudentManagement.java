package week1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    ArrayList<Student> student = new ArrayList<Student>(100);
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        ArrayList<String> group = new ArrayList<String>();
        for(int i=0; i<student.size(); i++){
            if(!group.contains(student.get(i).getGroup()))
                group.add(student.get(i).getGroup());
        }
        for(int i=0; i<group.size(); i++){
            System.out.println("Group " + group.get(i) + ':' );
            for (int j=0; j<student.size(); j++){
                if (student.get(j).getGroup().equals(group.get(i))){
                    student.get(j).getInfo();
                }
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        for(int i=0;i<student.size();i++)
        {
            if( student.get(i).getId().equals(id)) student.remove(i);
        }
    }

    public static void main(String[] args) {
        // TODO:
        //Step 6
        Student s1 = new Student();
        s1.setName("Nguyễn Tuấn Vũ");
        s1.setId("17021138");
        s1.setEmail("daigiachantran01@gmail.com");
        s1.setGroup("INT22042");
        System.out.println(s1.getName());
        s1.getInfo();

        //Step 8 && 10
        Student s2 = new Student();
        Student s3 = new Student("Nguyễn Thị Thanh Huyền", "17020810", "thanhhuyen_thanhlang@gmail.com");
        Student s4 = new Student(s1);
        StudentManagement studentUET = new StudentManagement();
        studentUET.student.add(s1);
        studentUET.student.add(s2);
        studentUET.student.add(s3);
        studentUET.student.add(s4);
        System.out.println(studentUET.sameGroup(s1,s2));
        System.out.println(studentUET.sameGroup(s1,s4));

        //step 12 && 13
        studentUET.removeStudent("17021138");
        studentUET.studentsByGroup();
    }
}

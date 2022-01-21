package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;
import java.util.HashSet;
import java.util.Set;

public class SaveTeacher {
    public static void main(String[] args) {

        Subject subject1 = new Subject("Mathematics","M33s");
        Subject subject2 = new Subject("English","E233S");
        Subject subject3 = new Subject("Science","S3634s");

        Set<Subject> subjects = new HashSet<>();

        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);

        Teacher teacher1 = new Teacher("Sanjay","Agrabal","ga@gmail.com","8959474979","Guest-Teacher");
        teacher1.setSubjects(subjects);
        Teacher teacher2 = new Teacher("CL","Verma","cl@gmail.com","0839839089","Teacher");
        teacher2.setSubjects(subjects);

      Teacher teacher =   new TeacherServiceImpl().save(teacher2);
        System.out.println(teacher1);
        Teacher teach = new TeacherServiceImpl().save(teacher1);
        System.out.println(subject1);

    }
}

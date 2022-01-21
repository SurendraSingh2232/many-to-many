package com.sunglowsys.test;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;

public class Update {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setDesignation("Government_teacher");
        new TeacherServiceImpl().update(teacher,1L);
    }
}

package com.sunglowsys.test;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;

import java.util.List;

public class AllFind {
    public static void main(String[] args) {
        List<Teacher> teacherList = new TeacherServiceImpl().allFind();
        for(Teacher teacher  : teacherList){
            System.out.println(teacher);
        }
    }
}

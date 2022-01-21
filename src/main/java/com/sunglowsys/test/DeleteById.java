package com.sunglowsys.test;

import com.sunglowsys.service.TeacherServiceImpl;

public class DeleteById {
    public static void main(String[] args) {
        System.out.println(new TeacherServiceImpl().delete(3L));
    }
}

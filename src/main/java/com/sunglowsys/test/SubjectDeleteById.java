package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.SubjectServiceImpl;

public class SubjectDeleteById {
    public static void main(String[] args) {
        Subject subject = new SubjectServiceImpl().deleteById(3L);
    }
}

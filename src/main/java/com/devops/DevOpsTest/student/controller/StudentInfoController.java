package com.devops.DevOpsTest.student.controller;


import com.devops.DevOpsTest.student.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentInfoController {

    @GetMapping(value = "/student")
    public Student getStudentData() {
        Student student = new Student();
        student.setName("Peter");
        student.setAge(12);
        student.setSex("male");
        List<Integer> scores = new ArrayList<>();
        scores.add(99);
        scores.add(98);
        scores.add(89);

        student.setScore(scores);
        return student;
    }


}

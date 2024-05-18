package com.edu.ctbu.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentsController {
    @GetMapping("/list")
    public String list(){
        return "student/list";
    }
}

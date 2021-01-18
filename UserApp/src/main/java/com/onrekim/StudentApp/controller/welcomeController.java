package com.onrekim.StudentApp.controller;

import com.onrekim.StudentApp.model.Kisiler;
import com.onrekim.StudentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class welcomeController {
    public welcomeController() {
    }
    @Autowired
    StudentService studentService;


    @RequestMapping("/")
    public String listStudents(Model model){
        List<Kisiler> studentList=studentService.getStudentList();

        model.addAttribute("kisiler",studentList);
        return "welcome-page";
    }
}

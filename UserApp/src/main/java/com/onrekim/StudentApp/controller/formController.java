package com.onrekim.StudentApp.controller;

import com.onrekim.StudentApp.model.Kisiler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class formController {

    @RequestMapping("/student-page")
    public String student(Model model){
        Kisiler kisiler=new Kisiler();
        model.addAttribute("kisiler",kisiler);
        return "/student/student-page";

    }



}

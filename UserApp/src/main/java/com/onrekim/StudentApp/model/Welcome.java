package com.onrekim.StudentApp.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
    public Welcome() {
        System.out.println("welcome const.");
    }
    @RequestMapping("/onrekim")
    public String showForm(){
        return "/welcome-page";

    }
}

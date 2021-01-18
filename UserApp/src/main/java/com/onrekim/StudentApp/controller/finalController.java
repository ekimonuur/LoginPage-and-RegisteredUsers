package com.onrekim.StudentApp.controller;

import com.onrekim.StudentApp.model.Kisiler;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/student")
public class finalController {



    @RequestMapping("/save")
    public String saveStudent(@Valid @ModelAttribute("kisiler") Kisiler kisiler,
                              BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/student/student-page";
        }
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate-cfg.xml")
                .addAnnotatedClass(Kisiler.class)
                .buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save("kisi",kisiler);
        session.getTransaction().commit();
        session.close();



        return "/student/save-page";
    }

}





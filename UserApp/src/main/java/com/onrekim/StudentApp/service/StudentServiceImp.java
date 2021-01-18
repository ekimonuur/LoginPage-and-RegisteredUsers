package com.onrekim.StudentApp.service;


import com.onrekim.StudentApp.dao.StudentDAO;
import com.onrekim.StudentApp.model.Kisiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Kisiler> getStudentList() {


        List<Kisiler> myList= studentDAO.getStudentList();
        return myList;
    }

    @Override
    public boolean save(Kisiler kisiler) {
        return studentDAO.save(kisiler);
    }
}

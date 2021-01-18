package com.onrekim.StudentApp.dao;


import com.onrekim.StudentApp.model.Kisiler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentDAO {

    public List<Kisiler> getStudentList();
    public boolean save(Kisiler kisiler);

}

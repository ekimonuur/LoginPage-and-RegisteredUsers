package com.onrekim.StudentApp.service;


import com.onrekim.StudentApp.model.Kisiler;

import java.util.List;

public interface StudentService {

   public List<Kisiler> getStudentList();

   public boolean save(Kisiler kisiler);

}

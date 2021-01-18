package com.onrekim.StudentApp.dao;


import com.onrekim.StudentApp.model.Kisiler;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImp implements StudentDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Kisiler> getStudentList() {

        Session session=sessionFactory.getCurrentSession();

        Query<Kisiler> query=session.createQuery("from Kisiler",Kisiler.class);


        List<Kisiler> myList= query.getResultList();


        return myList;

    }

    @Override
    public boolean save(Kisiler kisiler) {
        return false;

    }
}

package com.onrekim.StudentApp.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "KISILER")
public class Kisiler {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="username_kisiler")
    @NotNull
    @Size(min = 2, message = "En az iki karakter giriniz..")
    private String userName;

    @Column(name="displayname_kisiler")
    @NotNull
    private String displayName;

    @Column(name="email_kisiler")
    @NotNull
    private String eMail;

    @Column(name = "phone_kisiler")
    @NotNull
    private Integer phone;

    @Column(name = "userrole_kisiler")
    @NotNull
    private String userRole;


    public Kisiler(String userName, String displayName, String eMail, Integer phone, String userRole) {
        this.userName = userName;
        this.displayName = displayName;
        this.eMail = eMail;
        this.phone = phone;
        this.userRole=userRole;

    }

    public Kisiler() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phone=" + phone +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}

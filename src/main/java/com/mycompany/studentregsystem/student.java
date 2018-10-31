package com.mycompany.studentregsystem;

import java.util.ArrayList;

/*A student class should contain some attributes such as 
 Name, Age, DOB, ID, username, courses and modules registered for, etc.).
A specific method (getUsername()) will generate the student�s username by
concatenating their name and age.
 */
public class student {

    public String name;
    public int age;
    public String DOB;
    public long ID;
    public String username;
    public String regCourses;
    public String regModules;

    public student(String name, int age, String DOB, long ID, String regCourses, String regModules) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.regCourses = regCourses;
        this.regModules = regModules;
    }

    public String getUsername() {
        username = name + this.age;
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String dOB) {
        DOB = dOB;
    }

    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public String getRegCourses() {
        return regCourses;
    }

    public void setRegCourses(String regCourses) {
        this.regCourses = regCourses;
    }

    public String getRegModules() {
        return regModules;
    }

    public void setRegModules(String regModules) {
        this.regModules = regModules;
    }
}
//changes
//lots of changes
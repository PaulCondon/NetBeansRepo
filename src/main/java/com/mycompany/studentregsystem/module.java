
package com.mycompany.studentregsystem;

import java.util.ArrayList;

/**
 *
 * @author Paul A module class, which should contain information such as module
 * name, id (e.g. CT417), list of students, courses it is associated with).
 */
public class module {

    public String moduleName;
    public String moduleID;
    public String students;
    public String courses;

    public module(String moduleName, String moduleID, String students, String courses) {
        this.courses = courses;
        this.moduleID = moduleID;
        this.moduleName = moduleName;
        this.students = students;

    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}

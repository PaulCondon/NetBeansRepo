
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
    public ArrayList students;
    public ArrayList courses;

    public module(String moduleName, String moduleID, ArrayList students, ArrayList courses) {
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

    public ArrayList getStudents() {
        return students;
    }

    public void setStudents(ArrayList students) {
        this.students = students;
    }

    public ArrayList getCourses() {
        return courses;
    }

    public void setCourses(ArrayList courses) {
        this.courses = courses;
    }
}

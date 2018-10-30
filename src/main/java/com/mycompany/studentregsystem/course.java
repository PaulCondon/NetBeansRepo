
package com.mycompany.studentregsystem;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Paul
 */
/*A course programme class containing course name (CS & IT or ECE, etc.),
list of modules, list of students that are enrolled,
academic start date and end date. Start and end dates should use Joda Time classes (i.e. DateTime),
which must be added as a project dependency.

 */
public class course {

    public String courseName;
    public ArrayList modules;
    public ArrayList students;
    public DateTime startDate;
    public DateTime endDate;
 
    

    public course(String courseName, ArrayList modules, ArrayList students, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList getModules() {
        return modules;
    }

    public void setModules(ArrayList modules) {
        this.modules = modules;
    }

    public ArrayList getStudents() {
        return students;
    }

    public void setStudents(ArrayList students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}

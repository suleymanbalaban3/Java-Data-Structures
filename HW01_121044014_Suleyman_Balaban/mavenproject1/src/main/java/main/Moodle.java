/*
 * Suleyman Balaban 121044014
 * Moodle.java
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suleyman Balaban
 */
interface User {

    void createSystemSize();

    void displaySystem();
}
/**
 *
 * @author Suleyman Balaban
 */
abstract class Moodle implements User {

    protected static ArrayList<Admin> adminList;
    protected static ArrayList<Teacher> teacherList;
    protected static ArrayList<Student> studentList;
    protected static ArrayList<Tutor> tutorList;
    protected static ArrayList<Course> courseList;
    /**
    * This method create system Size
    * 
    * : {@link #createSystemSize()} 
    * 
    *
    */
    public void createSystemSize() {
        courseList = new ArrayList<Course>(10);
        studentList = new ArrayList<Student>(1000);
        adminList = new ArrayList<Admin>(5);
        teacherList = new ArrayList<Teacher>(10);
        tutorList = new ArrayList<Tutor>(50);
    }
    /**
    * This method abstract method add course in system
    * 
    * : {@link #addCourse(Course courseObject)} 
    * 
    * @param courseObject  
    */
    abstract void addCourse(Course courseObject);
    
    /**
    * This method display which courses in system
    * 
    * : {@link #courseOnSystem()} 
    *  
    */
    public void courseOnSystem() {
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println("---------------" + courseList.get(i).getterCourseName() + " ------------------");
            System.out.println("* " + courseList.get(i).getterCourseTeacherName() + " ");
        }
        System.out.println("---------------------------------");
    }
}

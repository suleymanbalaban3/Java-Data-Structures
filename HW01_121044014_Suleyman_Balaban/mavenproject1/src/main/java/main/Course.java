/*
 * Suleyman Balaban 121044014
 * Course.java
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Suleyman Balaban
 */
public class Course {

    private String courseName;
    private String courseTeacherName;
    /**
     * courseAssignments list
     */
    protected ArrayList<Assignment> courseAssignments;
    /**
     * courseTutors list
     */
    protected ArrayList<Tutor> courseTutors;
    /**
     * grades list
     */
    protected ArrayList<Document> grades;
    /**
     * grades list
     */
    protected ArrayList<Document> lectureNotes;
    /**
     * courseStudent list
     */
    protected ArrayList<Student> courseStudent;
    /**
    * Default constructor 
    * 
    */
    public Course() {
        this.courseName = "unknown course";
        this.courseTeacherName = "unknown teacher";
        createSystemSize();
    }
    /**
    * one parameter constructor
    *
    * @param courseName and set course name 
    */
    public Course(String courseName) {
        this.courseName = courseName;
        this.courseTeacherName = "unknown teacher";
        createSystemSize();
    }
    /**
    * two parameter constructor
    *
    * @param courseName and set course name 
    * @param courseTeacherName and set course teacher name
    */
    public Course(String courseName, String courseTeacherName) {
        this.courseName = courseName;
        this.courseTeacherName = courseTeacherName;
        createSystemSize();
    }
    /**
    * This method get course name
    * 
    * : {@link #getterCourseName()} 
    * 
    *
    * @return String
    */
    public String getterCourseName() {
        return courseName;
    }
    /**
    * This method get course teacher name
    * 
    * : {@link #getterCourseTeacherName()} 
    * 
    *
    * @return String
    */
    public String getterCourseTeacherName() {
        return courseTeacherName;
    }
    /**
    * This method set course name 
    * 
    * : {@link #setterCourseName(String courseName)} 
    * @param courseName and set course name 
    *
    */
    public void setterCourseName(String courseName) {
        this.courseName = courseName;
    }
    /**
    * This method set course teacher name
    * 
    * : {@link #setterCourseTeacherName(String courseTeacherName)} 
    * @param courseTeacherName and set course teacher name 
    *
    */
    public void setterCourseTeacherName(String courseTeacherName) {
        this.courseTeacherName = courseTeacherName;
    }
    /**
    * This method return course object's string
    * 
    * : {@link #toString()} 
    * @return String
    */
    public String toString() {
        return "Course : " + courseName + "  Teacher : " + courseTeacherName;
    }
    /**
    * This method create system size for course
    * 
    * : {@link #createSystemSize()} 
    */
    public void createSystemSize() {
        courseStudent = new ArrayList<Student>(100);
        lectureNotes = new ArrayList<Document>(100);
        grades = new ArrayList<Document>(50);
        courseTutors = new ArrayList<Tutor>(5);
        courseAssignments = new ArrayList<Assignment>(100);
    }

}

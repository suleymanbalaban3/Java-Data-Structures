/*
 * Suleyman Balaban 121044014
 * Admin.java
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Suleyman Balaban
 */
public class Admin extends Moodle {

    private String adminName;
    
    /**
    * Default constructor
    * 
    */
    public Admin() {
        this.adminName = "unknown admin";
    }
    /**
    * One parameter constructor
    *
    * @param adminName and set admin name 
    * 
    */
    public Admin(String adminName) {
        this.adminName = adminName;
    }
    /**
    * This method get admin name
    * 
    * : {@link #getterAdminName()} 
    * 
    *
    * @return String
    */
    public String getterAdminName() {
        return adminName;
    }
    /**
    * This method set admin name
    * 
    * : {@link #setterAdmin(String adminName)} 
    * 
    * @param adminName and set admin name 
    */
    public void setterAdmin(String adminName) {
        this.adminName = adminName;
    }
    /**
    * This method add admin name
    * 
    * : {@link #addAdmin(Admin adminObject)} 
    * 
    * @param adminObject add admin 
    */
    public void addAdmin(Admin adminObject) {
        if (adminList.indexOf(adminObject) != -1) {
            System.out.println("You can't add same Admin!");
        } else {
            adminList.add(adminObject);
        }
    }
    /**
    * This method remove admin 
    * 
    * : {@link #removeAdmin(Admin adminObject)} 
    * 
    * @param adminObject remove admin 
    */
    public void removeAdmin(Admin adminObject) {
        if (adminList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no admin in system");
        } else {
            adminList.remove(adminObject);
        }
    }
    /**
    * This method add teacher
    * 
    * : {@link #addTeacher(Teacher teacherObject)} 
    * 
    * @param teacherObject add admin 
    */
    public void addTeacher(Teacher teacherObject) {
        if (teacherList.indexOf(teacherObject) != -1) {
            System.out.println("You can't add same Teacher!");
        } else {
            teacherList.add(teacherObject);
        }
    }
    /**
    * This method remove teacher 
    * 
    * : {@link #removeTeacher(Teacher teacherObject)} 
    * 
    * @param teacherObject remove teacher 
    */
    public void removeTeacher(Teacher teacherObject) {
        if (teacherList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no teacher in system");
        } else {
            teacherList.remove(teacherObject);
        }
    }
    /**
    * This method add student
    * 
    * : {@link #addStudent(Student studentObject)} 
    * 
    * @param studentObject add student 
    */
    public void addStudent(Student studentObject) {
        if (studentList.indexOf(studentObject) != -1) {
            System.out.println("You can't add same Student!");
        } else {
            studentList.add(studentObject);
        }
    }
    /**
    * This method remove student 
    * 
    * : {@link #removeStudent(Student studentObject)} 
    * 
    * @param studentObject remove student 
    */
    public void removeStudent(Student studentObject) {
        if (studentList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no student in system");
        } else {
            studentList.remove(studentObject);
        }
    }
    /**
    * This method add tutor name
    * 
    * : {@link #addTutor(Tutor tutorObject)} 
    * 
    * @param tutorObject add tutor 
    */
    public void addTutor(Tutor tutorObject) {
        if (tutorList.indexOf(tutorObject) != -1) {
            System.out.println("You can't add same Student!");
        } else {
            tutorList.add(tutorObject);
        }
    }
    /**
    * This method remove tutor 
    * 
    * : {@link #removeTutor(Tutor tutorObject)} 
    * 
    * @param tutorObject remove tutor 
    */
    public void removeTutor(Tutor tutorObject) {
        if (tutorList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no tutor in system");
        } else {
            tutorList.remove(tutorObject);
        }
    }
    /**
    * This method add course
    * 
    * : {@link #addCourse(Course courseObject)} 
    * 
    * @param courseObject add course 
    */
    public void addCourse(Course courseObject) {
        if (courseList.indexOf(courseObject) != -1) {
            System.out.println("You can't add same Course!");
        } else {
            courseList.add(courseObject);
        }
    }
    /**
    * This method remove course 
    * 
    * : {@link #removeCourse(Course courseObject)} 
    * 
    * @param courseObject remove course 
    */
    public void removeCourse(Course courseObject) {
        if (courseList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no course in system");
        } else {
            courseList.remove(courseObject);
        }
    }
    /**
    * This method display system for admin  
    * 
    * : {@link #displaySystem()} 
    * 
    */
    public void displaySystem() {
        System.out.println("'''''''''''''''''''''' SYSTEM'S USERS AND COURSES ''''''''''''''''''''''");
        for (int i = 0; i < adminList.size(); i++) {
            System.out.println(adminList.get(i) + "\n");
        }
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i) + "\n");
        }
        for (int i = 0; i < tutorList.size(); i++) {
            System.out.println(tutorList.get(i) + "\n");
        }
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i) + "\n");
        }
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i) + "\n");
        }
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
    }
    /**
    * This method return admin object'string  
    * 
    * : {@link #toString()} 
    * @return String
    */
    public String toString() {
        return "Admin name : " + getterAdminName();
    }
    /**
    * This method return true if objects equals  
    * 
    * : {@link #equals(Admin object)} 
    * @param object control for equality
    * @return boolean
    */
    public boolean equals(Admin object) {
        if (this.getterAdminName() == object.getterAdminName()) {
            return true;
        } else {
            return false;
        }
    }
}

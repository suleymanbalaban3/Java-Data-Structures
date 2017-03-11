/*
 * Suleyman Balaban 121044014
 * Student.java
 */
package main;


/**
 *
 * @author Suleyman Balaban
 */
public class Student extends Moodle {

    private String studentName;
    private String studentGender;
    /**
    * Default constructor
    * 
    */
    public Student() {
        this.studentName = "unknown student";
        this.studentGender = "He";
    }
    /**
    * one parameter constructor
    *
    * @param studentName and set student name 
    */
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGender = "He";
    }
    /**
    * two parameter constructor
    *
    * @param studentName and set student name 
    * @param studentGender and set student gender
    */
    public Student(String studentName, String studentGender) {
        this.studentName = studentName;
        this.studentGender = studentGender;
    }
    /**
    * This method get student name
    * 
    * : {@link #getterStudentName()} 
    * 
    *
    * @return String
    */
    public String getterStudentName() {
        return studentName;
    }
    /**
    * This method set student name
    * 
    * : {@link #setterStudentName(String studentName)} 
    * @param studentName and set student name 
    *
    */
    public void setterStudentName(String studentName) {
        this.studentName = studentName;
    }
    /**
    * This method get student gender
    * 
    * : {@link #getterStudentGender()} 
    * 
    *
    * @return String
    */
    public String getterStudentGender() {
        return studentGender;
    }
    /**
    * This method set student gender 
    * 
    * : {@link #setterStudentGender(String studentGender)} 
    * @param studentGender and set student gender 
    *
    */
    public void setterStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }
    /**
    * This method try add course in system
    * 
    * : {@link #addCourse(Course courseObject)} 
    * @param courseObject Course object add
    */
    public void addCourse(Course courseObject) {
        System.out.println("Student can't add course to system!");
    }
    /**
    * This method enrol this student choosen course
    * 
    * : {@link #enrolMe(Course course)} 
    * @param course Course object choosen course
    */
    public void enrolMe(Course course) {
        if (courseList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no course in system");
        }
        if (courseList.indexOf(course) != -1) {
            course.courseStudent.add(this);
        }
    }
    /**
    * This method upload assignment
    * 
    * : {@link #uploadAssignment(String courseName, Assignment assignmentObject, Document documentObject)} 
    * @param courseName Course name
    * @param assignmentObject Assignment object choosen assignment
    * @param documentObject Document object 
    */
    public void uploadAssignment(String courseName, Assignment assignmentObject, Document documentObject) {
        int indis = -1;
        if (courseList.size() == 0) {
            System.out.println("There is no course on system!");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseName() == courseName
                        && courseList.get(i).courseAssignments.indexOf(assignmentObject) != -1) {
                    indis = courseList.get(i).courseAssignments.indexOf(assignmentObject);
                    if (courseList.get(i).courseAssignments.get(indis).documentList.indexOf(documentObject) != -1) {
                        System.out.println("You upload same document to Assignment!");
                    } else {
                        courseList.get(i).courseAssignments.get(indis).documentList.add(documentObject);
                    }
                }
            }
        }
        if (indis == -1) {
            System.out.println("You entered wrong course name or assignment object!");
        }

    }
    /**
    * This method compare two object if equals return true else return false
    * 
    * : {@link #equals(Student object)} 
    * @param object Student object
    * @return boolean
    */
    public boolean equals(Student object) {
        if (this.getterStudentName() == object.getterStudentName() && this.getterStudentGender() == object.getterStudentGender()) {
            return true;
        } else {
            return false;
        }
    }
    /**
    * This method display system for student
    * 
    * : {@link #displaySystem()} 
    */
    public void displaySystem() {
        int indis = -1;
        int j = 0;
        if (courseList.size() == 0)//exception
        {
            throw new ArrayIndexOutOfBoundsException("There is no course in system");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                for (j = 0; j < courseList.get(i).courseStudent.size(); j++) {
                    if (courseList.get(i).courseStudent.get(j).equals(this)) {
                        indis = i;
                        System.out.println("******************** " + getterStudentName() + " *************************");
                        System.out.println("------------- " + courseList.get(i).getterCourseName() + "---------------");
                        for (int k = 0; k < courseList.get(i).grades.size(); k++) {
                            System.out.println(courseList.get(i).grades.get(k));
                        }
                        for (int l = 0; l < courseList.get(i).lectureNotes.size(); l++) {
                            System.out.println(courseList.get(i).lectureNotes.get(l));
                        }
                    }
                }
                j = 0;
            }
            if (indis == -1) {
                System.out.println("You entered wrong course!");
            }
        }
    }
    /**
    * This method return student object's string
    * 
    * : {@link #toString()} 
    * @return String
    */
    public String toString() {
        return "Student name : " + getterStudentName() + " Gender : " + getterStudentGender();
    }
}

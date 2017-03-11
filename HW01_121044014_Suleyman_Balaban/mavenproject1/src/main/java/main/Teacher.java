/*
 * Suleyman Balaban 121044014
 * Teacher.java
 */
package main;

/**
 *
 * @author Suleyman Balaban
 */
public class Teacher extends Moodle {

    private String teacherName;
    
    /**
    * Default constructor
    * 
    */
    public Teacher() {
        this.teacherName = "unknown teacher";
    }
    /**
    * One parameter constructor
    *
    * @param teacherName and set teacher name 
    * 
    */
    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }
    /**
    * This method get teacher name
    * 
    * : {@link #getterTeacherName()} 
    * 
    *
    * @return String
    */
    public String getterTeacherName() {
        return teacherName;
    }
    /**
    * This method set teacher name
    * 
    * : {@link #setterTeacherName(String teacherName)} 
    * 
    * @param teacherName and set teacher name
    */
    public void setterTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    /**
    * This method add course
    * 
    * : {@link #addCourse(Course courseObject)} 
    * 
    * @param courseObject 
    */
    public void addCourse(Course courseObject) {
        System.out.println("Teacher can't add course to system!");
    }
    /**
    * This method add student to course
    * 
    * : {@link #addStudentToCourse(String courseName, Student object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void addStudentToCourse(String courseName, Student object) {
        int indis = -1;
        //exception
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getterCourseName() == courseName && courseList.get(i).getterCourseTeacherName() == teacherName) {
                indis = i;
            }
        }
        if (indis == -1) {
            System.out.println("You entered wrong course!");
        } else {
            if (courseList.get(indis).courseStudent.indexOf(object) != -1) {
                System.out.println("You're trying to add same student in course.It's impossible!");
            } else {
                courseList.get(indis).courseStudent.add(object);
            }
        }
    }
    /**
    * This method remove student from course
    * 
    * : {@link #removeStudentFromCourse(String courseName, Student object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void removeStudentFromCourse(String courseName, Student object) {
        int indis = -1;
        if (courseList.size() == 0)//exception
        {
            System.out.println("There is no course!!!");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseName() == courseName
                        && courseList.get(i).getterCourseTeacherName() == teacherName) {
                    indis = i;
                }
            }
            if (indis == -1) {
                System.out.println("You entered wrong course!");
            } else {
                courseList.get(indis).courseStudent.remove(object);
            }
        }
    }
    /**
    * This method add student to course
    * 
    * : {@link #addAssignmentToCourse(String courseName, Assignment object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void addAssignmentToCourse(String courseName, Assignment object) {
        int indis = -1;
        //exception
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getterCourseName() == courseName
                    && courseList.get(i).getterCourseTeacherName() == teacherName) {
                indis = i;
            }
        }
        if (indis == -1) {
            System.out.println("You entered wrong course!");
        } else {
            if (courseList.get(indis).courseAssignments.indexOf(object) != -1) {
                System.out.println("You're trying to add same assignment in course.It's impossible!");
            } else {
                courseList.get(indis).courseAssignments.add(object);
            }
        }

    }
    /**
    * This method remove assignment from course
    * 
    * : {@link #removeAssignmentFromCourse(String courseName, Assignment object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void removeAssignmentFromCourse(String courseName, Assignment object) {
        int indis = -1;
        if (courseList.size() == 0)//exception
        {
            System.out.println("There is no course!!!");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseName() == courseName
                        && courseList.get(i).getterCourseTeacherName() == teacherName) {
                    indis = i;
                }
            }
            if (indis == -1) {
                System.out.println("You entered wrong course!");
            } else {
                courseList.get(indis).courseAssignments.remove(object);
            }
        }
    }
    /**
    * This method add tutor to course
    * 
    * : {@link #addTutorToCourse(String courseName, Tutor object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void addTutorToCourse(String courseName, Tutor object) {
        int indis = -1;
        //exception
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getterCourseName() == courseName
                    && courseList.get(i).getterCourseTeacherName()==teacherName) {
                indis = i;
            }
        }
        if (indis == -1) {
            System.out.println("You entered wrong course!");
        } else {
            if (courseList.get(indis).courseTutors.indexOf(object) != -1) {
                System.out.println("You're trying to add same tutor in course.It's impossible!");
            } else if (courseList.get(indis).courseStudent.indexOf(object) != -1) {
                System.out.println("You can't be tutor and student in same course!");
            } else {
                courseList.get(indis).courseTutors.add(object);
            }
        }
    }   
    /**
    * This method remove tutor notes from course
    * 
    * : {@link #removeTutorFromCourse(String courseName, Tutor object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void removeTutorFromCourse(String courseName, Tutor object) {
        int indis = -1;
        if (courseList.size() == 0)//exception
        {
            System.out.println("There is no course!!!");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseName() == courseName
                        && courseList.get(i).getterCourseTeacherName() == teacherName) {
                    indis = i;
                }
            }
            if (indis == -1) {
                System.out.println("You entered wrong course!");
            } else {
                courseList.get(indis).courseTutors.remove(object);
            }
        }
    }
    /**
    * This method add lecture notes to course
    * 
    * : {@link #addLectureNotesToCourse(String courseName, Document object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void addLectureNotesToCourse(String courseName, Document object) {
        int indis = -1;
        //exception
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getterCourseName() == courseName
                    && courseList.get(i).getterCourseTeacherName() == teacherName) {
                indis = i;
            }
        }
        if (indis == -1) {
            System.out.println("You entered wrong course!");
        } else {
            courseList.get(indis).lectureNotes.add(object);
        }
    }
    /**
    * This method remove lecture notes notes from course
    * 
    * : {@link #removeLectureNotesFromCourse(String courseName, Document object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void removeLectureNotesFromCourse(String courseName, Document object) {
        int indis = -1;
        if (courseList.size() == 0)//exception
        {
            System.out.println("There is no course!!!");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseName() == courseName
                        && courseList.get(i).getterCourseTeacherName() == teacherName) {
                    indis = i;
                }
            }
            if (indis == -1) {
                System.out.println("You entered wrong course!");
            } else {
                courseList.get(indis).lectureNotes.remove(object);
            }
        }
    }
    /**
    * This method add grades notes to course
    * 
    * : {@link #addGradesToCourse(String courseName, Document object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void addGradesToCourse(String courseName, Document object) {
        int indis = -1;
        //exception
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getterCourseName() == courseName
                    && courseList.get(i).getterCourseTeacherName() == teacherName) {
                indis = i;
            }
        }
        if (indis == -1) {
            System.out.println("You entered wrong course!");
        } else {
            courseList.get(indis).grades.add(object);
        }
    }
    /**
    * This method remove grades notes from course
    * 
    * : {@link #removeGradesFromCourse(String courseName, Document object)} 
    * 
    * @param courseName 
    * @param object
    */
    public void removeGradesFromCourse(String courseName, Document object) {
        int indis = -1;
        if (courseList.size() == 0)//exception
        {
            System.out.println("There is no course!!!");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseName() == courseName
                        && courseList.get(i).getterCourseTeacherName() == teacherName) {
                    indis = i;
                }
            }
            if (indis == -1) {
                System.out.println("You entered wrong course!");
            } else {
                courseList.get(indis).grades.remove(object);
            }
        }
    }
    /**
    * This method display system for teacher
    * 
    * : {@link #displaySystem()} 
    * 
    */
    public void displaySystem() {
        int indis = -1;
        if (courseList.size() == 0)//exception
        {
            throw new ArrayIndexOutOfBoundsException("There is no course in system");
        } else {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&& Teacher : " + getterTeacherName() + " &&&&&&&&&&&&&&&&&&&&&&&\n");
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).getterCourseTeacherName() == getterTeacherName()) {
                    System.out.println("******************* " + courseList.get(i).getterCourseName() + " ****************** \n");
                    System.out.println("................... students in course .......................");
                    for (int j = 0; j < courseList.get(i).courseStudent.size(); j++) {
                        System.out.println((j + 1) + "-)" + courseList.get(i).courseStudent.get(j));
                        System.out.println("......................................................");
                    }
                    for (int j = 0; j < courseList.get(i).courseAssignments.size(); j++) {
                        System.out.println("................... Assignment " + (j + 1) + ".......................");
                        System.out.println(courseList.get(i).courseAssignments.get(j));
                        System.out.println("\n	   #They are students who upload assignment#			");
                        courseList.get(i).courseAssignments.get(j).listWhoUpload();
                    }
                    System.out.println("....................... Tutors.........................");
                    for (int j = 0; j < courseList.get(i).courseTutors.size(); j++) {
                        System.out.println(courseList.get(i).courseTutors.get(j));
                    }
                    System.out.println("...........................................................");
                } else {
                    if (courseList.get(i).getterCourseTeacherName() != getterTeacherName()) {
                        System.out.printf("********** unable course : ");
                        System.out.println(courseList.get(i).getterCourseName() + " **********");
                        System.out.println("******************************************************");
                    }

                }
            }
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
        }
    }
    /**
    * This method RETURN string
    * 
    * : {@link #toString()} 
    * 
    *
    * @return String
    */
    public String toString() {
        return "Teacher name : " + getterTeacherName();
    }
    /**
    * This method return true if equals
    * 
    * : {@link #equals(Teacher object)} 
    * 
    * @param object
    * @return boolean
    */
    public boolean equals(Teacher object) {
        if (this.getterTeacherName() == object.getterTeacherName()) {
            return true;
        } else {
            return false;
        }
    }
}

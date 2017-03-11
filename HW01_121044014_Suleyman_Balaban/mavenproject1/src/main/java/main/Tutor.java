/*
 * Suleyman Balaban 121044014
 * Tutor.java
 */
package main;

/**
 *
 * @author Suleyman Balaban
 */
public class Tutor extends Student {

    private String tutorName;
    private String tutorGender;

    /**
    * Default constructor
    * 
    */
    public Tutor() {
        super("Erdi", "He");
        this.tutorName = "Erdi";
        this.tutorGender = "He";
    }
    /**
    * One parameter constructor.It sets the array and valueX 
    *
    * @param tutorName and set tutor name and set gender
    * 
    */
    public Tutor(String tutorName) {
        super(tutorName, "She");
        this.tutorName = tutorName;
        this.tutorGender = "She";
    }
    /**
    * Two parameter constructor
    *
    * @param  tutorName and set tutor name
    * @param tutorGender and gender
    * 
    */
    public Tutor(String tutorName, String tutorGender) {
        super(tutorName, tutorGender);
        this.tutorName = tutorName;
        this.tutorGender = tutorGender;
    }
    /**
    * This method get tutor name
    * 
    * : {@link #getterTutorName()} 
    * 
    *
    * @return String
    */
    public String getterTutorName() {
        return tutorName;
    }
    /**
    * This method get tutor gender
    * 
    * : {@link #getterTutorGender()} 
    * 
    *
    * @return String
    */
    public String getterTutorGender() {
        return tutorGender;
    }
    /**
    * This method ser tutor name
    * 
    * : {@link #setterTutorName(String tutorName)} 
    * @param tutorName 
    */
    public void setterTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
    /**
    * This method ser tutor gender
    * 
    * : {@link #setterTutorGender(String tutorGender)} 
    * @param tutorGender 
    */
    public void setterTutorGender(String tutorGender) {
        this.tutorGender = tutorGender;
    }
    /**
    * This method display system
    * 
    * : {@link #displaySystem()} 
    */
    public void displaySystem() {
        int indis = -1;
        if (courseList.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no course in system");
        } else {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&& Tutor : " + getterTutorName() + " &&&&&&&&&&&&&&&&&&&&&&&\n");
            for (int i = 0; i < courseList.size(); i++) {
                if (courseList.get(i).courseTutors.indexOf(this) != -1) {
                    System.out.println("******************* " + courseList.get(i).getterCourseName() + " ****************** \n");
                    for (int j = 0; j < courseList.get(i).courseAssignments.size(); j++) {
                        System.out.println("................... Assignment " + (j + 1) + ".......................");
                        System.out.println(courseList.get(i).courseAssignments.get(j));
                        System.out.println("................. Lecture Notes " + (j + 1) + "......................");
                        System.out.println(courseList.get(i).lectureNotes.get(j));
                        System.out.println("......................................................");
                    }
                } else {
                    System.out.printf("********** unable course : ");
                    System.out.println(courseList.get(i).getterCourseName() + " **********");
                    System.out.println("******************************************************");
                }
            }
        }
    }
    /**
    * This method return string of obect
    * 
    * : {@link #toString()} 
    * 
    * @return String
    */
    public String toString() {
        return "Tutor name : " + getterStudentName() + ", Gender : " + getterStudentGender();
    }
    /**
    * This method return true or false
    * 
    * : {@link #equals(Tutor object)} 
    * 
    * @param object 
    * @return boolean
    */
    public boolean equals(Tutor object) {
        if (this.getterTutorName() == object.getterTutorName() && this.getterTutorGender() == object.getterTutorGender()) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 * Suleyman Balaban 121044014
 * main.java
 */
package main;


/**
 *
 * @author Suleyman Balaban
 */
public class main {
    /**
     * : {@link #main(String[] args)}
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++ WELCOME +++++++++++++++++++++++++");
        Admin baseAdmin = new Admin("Hakan Kaya");
        Admin admin = new Admin("Mert Sakarya");

        baseAdmin.createSystemSize();
        baseAdmin.addAdmin(admin);
        if(baseAdmin.adminList.size()!=0) {
            
            Teacher teacher1 = new Teacher("Erdogan Sevilgen");
            Teacher teacher2 = new Teacher("Hasari Celebi");

            Course course1 = new Course("Veri Yapilari", "Erdogan Sevilgen");
            Course course2 = new Course("Bilgisayara Giris", "Erdogan Sevilgen");
            Course course3 = new Course("Ayrik Matematik", "Hasari Celebi");
            Course course4 = new Course("Olasilik", "Hasari Celebi");

            Student student1 = new Student("Suleyman Balaban", "He");
            Student student2 = new Student("Yesim Sakiz", "She");
            Student student3 = new Student("Sena Topkara", "She");
            Student student4 = new Student("Enes Suren", "He");

            Tutor tutor1 = new Tutor("Erdi Erkmen", "He");
            Tutor tutor2 = new Tutor("Eyup Sen", "He");

            homework homework1 = new homework("HW1", "25.02.2016", "30.02.2016");
            homework homework3 = new homework("HW3", "20.02.2016", "28.02.2016");
            groupProject groupProject1 = new groupProject("Project1", "27.02.2016", "15.04.2016");

            file file1 = new file("JavaExamples.pdf", "Erdogan Sevilgen");
            file file2 = new file("hw1.java", "Yesim Sakiz");
            file gradesHw1 = new file("hw1Grades.pdf", "Erdogan Sevilgen");

            try {
                admin.removeTeacher(new Teacher("serkan"));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            admin.addTeacher(teacher1);
            admin.addTeacher(teacher2);

            admin.addCourse(course1);
            admin.addCourse(course2);
            admin.addCourse(course3);
            admin.addCourse(course4);

            admin.addTutor(tutor1);
            admin.addTutor(tutor2);

            admin.addStudent(student1);
            admin.addStudent(student2);
            admin.addStudent(student3);
            admin.addStudent(student4);

            tutor1.enrolMe(course1);
            teacher1.addStudentToCourse("Veri Yapilari", student2);
            teacher2.addStudentToCourse("Olasilik", student4);
            teacher1.addStudentToCourse("Bilgisayara Giris", student3);

            teacher1.addAssignmentToCourse("Veri Yapilari", homework1);
            teacher1.addAssignmentToCourse("Bilgisayara Giris", homework3);

            teacher1.addLectureNotesToCourse("Veri Yapilari", file1);

            teacher1.addTutorToCourse("Veri Yapilari", tutor1);
            teacher1.addTutorToCourse("Veri Yapilari", tutor2);
            teacher2.addTutorToCourse("Olasilik", tutor2);

            teacher1.addGradesToCourse("Veri Yapilari", gradesHw1);

            student2.uploadAssignment("Veri Yapilari", homework1, file2);

            try {
                teacher1.displaySystem();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            try {
                teacher2.displaySystem();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            try {
                admin.displaySystem();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            try {
                student2.displaySystem();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            try {
                tutor2.displaySystem();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            try {
                admin.removeCourse(course3);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            admin.courseOnSystem();
        }
        else
            System.out.println("There is no Admin in System!!!");
        System.out.println("++++++++++++++++++++++++++ THE END +++++++++++++++++++++++++");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TeacherTest {
    
    public TeacherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getterTeacherName method, of class Teacher.
     */
    @Test
    public void testGetterTeacherName() {
        System.out.println("getterTeacherName");
        Teacher instance = new Teacher("ali");
        String expResult = "ali";
        String result = instance.getterTeacherName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setterTeacherName method, of class Teacher.
     */
    @Test
    public void testSetterTeacherName() {
        System.out.println("setterTeacherName");
        String teacherName = "ali";
        Teacher instance = new Teacher("ali");
        instance.setterTeacherName(teacherName);
        assertEquals(teacherName,instance.getterTeacherName());
    }
    /**
     * Test of addCourse method, of class Teacher.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course courseObject = null;
        Teacher instance = new Teacher();
        instance.addCourse(courseObject);
    }
    /**
     * Test of addStudentToCourse method, of class Teacher.
     */
    @Test
    public void testAddStudentToCourse() {
        System.out.println("addStudentToCourse");
        String courseName = "";
        Student object = null;
        Teacher instance = new Teacher();
        instance.addStudentToCourse(courseName, object);
    }
    /**
     * Test of removeStudentFromCourse method, of class Teacher.
     */
    @Test
    public void testRemoveStudentFromCourse() {
        System.out.println("removeStudentFromCourse");
        String courseName = "";
        Student object = null;
        Teacher instance = new Teacher();
        instance.removeStudentFromCourse(courseName, object);
    }
    /**
     * Test of addAssignmentToCourse method, of class Teacher.
     */
    @Test
    public void testAddAssignmentToCourse() {
        System.out.println("addAssignmentToCourse");
        String courseName = "";
        Assignment object = null;
        Teacher instance = new Teacher();
        instance.addAssignmentToCourse(courseName, object);
    }
    /**
     * Test of removeAssignmentFromCourse method, of class Teacher.
     */
    @Test
    public void testRemoveAssignmentFromCourse() {
        System.out.println("removeAssignmentFromCourse");
        String courseName = "";
        Assignment object = null;
        Teacher instance = new Teacher();
        instance.removeAssignmentFromCourse(courseName, object);
    }
    /**
     * Test of addTutorToCourse method, of class Teacher.
     */
    @Test
    public void testAddTutorToCourse() {
        System.out.println("addTutorToCourse");
        String courseName = "";
        Tutor object = null;
        Teacher instance = new Teacher();
        instance.addTutorToCourse(courseName, object);
    }
    /**
     * Test of removeTutorFromCourse method, of class Teacher.
     */
    @Test
    public void testRemoveTutorFromCourse() {
        System.out.println("removeTutorFromCourse");
        String courseName = "";
        Tutor object = null;
        Teacher instance = new Teacher();
        instance.removeTutorFromCourse(courseName, object);
    }

    /**
     * Test of addLectureNotesToCourse method, of class Teacher.
     */
    @Test
    public void testAddLectureNotesToCourse() {
        System.out.println("addLectureNotesToCourse");
        String courseName = "";
        Document object = null;
        Teacher instance = new Teacher();
        instance.addLectureNotesToCourse(courseName, object);

    }

    /**
     * Test of removeLectureNotesFromCourse method, of class Teacher.
     */
    @Test
    public void testRemoveLectureNotesFromCourse() {
        System.out.println("removeLectureNotesFromCourse");
        String courseName = "";
        Document object = null;
        Teacher instance = new Teacher();
        instance.removeLectureNotesFromCourse(courseName, object);

    }

    /**
     * Test of addGradesToCourse method, of class Teacher.
     */
    @Test
    public void testAddGradesToCourse() {
        System.out.println("addGradesToCourse");
        String courseName = "";
        Document object = null;
        Teacher instance = new Teacher();
        instance.addGradesToCourse(courseName, object);
    }
    /**
     * Test of removeGradesFromCourse method, of class Teacher.
     */
    @Test
    public void testRemoveGradesFromCourse() {
        System.out.println("removeGradesFromCourse");
        String courseName = "";
        Document object = null;
        Teacher instance = new Teacher();
        instance.removeGradesFromCourse(courseName, object);
    }
    /**
     * Test of displaySystem method, of class Teacher.
     */
    @Test
    public void testDisplaySystem() {
        System.out.println("displaySystem");
        Teacher instance = new Teacher();
        instance.displaySystem();
    }
    /**
     * Test of toString method, of class Teacher.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Teacher instance = new Teacher("ali");
        String expResult = "Teacher name : ali";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of display method, of class Teacher.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Course object = null;
        Teacher instance = new Teacher();
        instance.display(object);
    }
    /**
     * Test of equals method, of class Teacher.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Teacher object = new Teacher();
        Teacher instance = new Teacher();
        boolean expResult = true;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }  
}

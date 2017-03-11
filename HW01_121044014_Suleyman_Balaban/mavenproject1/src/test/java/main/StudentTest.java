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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getterStudentName method, of class Student.
     */
    @Test
    public void testGetterStudentName() {
        System.out.println("getterStudentName");
        Student instance = new Student("ali");
        String expResult = "ali";
        String result = instance.getterStudentName();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterStudentName method, of class Student.
     */
    @Test
    public void testSetterStudentName_String() {
        System.out.println("setterStudentName");
        String studentName = "ali";
        Student instance = new Student(studentName);
        instance.setterStudentName(studentName);
        String expResult=instance.getterStudentName();
        assertEquals(expResult, studentName);
    }
    /**
     * Test of getterStudentGender method, of class Student.
     */
    @Test
    public void testGetterStudentGender() {
        System.out.println("getterStudentGender");
        Student instance = new Student("ali","He");
        String expResult = "He";
        String result = instance.getterStudentGender();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterStudentGender method, of class Student.
     */
    @Test
    public void testSetterStudentGender() {
        System.out.println("setterStudentGender");
        String studentGender = "He";
        Student instance = new Student("ali","He");
        instance.setterStudentGender(studentGender);
        String expResult=instance.getterStudentGender();
        assertEquals(expResult, studentGender);
    }
    /**
     * Test of addCourse method, of class Student.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
      
        Course courseObject = new Course();
        Student instance = new Student();
        instance.addCourse(courseObject);

    }

    /**
     * Test of enrolMe method, of class Student.
     */
    @Test
    public void testEnrolMe() {
        System.out.println("enrolMe");
        Admin admin=new Admin();
        admin.createSystemSize();
        Course course = new Course();
        Student instance = new Student();
        admin.addCourse(course);
        admin.addStudent(instance);
       
        instance.enrolMe(course);
        
        assertTrue(admin.courseList.get(0).courseStudent.size()!=0);
    }
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Student object = new Student();
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
     
    }
    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("ali","He");
        String expResult = "Student name : ali Gender : He" ;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}

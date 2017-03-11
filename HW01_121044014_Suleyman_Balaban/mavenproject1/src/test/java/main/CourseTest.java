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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getterCourseName method, of class Course.
     */
    @Test
    public void testGetterCourseName() {
        System.out.println("getterCourseName");
        Course instance = new Course("cse 241");
        String expResult = "cse 241";
        String result = instance.getterCourseName();
        assertEquals(expResult, result);
    }
    /**
     * Test of getterCourseTeacherName method, of class Course.
     */
    @Test
    public void testGetterCourseTeacherName() {
        System.out.println("getterCourseTeacherName");
        Course instance = new Course("cse 241","Yusuf Sinan Akgul");
        String expResult = "Yusuf Sinan Akgul";
        String result = instance.getterCourseTeacherName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setterCourseName method, of class Course.
     */
    @Test
    public void testSetterCourseName() {
        System.out.println("setterCourseName");
        String courseName = "cse 254";
        Course instance = new Course("cse 254");
        instance.setterCourseName(courseName);
        assertEquals(courseName,instance.getterCourseName());
    }

    /**
     * Test of setterCourseTeacherName method, of class Course.
     */
    @Test
    public void testSetterCourseTeacherName() {
        System.out.println("setterCourseTeacherName");
        String courseTeacherName = "fatih";
        Course instance = new Course("cse 110","fatih");
        instance.setterCourseTeacherName(courseTeacherName);
        assertEquals(courseTeacherName,instance.getterCourseTeacherName());      
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course();
        String expResult = "Course : unknown course  Teacher : unknown teacher";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of createSystemSize method, of class Course.
     */
    @Test
    public void testCreateSystemSize() {
        System.out.println("createSystemSize");
        Course instance = new Course();
        instance.createSystemSize();
        instance.courseAssignments.add(new Assignment());
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.courseAssignments.size()!=0);
    }
    
}

package com.company.Test;

import com.company.Student;
import org.junit.*;

public class StudentTest extends junit.framework.TestCase {
    public StudentTest() {}

    private Student testStudent;

    @Before
    public void setUp() throws Exception {
        testStudent = new Student("123 Fake St.", 12345, "WI",
                "123-456-7890", "Jordan", 28);
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetName() {
        assertEquals("Jordan", testStudent.getName());
        assertNotSame("Not Jordan", testStudent.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(28, testStudent.getAge());
        assertNotSame(29, testStudent.getAge());
    }

    @Test
    public void testGetStreetAddress() {
        assertEquals("123 Fake St.", testStudent.getStreetAddress());
        assertNotSame("123 Fake St", testStudent.getStreetAddress());
    }

    @Test
    public void testGetZipCode() {
        assertEquals(12345, testStudent.getZipCode());
        assertNotSame(54321, testStudent.getZipCode());
    }

    @Test
    public void testGetState() {
        assertEquals("WI", testStudent.getState());
        assertNotSame("Wisconsin", testStudent.getState());
    }

    @Test
    public void testGetPhone() {
        assertEquals("123-456-7890", testStudent.getPhone());
        assertNotSame("1234567890", testStudent.getPhone());
    }
}

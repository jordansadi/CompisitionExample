package com.company.Test;

import com.company.Address;
import org.junit.*;

public class AddressTest extends junit.framework.TestCase {
    public AddressTest() {}

    private Address testAddress;

    @Before
    public void setUp() throws Exception {
        testAddress = new Address("123 Fake St.", 12345, "WI", "123-456-7890");
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetStreetAddress() {
        assertEquals("123 Fake St.", testAddress.getStreetAddress());
        assertNotSame("123 Fake St", testAddress.getStreetAddress());
    }

    @Test
    public void testGetZipCode() {
        assertEquals(12345, testAddress.getZipCode());
        assertNotSame(54321, testAddress.getZipCode());
    }

    @Test
    public void testGetState() {
        assertEquals("WI", testAddress.getState());
        assertNotSame("Wisconsin", testAddress.getState());
    }

    @Test
    public void testGetPhone() {
        assertEquals("123-456-7890", testAddress.getPhone());
        assertNotSame("1234567890", testAddress.getPhone());
    }
}

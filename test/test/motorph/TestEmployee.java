/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.motorph;

import motorph.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Ortega
 */
public class TestEmployee {

    Employee employee;

    public TestEmployee() {
    }

    @Before
    public void setUp() {
        employee = new Employee();
    }

    @Test
    public void testEmployeeNumber() {
        employee.setEmpNo("1");
        Assert.assertEquals("1", employee.getEmpNo());
    }
}

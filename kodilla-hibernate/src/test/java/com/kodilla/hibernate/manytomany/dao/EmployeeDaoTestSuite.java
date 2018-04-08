package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testNamedQueries() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieSmith = new Employee("Stephanie", "Smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        String lastNameJohn = johnSmith.getLastname();
        employeeDao.save(stephanieSmith);
        String lastNameStephanie = stephanieSmith.getLastname();
        employeeDao.save(lindaKovalsky);
        String lastNameLinda = lindaKovalsky.getLastname();

        //When
        List<Employee> listEmployee = employeeDao.retrieveEmployeesByLastname("Smith");

        //Then
        Assert.assertEquals(2, listEmployee.size());

        //CleanUp
        employeeDao.deleteAll();
    }
}

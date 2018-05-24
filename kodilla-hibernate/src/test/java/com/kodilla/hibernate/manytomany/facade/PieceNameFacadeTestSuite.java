package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PieceNameFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    PieceNameFacade pieceNameFacade;

    @Test
    public void testPieceNameCompany() {
        //Given
        Company softwareZickenZack = new Company("Software Zicken Zack");
        Company dataMakers = new Company("Data Makers");
        Company nothingMatters = new Company("Nothing Matters");

        companyDao.save(softwareZickenZack);
        String softwareZickenZackName = softwareZickenZack.getName();
        int softwareZickenZackId = softwareZickenZack.getId();
        companyDao.save(dataMakers);
        String dataMakersName = dataMakers.getName();
        int dataMakersId = dataMakers.getId();
        companyDao.save(nothingMatters);
        String nothingMattersNamed = nothingMatters.getName();
        int nothingMattersId = nothingMatters.getId();

        //When
        List<Company> listCompany = pieceNameFacade.retrieveCompanyNamesByNameLike("%Zic%");

        //Then
        Assert.assertEquals(1, listCompany.size());

        //ClearUp
        try {
            companyDao.delete(softwareZickenZackId);
            companyDao.delete(dataMakersId);
            companyDao.delete(nothingMattersId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testPieceNameEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieSmith = new Employee("Stephanie", "Smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieSmith);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> listEmployee = pieceNameFacade.retrieveEmployeesByNameLike("%ith%");

        //Then
        Assert.assertEquals(2, listEmployee.size());

        //CleanUp
        employeeDao.deleteAll();
    }
}
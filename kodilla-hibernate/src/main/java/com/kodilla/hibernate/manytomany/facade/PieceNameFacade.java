package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PieceNameFacade {
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public PieceNameFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> retrieveEmployeesByNameLike(String lastName) {
        return employeeDao.retrieveEmployeesByNameLike(lastName);
    }

    public List<Company> retrieveCompanyNamesByNameLike(String company_name) {
        return companyDao.retrieveCompanyNamesByNameLike(company_name);
    }
}

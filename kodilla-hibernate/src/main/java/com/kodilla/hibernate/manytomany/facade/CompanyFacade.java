package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public void addCompany(Company company) {
        companyDao.save(company);
    }

    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void deleteCompany(int id) {
        companyDao.deleteById(id);
    }

    public void deleteEmployee(int id) {
        employeeDao.deleteById(id);
    }

    public List<Company> findByFragment(String text) {
        List<Company> companyList = companyDao.retrieveCompaniesWhereFragmentIs(text);
        if(companyList.size() >= 1) {
            return companyList;
        } else {
            LOGGER.error("There is no company with this fragment");
            return new ArrayList<>();
        }
    }

    public List<Employee> findByLastnameFragment(String text) {
        List<Employee> employeeList = employeeDao.retrieveEmployeesWhereInLastnameIsFragment(text);
        if(employeeList.size() >= 1) {
            return employeeList;
        } else {
            LOGGER.error("There is no employee lastname with this fragment");
            return new ArrayList<>();
        }
    }
}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {
    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void searchCompanyByFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        companyFacade.addCompany(softwareMachine);
        companyFacade.addCompany(dataMaesters);
        companyFacade.addCompany(greyMatter);

        //When
        List<Company> companies = companyFacade.findByFragment("oftwa");

        //Then
        Assert.assertEquals("Software Machine", companies.get(0).getName());
        Assert.assertEquals(1, companies.size());

        //CleanUp
        try {
            companyFacade.deleteCompany(softwareMachine.getId());
            companyFacade.deleteCompany(dataMaesters.getId());
            companyFacade.deleteCompany(greyMatter.getId());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchCompanyByFragmentWhereNoCompany() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        companyFacade.addCompany(softwareMachine);
        companyFacade.addCompany(dataMaesters);
        companyFacade.addCompany(greyMatter);

        //When
        List<Company> companies = companyFacade.findByFragment("ofwardh");

        //Then
        Assert.assertEquals(0, companies.size());

        //CleanUp
        try {
            companyFacade.deleteCompany(softwareMachine.getId());
            companyFacade.deleteCompany(dataMaesters.getId());
            companyFacade.deleteCompany(greyMatter.getId());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchCompanyByFragmentWhereMoreThanOne() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        companyFacade.addCompany(softwareMachine);
        companyFacade.addCompany(dataMaesters);
        companyFacade.addCompany(greyMatter);

        //When
        List<Company> companies = companyFacade.findByFragment("at");

        //Then
        Assert.assertEquals(2, companies.size());

        //CleanUp
        try {
            companyFacade.deleteCompany(softwareMachine.getId());
            companyFacade.deleteCompany(dataMaesters.getId());
            companyFacade.deleteCompany(greyMatter.getId());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void searchEmployeeLastnameByFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        companyFacade.addEmployee(johnSmith);
        companyFacade.addEmployee(stephanieClarckson);
        companyFacade.addEmployee(lindaKovalsky);

        //When
        List<Employee> employees = companyFacade.findByLastnameFragment("ith");

        //Then
        Assert.assertEquals("Smith", employees.get(0).getLastname());
        Assert.assertEquals(1, employees.size());

        //CleanUp
        try {
            companyFacade.deleteEmployee(johnSmith.getId());
            companyFacade.deleteEmployee(stephanieClarckson.getId());
            companyFacade.deleteEmployee(lindaKovalsky.getId());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void searchEmployeeLastnameByFragmentWhereNoEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        companyFacade.addEmployee(johnSmith);
        companyFacade.addEmployee(stephanieClarckson);
        companyFacade.addEmployee(lindaKovalsky);

        //When
        List<Employee> employees = companyFacade.findByLastnameFragment("ohngte");

        //Then
        Assert.assertEquals(0, employees.size());

        //CleanUp
        try {
            companyFacade.deleteEmployee(johnSmith.getId());
            companyFacade.deleteEmployee(stephanieClarckson.getId());
            companyFacade.deleteEmployee(lindaKovalsky.getId());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchEmployeeByFragmentWhereMoreThanOne() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        companyFacade.addEmployee(johnSmith);
        companyFacade.addEmployee(stephanieClarckson);
        companyFacade.addEmployee(lindaKovalsky);

        //When
        List<Employee> employees = companyFacade.findByLastnameFragment("o");

        //Then
        Assert.assertEquals(2, employees.size());

        //CleanUp
        try {
            companyFacade.deleteEmployee(johnSmith.getId());
            companyFacade.deleteEmployee(stephanieClarckson.getId());
            companyFacade.deleteEmployee(lindaKovalsky.getId());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
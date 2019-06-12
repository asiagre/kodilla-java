package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        Company company = companyFacade.findByFragment("oftwa").get();

        //Then
        Assert.assertEquals("Software Machine", company.getName());

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

        //When&Then
        try {
            Company company = companyFacade.findByFragment("ofwardh").get();
        } catch (SearchingException e) {
            e.getMessage();
        }

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

        //When&Then
        try {
            Company company = companyFacade.findByFragment("at").get();
        } catch (SearchingException e) {
            e.getMessage();
        }

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
        Employee employee = companyFacade.findByLastnameFragment("ith").get();

        //Then
        Assert.assertEquals("Smith", employee.getLastname());

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

        //When&Then
        try {
            Employee employee = companyFacade.findByLastnameFragment("ohngte").get();
        } catch (SearchingException e) {
            e.getMessage();
        }

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

        //When&Then
        try {
            Employee employee = companyFacade.findByLastnameFragment("h").get();
        } catch (SearchingException e) {
            e.getMessage();
        }

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
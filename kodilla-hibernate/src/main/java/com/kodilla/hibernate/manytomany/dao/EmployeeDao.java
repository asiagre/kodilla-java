package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Override
    Employee save(Employee employee);

    void deleteById(int id);

    List<Employee> retrieveEmployeeByLastname(@Param("LASTNAME") String lastname);

    List<Employee> retrieveEmployeesWhereInLastnameIsFragment(@Param("LASTNAME") String test);
}

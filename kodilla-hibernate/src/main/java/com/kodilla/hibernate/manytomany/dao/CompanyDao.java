package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Override
    Company save(Company company);

    void deleteById(int id);

    List<Company> retrieveCompaniesWhereThreeLetters(@Param("TEXT") String text);

    List<Company> retrieveCompaniesWhereFragmentIs(@Param("NAME") String text);

}

package com.example.SpringDataSpringBoot.dao;

import com.example.SpringDataSpringBoot.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    Employee findByFirstname(String firstname);

    Employee findByLastname(String lastname);

    @Query(value= "select * from employees where age > :age order by firstname, lastname DESC ", nativeQuery = true)
    List<Employee> findByMinAge(@Param("age") int age);

}

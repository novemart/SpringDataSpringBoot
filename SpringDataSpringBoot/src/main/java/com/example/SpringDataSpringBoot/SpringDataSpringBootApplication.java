package com.example.SpringDataSpringBoot;

import com.example.SpringDataSpringBoot.dao.EmployeeDao;
import com.example.SpringDataSpringBoot.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataSpringBootApplication implements CommandLineRunner {

	@Autowired
	EmployeeDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataSpringBootApplication.class, args);
	}

	@Override
	public void run(String ...arg0)throws Exception{
		Employee e = new Employee();
		e.setFirstname("Daniel");
		e.setLastname("Ricciardo");
		e.setAge(32);
		System.out.println(dao.findByFirstname("Max"));
		System.out.println(dao.findAll());
		System.out.println(dao.findByLastname("Verstappen"));
		System.out.println(dao.save(e));
		System.out.println(dao.findAll());
		System.out.println(dao.findByMinAge(30));
	}
}

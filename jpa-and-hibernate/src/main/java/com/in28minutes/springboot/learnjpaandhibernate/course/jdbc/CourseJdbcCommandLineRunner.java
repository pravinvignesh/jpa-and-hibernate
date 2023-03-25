package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		
		/*
		 * repository.insert(new Course(2,"Vicky","Vigneshh")); repository.insert(new
		 * Course(3,"vVicky","vVigneshh")); repository.delete(2);
		 * System.out.println(repository.select(3));
		 */
		
		repository.save(new Course(2,"Vicky","Vigneshh"));
		repository.save(new Course(3,"cVicky","cVigneshh"));
		repository.save(new Course(4,"prathik","kannan"));
		repository.deleteById(2l);
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.findByAuthor("cVigneshh"));
		System.out.println(repository.findByName("prathik"));
	}

}

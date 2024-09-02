package com.luvienze.cruddemo;

import com.luvienze.cruddemo.dao.StudentDao;
import com.luvienze.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (StudentDao studentDao)
	{
		return runner ->{
			createStudent(studentDao);
		};
	}

	private void createStudent(StudentDao studentDao) {

		// create the student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Paul","Doe","paul@gmail.com");

		// save the student object
		System.out.println("Saving the student ....");
		studentDao.save(tempStudent);

		// display the id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}

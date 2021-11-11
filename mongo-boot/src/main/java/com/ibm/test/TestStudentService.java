package com.ibm.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.ibm.model.Student;
import com.ibm.service.StudentService;

@ExtendWith(SpringExtensions.class)
public class TestStudentService {
	
	private StudentService service;
	
	@Test
	public void testSave() {
		Student s1=new Student();
		s1.setName("krish");
		s1.setRollNo(145);
		s1.setSchool("prathibha");
		
		service.save(s1);
	}
	
	@Test
	public void testFetch() {
		
		Student s1=service.fetch(145);
		assertNotNull(s1);
	}

	
	@Test
	public void testInvalidFetch() {
		
		Student s1=service.fetch(145);
		assertNotNull(s1);
	}
	
	@Test
	public void testFetchAll() {
		List<Student> students=service.fetchAll();
		assertNotNull(students);
		
	}
}

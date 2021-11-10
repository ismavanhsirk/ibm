package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Student;
import com.ibm.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public Student fetch(int rollNo) {
		// TODO Auto-generated method stub
		return repo.findById(rollNo).get();
	}

	@Override
	public List<Student> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

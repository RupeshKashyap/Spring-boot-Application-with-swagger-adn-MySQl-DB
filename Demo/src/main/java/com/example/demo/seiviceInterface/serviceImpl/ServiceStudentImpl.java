package com.example.demo.seiviceInterface.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.seiviceInterface.ServiceStudentInterface;

@Service
public class ServiceStudentImpl implements  ServiceStudentInterface{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public ArrayList<Student> getStudent() {
		System.out.println("getstudent  service method executing");
		
		List<Student> list = new ArrayList<Student>();
		List list1;
		
		list=studentRepository.findAll();
		for(Student  s:list) {
			System.out.println(s);
		}
		
		return (ArrayList<Student>) list;
	}
	
	@Override
	public void saveStudent(Student student) {
		
		studentRepository.save(student);
	}
	
	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}
	
	@Override
	public void updateStudent(Integer id, Student student) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		student.setSt_id(id);
		studentRepository.save(student);
		
	}

}

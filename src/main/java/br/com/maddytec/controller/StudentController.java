package br.com.maddytec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.entity.Student;
import br.com.maddytec.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(value="/student", method= RequestMethod.GET)
	public List<Student> listStudent(){
		return this.studentRepository.findAll();
	}
}

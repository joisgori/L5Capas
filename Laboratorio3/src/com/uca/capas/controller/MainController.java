package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

import java.util.*;;

@Controller
public class MainController {
	
	@Autowired
	private StudentDAO studentDao;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Student> students = null;
		try {
			students = studentDao.findAll();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		mav.addObject("students", students);
		mav.setViewName("main");
		return mav;
	}
	
	/*
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message", "Bienvenidos a MVC");
		//mav.addObject("titulo2", "Acá presento mis resultados del uso de tag");
		|return mav;
	}
	*/
	/*
	@RequestMapping(value = "/formData", method = RequestMethod.POST)
	public ModelAndView formData(@RequestParam(value = "name") String name, @RequestParam(value = "lName") String lName,
			@RequestParam(value = "bdate") String bDate,  @RequestParam(value = "career") String career,
			@RequestParam(value = "experience") String experience) {
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setName(name);
		student.setLastName(lName);
		student.setbDate(bDate);
		student.setCareer(career);
		student.setExperience(experience);
		mav.setViewName("form");
		mav.addObject("student", student);
		
		return mav;
		
	}*/
}

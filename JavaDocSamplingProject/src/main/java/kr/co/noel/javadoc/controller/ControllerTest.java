package kr.co.noel.javadoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.noel.javadoc.service.ServiceTest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/sample")
@Slf4j
public class ControllerTest {

	@Autowired
	ServiceTest serviceTest;
	
	@RequestMapping(value="/test/{value_1}/{value_2}/{value_3}", method=RequestMethod.GET)
	public String sampleTestMapper() {
		
		return "index_test"; 
	}
}

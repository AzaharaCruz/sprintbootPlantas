package com.main.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class ApiHolaMundo {

	@RequestMapping(method = RequestMethod.GET)
	public String holaMundo() {
		//TODO CONEXION A BBDD
		return "12345ASDF";
	}
}

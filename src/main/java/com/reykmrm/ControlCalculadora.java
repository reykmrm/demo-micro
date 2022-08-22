package com.reykmrm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlCalculadora {
	@GetMapping("/suma/{a}/{b}")
	public Respuesta sumarNumero(@PathVariable int a, @PathVariable int b) {
		Respuesta rs = new Respuesta(a, b, a+b);
		return rs;
	}

}

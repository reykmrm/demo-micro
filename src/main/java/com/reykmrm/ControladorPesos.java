package com.reykmrm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ControladorPesos {
	
	@Value("${app.message.pesos}")
	private Double pesos;
	
	@GetMapping("dolar/{a}")
	public Moneda dolar(@PathVariable Double a) {
		Moneda moneda = new Moneda();
		moneda.setDolar(a * pesos);
		moneda.setPesos(a);
		return moneda;
		
	}
	
	@GetMapping("pesos/{a}")
	public Moneda pesos(@PathVariable Double a) {
		Moneda moneda = new Moneda();
		moneda.setPesos(a / pesos);
		moneda.setDolar(a);
		return moneda;	
	}

}

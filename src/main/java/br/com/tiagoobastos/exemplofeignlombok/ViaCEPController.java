package br.com.tiagoobastos.exemplofeignlombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("viacep")
public class ViaCEPController {
	
	@Autowired
	ViaCEPInterface viaCEPInterface;
	
	@GetMapping
	public ViaCEP getViaCEP() {
	
		return viaCEPInterface.getViaCEP();

	}
	
	
	
}

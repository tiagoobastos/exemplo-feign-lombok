package br.com.tiagoobastos.exemplofeignlombok;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "viacep.com.br/ws/23017347/json/")
public interface ViaCEPInterface {
	@RequestMapping(method = RequestMethod.GET, value = "")
	ViaCEP getViaCEP();
}

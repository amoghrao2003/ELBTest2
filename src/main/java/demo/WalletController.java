package demo;

import java.net.URI;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WalletController {
	
	
	@RequestMapping(value = "/ap1/v1/helloELB", method = RequestMethod.GET)
	public String getCounter() {
		return "Hello World From ELB 8091";
	}
	
}

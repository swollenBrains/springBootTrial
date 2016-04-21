package trial.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrialController {

	@RequestMapping("/healthcheck")
    public String index() {
        return "This is healthy";
    }
	
}

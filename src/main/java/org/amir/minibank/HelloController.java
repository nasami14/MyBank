package org.amir.minibank;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/api/createuser")
    public String index() {
    	// call service
    	
        return "Hi Amir, How are you?";
    }
    
}

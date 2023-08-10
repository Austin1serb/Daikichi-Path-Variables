package daikichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.invoker.PathVariableArgumentResolver;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}

	@RequestMapping("/today")
	public String today() {
		return "Today you will find lick in all your endeavors!";

	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arives, so be sure to be open to new ideas!";

	}
	@RequestMapping("/travel/{location}")
	public String travelDesination(@PathVariable("location") String location) {
		return "Congratulations, you will soon travel to " + location + "!";
	}
	@RequestMapping("/lotto/{number}")
	public String lottoNumber(@PathVariable("number") int number) {
		//if number is even
		if(number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        }
        //if number is odd
        else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
        }
       
    }
	
	

}

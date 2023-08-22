package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class MyController {

	private final GreetingService greetingService;

	/**
	 * @Autowired is not needed in constructor
	 * @param greetingService
	 */
	public MyController(@Qualifier("i18nService") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String sayHallo()
	{
		return greetingService.sayGreeting();
	}

}

package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

	SetterInjectedController underTest;

	@BeforeEach
	void setUp()
	{
		underTest = new SetterInjectedController();
		underTest.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void getGreeting()
	{
		System.out.println(underTest.getGreeting());
	}
}
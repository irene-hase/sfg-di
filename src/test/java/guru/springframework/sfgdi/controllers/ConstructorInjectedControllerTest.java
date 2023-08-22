package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

@Service
class ConstructorInjectedControllerTest {

	ConstructorInjectedController underTest;

	@BeforeEach
	void setUp()
	{
		underTest = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void getGreeting()
	{
		System.out.println(underTest.getGreeting());
	}
}
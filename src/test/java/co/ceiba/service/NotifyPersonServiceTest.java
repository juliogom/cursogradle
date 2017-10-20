package co.ceiba.service;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {

	private NotyfyPersonService notifyPersonService;
	private EmailService emailService;

	@Before
	public void setUp() {
		emailService = emailService=Mockito.mock(EmailService.class);;
		notifyPersonService = new NotyfyPersonService(emailService);
	}

	@Test
	public void notifyTest() {
		// Arrange
		Person person = new PersonTestDataBuilder().build();
		//Person person=mock(Person.class);
		
		// Act
		Mockito.when(emailService.EnviarEmail(Mockito.anyString())).thenReturn("Hello Soft");
		
		String message = emailService.EnviarEmail("Ceiba");
		
		// Assert
		Assert.assertEquals("Hello Soft",message);

	}

}

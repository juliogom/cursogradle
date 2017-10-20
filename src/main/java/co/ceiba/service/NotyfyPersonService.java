package co.ceiba.service;

import co.ceiba.domain.Person;

public class NotyfyPersonService {

	private EmailService emailService;

	public NotyfyPersonService(EmailService emailService) {
		super();

		this.emailService = emailService;
	}
	
	public String notify(Person person) {
		
		String message="Welcome "+person.getName();
		
		
		return emailService.EnviarEmail(message);
	}
	
}

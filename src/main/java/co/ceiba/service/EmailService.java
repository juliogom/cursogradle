package co.ceiba.service;

public class EmailService {
	
	private String message;
	
	public String EnviarEmail(String message) {
		this.message=message;
		return this.message;
	}
	
}

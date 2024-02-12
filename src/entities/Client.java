package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
//	ATRIBUTOS
	private String name;
	private String email;
	private Date birthDate;
	
//	CONSTRUTORES
	public Client() {}
	public Client(String name, String email, Date birthDate) {
		setName(name);
		setEmail(email);
		setBirthDate(birthDate);
	}
	
//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " (" + sdf.format(getBirthDate()) + ") " + getEmail());
		return sb.toString();
	}
}
package model;

public class Utente {
	
	private String userName;
	private String email;
	private String password;
	private RosaUtente rosa;
	
	public Utente() {
	}
	
	public Utente(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public RosaUtente getRosa() {
		return rosa;
	}

	public void setRosa(RosaUtente rosa) {
		this.rosa = rosa;
	}

	public boolean equals(Object object) {
		Utente utente = (Utente)object;
		return (this.getEmail() == utente.getEmail());
	}
	

}
package sn.lamp.bean;

public class UtilisateurBean {
	private int id;
	private String nom;
	private String email;
	private String login;
	private String profil;
	private String mot_de_pass;
	public UtilisateurBean() {
		// TODO Auto-generated constructor stub
	}
	public UtilisateurBean(String nom, String email, String login, String profil, String mot_de_pass) {
		super();
		this.nom = nom;
		this.email = email;
		this.login = login;
		this.profil = profil;
		this.mot_de_pass = mot_de_pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public String getMot_de_pass() {
		return mot_de_pass;
	}
	public void setMot_de_pass(String mot_de_pass) {
		this.mot_de_pass = mot_de_pass;
	}
	
	
	

}

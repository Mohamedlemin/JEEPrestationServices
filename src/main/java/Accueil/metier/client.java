package Accueil.metier;

public class client {
	private long id;
	private String nom,prenom,telephone,username,password,type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", username="
				+ username + ", password=" + password + ", type=" + type + "]";
	}
	public void setType(String type) {
		this.type = type;
	}
	public client(String nom, String prenom, String telephone, String username, String password, String type) {
		super();
//		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.username = username;
		this.password = password;
		this.type = type;
	}
	public client() {
		// TODO Auto-generated constructor stub
	}
	
}
package ChefService.metier;

public class chefprojet {
	String nom,prenom,username,password,tel;
	Long id,service;
	public chefprojet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chefprojet(String nom, String prenom, String username, String password, String tel, Long service) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.service = service;
	}
	
	
	public chefprojet(String nom, String prenom, String username, String password, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.tel = tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getService() {
		return service;
	}
	public void setService(Long service) {
		this.service = service;
	}
	
	

}

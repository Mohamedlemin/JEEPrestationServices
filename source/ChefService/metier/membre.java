package ChefService.metier;

public class membre {

	String nom,prenom,tel;
	Long id,service;
	public membre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public membre(String nom, String prenom, String tel, Long service) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.service = service;
	}
	
	
	
	public membre(String nom, String prenom, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

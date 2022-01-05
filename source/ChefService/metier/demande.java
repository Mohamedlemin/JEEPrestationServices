package ChefService.metier;

import java.sql.Date;

public class demande {
	String status,description,delais;
	
	Long id;
	int client,accueil,service;
	public demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public demande(String status, String description,String delais, int client, int accueil, int service) {
		super();
		this.status = status;
		this.description = description;
		this.delais = delais;
		this.client = client;
		this.accueil = accueil;
		this.service = service;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDelais() {
		return delais;
	}
	public void setDelais(String delais) {
		this.delais = delais;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getClient() {
		return client;
	}
	public void setClient(int client) {
		this.client = client;
	}
	public int getAccueil() {
		return accueil;
	}
	public void setAccueil(int accueil) {
		this.accueil = accueil;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	

}

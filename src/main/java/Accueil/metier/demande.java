package Accueil.metier;

public class demande {
	String client,accuiel,service,status,description,date_creation;
	Long id;

	public demande(String description,String client, String accuiel, String service, String date_creation,String status) {
		super();
		
		this.client = client;
		this.accuiel = accuiel;
		this.service = service;
		this.date_creation = date_creation;
		this.description = description;
		this.status = status;
		
	}
	@Override
	public String toString() {
		return "demande [client=" + client + ", accuiel=" + accuiel + ", service=" + service + ", id=" + id
				+ ", status=" + status + ", description=" + description + ", date_creation="
				+ date_creation + "]";
	}
	public demande() {
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getAccuiel() {
		return accuiel;
	}
	public void setAccuiel(String accuiel) {
		this.accuiel = accuiel;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
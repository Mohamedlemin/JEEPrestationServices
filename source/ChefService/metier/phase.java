package ChefService.metier;

import java.sql.Date;

public class phase {
	String nom,description,status,delais;
	
	double budget;
	
	
	Long id,projet;


	public phase() {
		super();
		// TODO Auto-generated constructor stub
	}


	public phase(String nom, String description, String status, String delais, double budget, Long projet) {
		super();
		this.nom = nom;
		this.description = description;
		this.status = status;
		this.delais = delais;
		this.budget = budget;
		this.projet = projet;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDelais() {
		return delais;
	}


	public void setDelais(String delais) {
		this.delais = delais;
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getProjet() {
		return projet;
	}


	public void setProjet(Long projet) {
		this.projet = projet;
	}
	
	

}

package ChefService.metier;

import java.sql.Date;

public class projet {
	String description,delais;
	
	double budgetTotal,budget;
	
	
	Long id,service,client,chefprojet;


	public projet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public projet(String description, String delais, double budgetTotal, double budget, Long service, Long client,
			Long chefprojet) {
		super();
		this.description = description;
		this.delais = delais;
		this.budgetTotal = budgetTotal;
		this.budget = budget;
		this.service = service;
		this.client = client;
		this.chefprojet = chefprojet;
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


	public double getBudgetTotal() {
		return budgetTotal;
	}


	public void setBudgetTotal(double budgetTotal) {
		this.budgetTotal = budgetTotal;
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


	public Long getService() {
		return service;
	}


	public void setService(Long service) {
		this.service = service;
	}


	public Long getClient() {
		return client;
	}


	public void setClient(Long client) {
		this.client = client;
	}


	public Long getChefprojet() {
		return chefprojet;
	}


	public void setChefprojet(Long chefprojet) {
		this.chefprojet = chefprojet;
	}
	
	

}

package ChefService.metier;

public class Service {
String nams;
Long id,id_chef;
public Service() {
	super();
	// TODO Auto-generated constructor stub
}
public Service(String nams, Long id_chef) {
	super();
	this.nams = nams;
	this.id_chef = id_chef;
}
public String getNams() {
	return nams;
}
public void setNams(String nams) {
	this.nams = nams;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getId_chef() {
	return id_chef;
}
public void setId_chef(Long id_chef) {
	this.id_chef = id_chef;
}


}

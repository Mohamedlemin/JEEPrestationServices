package ChefService.dao;

import java.util.List;

import ChefService.metier.chefprojet;
import ChefService.metier.demande;



public interface demandedao {
	public List<demande> listDemande(Long id_chef);
	public demande getDemande(Long id);


}

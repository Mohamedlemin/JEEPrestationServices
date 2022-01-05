package ChefService.dao;

import java.util.List;

import ChefService.metier.chefprojet;
import ChefService.metier.projet;

public interface projetdao {
	public List<projet> listProjet(Long id_chef);
   public void saveProjet(projet p);
	public void deleteProjet(Long id);
	public projet getProjet(Long id);
	public void updateProjet(projet p);
	
}

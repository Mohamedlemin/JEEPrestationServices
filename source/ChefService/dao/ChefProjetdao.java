package ChefService.dao;

import java.util.List;

import ChefService.metier.chefprojet;

public interface ChefProjetdao {
	public List<chefprojet> listChefProjet(Long id_chef);
	public List<chefprojet> ChefParMc(Long id_chef,String mc);
	public void saveChefProjet(chefprojet ch);
	public void deleteChef(Long id);
	public chefprojet getChef(Long id);
	public void updateChef(chefprojet ch);
	

}

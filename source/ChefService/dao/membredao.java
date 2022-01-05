package ChefService.dao;

import java.util.List;

import ChefService.metier.chefprojet;
import ChefService.metier.membre;



public interface membredao {
	public List<membre> listMembre(Long id_chef);
	public void saveMembre(membre m);
	public void deleteMembre(Long id);
	public membre getMembre(Long id);
	public void updateMembre(membre m);
	public List<membre> MembreParMc(Long id_chef,String mc);

}

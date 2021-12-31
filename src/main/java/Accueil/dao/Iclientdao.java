package Accueil.dao;

import java.util.List;

import Accueil.metier.client;
import Accueil.metier.demande;
public interface Iclientdao {
	public client save(client c);
    public List<client> clientParMC();
	public client getclient(long id);
	public client update(client c);
	public void deleteclient(long id);
	public demande saved(demande c);
    public List<demande> demandeParMC();
    public List<String> serviceParMC();
    public List<String> aParMC();
	public demande getdemande(long id);
	public demande updatedemande(demande c);
	public void deletedemande(long id);

}

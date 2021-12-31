package Accueil.web;

import java.util.ArrayList;
import java.util.List;
import Accueil.metier.demande;

public class demandeModel {
private List<demande>demandes=new ArrayList<demande>();

public List<demande> getDemandes() {
	return demandes;
}

public void setDemandes(List<demande> demandes) {
	this.demandes = demandes;
}


}

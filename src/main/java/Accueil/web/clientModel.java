package Accueil.web;

import java.util.ArrayList;
import java.util.List;

import Accueil.metier.client;
public class clientModel {
	private List<client> clients=new ArrayList<client>();
	public List<client> getclients() {
		return clients;
	}
	public void setClients(List<client> clients) {
		this.clients = clients;
	}

}

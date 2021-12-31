package Accueil.dao;

import java.util.List;
import metier.client;
import metier.demande;



public class TEestDqo {
	public static void main(String[] args) {
	clientdaoimpl dao=new clientdaoimpl();
//	List<demande>Prods=dao.demandeParMC();
//	System.out.println(Prods.get(0).toString());
//	client p1 =dao.getclient(10);
	double d=60;
	demande p2=new demande();
	
	p2=new demande("meimouna","selmina","Aminata","metenace","2021-12-22 18:39:44","aaaaa");
	p2.setId((long) (9));
demande p21 =dao.saved(p2);
	System.out.println(p21.toString());
	
}}
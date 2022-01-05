package ChefService.web;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import ChefService.dao.ChefProjetdao;
import ChefService.dao.ChefProjetdaoImpl;
import ChefService.dao.demandedao;
import ChefService.dao.demandedaoImpl;
import ChefService.dao.membredao;
import ChefService.dao.membredaoImpl;
import ChefService.dao.projetdao;
import ChefService.dao.projetdaoImpl;
import ChefService.dao.servicedao;
import ChefService.dao.servicedaoImpl;
import ChefService.metier.ChefService;
import ChefService.metier.Service;
import ChefService.metier.chefprojet;
import ChefService.metier.demande;
import ChefService.metier.membre;
import ChefService.metier.projet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(name="cs",urlPatterns={"*.php","/maservlet"})
public class maServlet extends HttpServlet {
	private demandedao  dao;
	private ChefProjetdao dao1;
	private projetdao dao2;
	private membredao dao3;
	private servicedao  dao4;
	@Override
	public void init() throws ServletException {
	dao=new demandedaoImpl();
	dao1=new ChefProjetdaoImpl();
	dao2=new projetdaoImpl();
	dao3=new membredaoImpl();
	dao4=new servicedaoImpl();
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String path=req.getServletPath();
		 if(path.equals("/index.php")) {
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/index.jsp").forward(req, resp);
			 }
		 
		 else if(path.equals("/demande.php")) {
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			
			 List<demande> demandes=dao.listDemande(id);
			 req.setAttribute("demandes", demandes);
			 req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/demande.jsp").forward(req, resp);
			 
		 }
		 
		 
		 else if(path.equals("/chefProjet.php")) {
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			 List<chefprojet> chefprojets=dao1.listChefProjet(id);
			 Service service=dao4.getService(id);
			 req.setAttribute("service", service);
			 req.setAttribute("chefprojets", chefprojets);
			 req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/chefProjet.jsp").forward(req, resp);
			 
			 
			 
			 
		 }
		 
		 else if(path.equals("/projet.php")) {
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			 List<projet> projets=dao2.listProjet(id);
			 req.setAttribute("projets", projets);
			 req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/projet.jsp").forward(req, resp);
			 
			 
			 
			 
		 }
		 
		 else if(path.equals("/supprimerProjet.php")) {
			 Long id=Long.parseLong(req.getParameter("id"));
			 dao2.deleteProjet(id);
			 resp.sendRedirect("/ChefService/projet.php");
			 
		 }
		 
		 else if(path.equals("/membre.php")) {
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			 List<membre> membres=dao3.listMembre(id);
			 Service service=dao4.getService(id);
			 req.setAttribute("service", service);
			 req.setAttribute("membres", membres);
			 req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/membre.jsp").forward(req, resp);
			 
			 
			 
			 
		 }
		 else if(path.equals("/updateMembre.php")) {
			 String nom=req.getParameter("nom");
			 String prenom=req.getParameter("prenom");
			
			 String tel=req.getParameter("tel");
			 Long id=Long.parseLong(req.getParameter("id"));
			 membre m=new membre(nom,prenom,tel);
			 m.setId(id);
			 dao3.updateMembre(m);
			 resp.sendRedirect("/ChefService/membre.php");
			 
		 }
		 
		 else if(path.equals("/chercherMembre.php")) {
			 String mot=req.getParameter("mot");
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			 List<membre> membres=dao3.MembreParMc(id,mot);
			 Service service=dao4.getService(id);
			 req.setAttribute("service", service);
			 req.setAttribute("membres", membres);
			 req.setAttribute("chef", chef);
			 req.setAttribute("mot", mot);
			 req.getRequestDispatcher("ChefService/membre.jsp").forward(req, resp);
		 }
		 
		 else if(path.equals("/supprimerMembre.php")) {
			 Long id=Long.parseLong(req.getParameter("id"));
			 dao3.deleteMembre(id);
			 resp.sendRedirect("/ChefService/membre.php");
			 
		 }
		 
		 else if(path.equals("/modifierMembre.php")) {
			 Long id=Long.parseLong(req.getParameter("id"));
		
			 membre c=dao3.getMembre(id);
			 req.setAttribute("chefprojet", c);
			  HttpSession session = req.getSession(); ChefService
			  chef=(ChefService)session.getAttribute("usersession");
			  req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/modifierMembre.jsp").forward(req, resp);
			 
			
			 
		 }
		 
		 
		 else if(path.equals("/saveMembre.php") && (req.getMethod().equals("POST"))) {
			 String nom=req.getParameter("nom");
			 String prenom=req.getParameter("prenom");
			 String tel=req.getParameter("tel");
			 Long serv=Long.parseLong(req.getParameter("serv"));
			 membre m=new membre(nom,prenom,tel,serv);
			 dao3.saveMembre(m);
			 resp.sendRedirect("/ChefService/membre.php");
		 }
		 
		 else if(path.equals("/ajoutProjet.php")) {
			 Long idd=Long.parseLong(req.getParameter("id"));
			 demande d=dao.getDemande(idd);
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			 List<chefprojet> chefprojets=dao1.listChefProjet(id);
			 req.setAttribute("chefprojets", chefprojets);
			 req.setAttribute("demande", d);
			 req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/ajoutProjet.jsp").forward(req, resp);
			 
			 
			 
			 
		 }
		 
		 else if(path.equals("/SaveProjet.php") && (req.getMethod().equals("POST"))) {
				String desc=req.getParameter("desc");
				String delais=req.getParameter("delais");
				Double budgetTotal=Double.parseDouble(req.getParameter("budgetTotal"));
				Double budget=Double.parseDouble(req.getParameter("budget"));
				Long client=Long.parseLong(req.getParameter("client"));
				Long service=Long.parseLong(req.getParameter("serv"));
				Long chefs=Long.parseLong(req.getParameter("chef"));
				projet p=new projet(desc,delais,budgetTotal,budget,service,client,chefs);
				dao2.saveProjet(p);
				
				
			
				  HttpSession session = req.getSession(); ChefService
				  chef=(ChefService)session.getAttribute("usersession");
				  Long id=chef.getId();
				  List<projet> projets=dao2.listProjet(id); req.setAttribute("projets",
				  projets); req.setAttribute("chef", chef);
				  req.getRequestDispatcher("ChefService/projet.jsp").forward(req, resp);
				 
				 
}
		 
		 else if(path.equals("/saveChef.php") && (req.getMethod().equals("POST"))) {
			 String nom=req.getParameter("nom");
			 String prenom=req.getParameter("prenom");
			 String user=req.getParameter("user");
			 String pass=req.getParameter("pass");
			 String tel=req.getParameter("tel");
			 Long serv=Long.parseLong(req.getParameter("serv"));
			 chefprojet chefprojet=new chefprojet(nom,prenom,user,pass,tel,serv);
			 dao1.saveChefProjet(chefprojet);
			 resp.sendRedirect("/ChefService/chefProjet.php");
		 }
		 
		 else if(path.equals("/supprimerChef.php")) {
			 Long id=Long.parseLong(req.getParameter("id"));
			 dao1.deleteChef(id);
			 resp.sendRedirect("/ChefService/chefProjet.php");
			 
		 }
		 
		 
		 else if(path.equals("/modifierChefProjet.php")) {
			 Long id=Long.parseLong(req.getParameter("id"));
		
			 chefprojet c=dao1.getChef(id);
			 req.setAttribute("chefprojet", c);
			  HttpSession session = req.getSession(); ChefService
			  chef=(ChefService)session.getAttribute("usersession");
			  req.setAttribute("chef", chef);
			 req.getRequestDispatcher("ChefService/modifierChef.jsp").forward(req, resp);
			 
			
			 
		 }
		 
		 else if(path.equals("/updateChef.php")) {
			 String nom=req.getParameter("nom");
			 String prenom=req.getParameter("prenom");
			 String user=req.getParameter("user");
			 String pass=req.getParameter("pass");
			 String tel=req.getParameter("tel");
			 Long id=Long.parseLong(req.getParameter("id"));
			 chefprojet chefprojet=new chefprojet(nom,prenom,user,pass,tel);
			 chefprojet.setId(id);
			 dao1.updateChef(chefprojet);
			 resp.sendRedirect("/ChefService/chefProjet.php");
			 
		 }
		 else if(path.equals("/chercherChef.php")) {
			 String mot=req.getParameter("mot");
			 HttpSession session = req.getSession();
			 ChefService chef=(ChefService)session.getAttribute("usersession");
			 Long id=chef.getId();
			 List<chefprojet> chefprojets=dao1.ChefParMc(id,mot);
			 Service service=dao4.getService(id);
			 req.setAttribute("service", service);
			 req.setAttribute("chefprojets", chefprojets);
			 req.setAttribute("chef", chef);
			 req.setAttribute("mot", mot);
			 req.getRequestDispatcher("ChefService/chefProjet.jsp").forward(req, resp);
		 }
		 
		
		 
		 }
		 
		
		
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}

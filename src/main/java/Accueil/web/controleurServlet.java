package Accueil.web;
import java.io.IOException;
import java.util.List;

import org.apache.catalina.connector.Response;

import Accueil.dao.Iclientdao;
import Accueil.dao.clientdaoimpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Accueil.metier.client;
import Accueil.metier.demande;
@WebServlet(name="cs",urlPatterns= {"/controleur","*.php"})
public class controleurServlet extends  HttpServlet{
	private Iclientdao metier;
	public void init()throws ServletException{
		
	 metier=new clientdaoimpl();
	 
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if(path.equals("/index.php")) {
			
			request.getRequestDispatcher("Accueil/index.jsp").forward(request,response);
			
		}
		else
		if(path.equals("/Client.php")) {
			clientModel model=new clientModel();
			List<client>clients=metier.clientParMC();
			model.setClients(clients);
			request.setAttribute("client",new client());
			request.setAttribute("model", model);
			request.getRequestDispatcher("Accueil/Client.jsp").forward(request,response);
			
		}
		else 
			if(path.equals("/saveClient.php")&&(request.getMethod().equals("POST"))) {
			String name=request.getParameter("name");
			String prenom=request.getParameter("Prenom");
			String telephone=request.getParameter("telephone");
			String username=request.getParameter("username");
			String type=request.getParameter("type");
			String p="32ft5tgdh565";
			client c=metier.save(new client(name,prenom,telephone,username,p,type));
			request.setAttribute("client",c);
			response.sendRedirect("Client.php");
		}
			else if(path.equals("/sup.php")) {
				Long id=Long.parseLong(request.getParameter("id"));
				metier.deleteclient(id);
				//request.getRequestDispatcher("produit.jsp").forward(request,response);
				response.sendRedirect("Client.php");
			}
			else if(path.equals("/edit.php")) {
				Long id=Long.parseLong(request.getParameter("id"));
				client c=metier.getclient(id);
				request.setAttribute("client",c);
				request.getRequestDispatcher("Accueil/Editclient.jsp").forward(request,response);
				}
			else 
				if(path.equals("/Updateclient.php")&&(request.getMethod().equals("POST"))) {
				Long id=Long.parseLong(request.getParameter("id"));
				String name=request.getParameter("name");
				String prenom=request.getParameter("Prenom");
				String telephone=request.getParameter("telephone");
				String username=request.getParameter("username");
				String type=request.getParameter("type");
				String p=request.getParameter("passeword");
				client c=new client(name,prenom,telephone,username,p,type);
				c.setId(id);
				metier.update(c);
				response.sendRedirect("Client.php");
			}
				else
					if(path.equals("/Demande.php")) {
						demandeModel model=new demandeModel();
						clientModel model1=new clientModel();
						List<demande>demandes=metier.demandeParMC();
						List<String>services=metier.serviceParMC();
						List<client>clients=metier.clientParMC();
						model.setDemandes(demandes);
						model1.setClients(clients);
						request.setAttribute("demande",new demande());
						request.setAttribute("services",services);
						request.setAttribute("model1", model1);
						request.setAttribute("model", model);
						request.getRequestDispatcher("Accueil/Demande.jsp").forward(request,response);
						
					}
					else
						if(path.equals("/savedemande.php")&&(request.getMethod().equals("POST"))) {
							String description=request.getParameter("description");
							String client=request.getParameter("client");
							String service=request.getParameter("service");
//							String accueil=request.getParameter("accueil");
//							String status=request.getParameter("status");
							String accueil="Aminata";
							String status="Un Patient";
							String date=request.getParameter("date");
							demande c=metier.saved(new demande(description,client,accueil,service,date,status));
							request.setAttribute("demande",c);
							response.sendRedirect("Demande.php");
						}
						else if(path.equals("/supd.php")) {
							Long id=Long.parseLong(request.getParameter("id"));
							metier.deletedemande(id);
							//request.getRequestDispatcher("produit.jsp").forward(request,response);
							response.sendRedirect("Demande.php");
						}
						else if(path.equals("/editdemande.php")) {
							Long id=Long.parseLong(request.getParameter("id"));
							demande c=metier.getdemande(id);
							clientModel model1=new clientModel();
							List<String>services=metier.serviceParMC();
							List<String>accueils=metier.aParMC();
							List<client>clients=metier.clientParMC();
							model1.setClients(clients);
							request.setAttribute("services",services);
							request.setAttribute("accueils",accueils);
							request.setAttribute("model1", model1);
							request.setAttribute("demande",c);
							request.getRequestDispatcher("Accueil/Editdemande.jsp").forward(request,response);
							}
						else 
							if(path.equals("/updatedemande.php")&&(request.getMethod().equals("POST"))) {
							Long id=Long.parseLong(request.getParameter("id"));
							String client=request.getParameter("client");
							String accuiel=request.getParameter("accuiel");
							String service=request.getParameter("service");
							String date=request.getParameter("date");
							String status=request.getParameter("status");
							String description=request.getParameter("description");
							demande c=new demande(description,client,accuiel,service,date,status);
							c.setId(id);
							metier.updatedemande(c);
							response.sendRedirect("Demande.php");
						}
		else {
			response.sendError(Response.SC_NOT_FOUND);
		}
	

}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

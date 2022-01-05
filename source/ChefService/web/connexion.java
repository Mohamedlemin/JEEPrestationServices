package ChefService.web;

import java.io.IOException;

import ChefService.dao.ChefServicedao;
import ChefService.dao.ChefServicedaoImpl;
import ChefService.metier.ChefService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class connexion extends HttpServlet {
	private ChefServicedao dao;
	@Override
	public void init() throws ServletException {
		dao=new ChefServicedaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("ChefService/login.html").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String username = req.getParameter("username");
	     String password = req.getParameter("password");
	     ChefService chef=dao.login(username, password);
	     /* Récupération de la session depuis la requête */
		 HttpSession session = req.getSession();
		 if(chef.getId()!=0) {
			 session.setAttribute("usersession",chef);
			 req.setAttribute("chef",chef);
			 getServletContext().getRequestDispatcher("/ChefService/index.jsp").forward( req, resp);
		 }
		 else {
			 getServletContext().getRequestDispatcher("/ChefService/login.html").forward( req, resp);

			 session.setAttribute("usersession",null);
		 }
	}

}

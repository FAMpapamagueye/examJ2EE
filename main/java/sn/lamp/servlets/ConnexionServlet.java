package sn.lamp.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.Form.ConnexionForm;
import sn.lamp.bean.UtilisateurBean;

public class ConnexionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2000445095516188842L;
	private static final String VUE="/WEB-INF/connexion.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     ConnexionForm connexion=new ConnexionForm();
     UtilisateurBean utilisateur=connexion.loginTest(req);
     
     if(connexion.getErreurs().isEmpty()) {
    	 HttpSession session=req.getSession();
    	 Map<String,UtilisateurBean> utilisateurSesion=(Map<String, UtilisateurBean>) session.getAttribute("utilisateurMap");
    	 UtilisateurBean logg=utilisateurSesion.get(utilisateur.getEmail());
    	 if(logg.getEmail().equals(utilisateur.getEmail()) && logg.getMot_de_pass().equals(utilisateur.getMot_de_pass())) {
    		 System.out.println("ok");
    		 if(logg.getProfil().equals("ADMIN")) {
    		 resp.sendRedirect("admin");
    		 }else {
    			 resp.sendRedirect("client");
    		 }
    	 }
     }else {
    	 this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
     }
		
	}
	
	

}

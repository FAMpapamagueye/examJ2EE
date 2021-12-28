package sn.lamp.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.Form.inscriptionForm;
import sn.lamp.bean.UtilisateurBean;

public class InscriptionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 522592708349278834L;
	private static final String VUE="/WEB-INF/inscription.jsp";
	private static final String SESSION="utilisateurMap";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		inscriptionForm inscription=new inscriptionForm();
		UtilisateurBean utilisateur=inscription.inscrireUtilisateur(req);
		req.setAttribute("inscription", inscription);
		req.setAttribute("utilisateur", utilisateur);
		if(inscription.getErreurs().isEmpty()) {
			HttpSession session=req.getSession();
			Map<String,UtilisateurBean> utilisateurMap=(Map<String, UtilisateurBean>) session.getAttribute(SESSION);
			if(utilisateurMap==null) {
				utilisateurMap=new HashMap<String, UtilisateurBean>();
			}
			utilisateurMap.put(utilisateur.getEmail(), utilisateur);
			session.setAttribute(SESSION, utilisateurMap);
			resp.sendRedirect("login");
		}else {
			this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
		}
		
		
	}
	
	

}

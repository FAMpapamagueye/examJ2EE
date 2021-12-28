package sn.lamp.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.UtilisateurBean;

public class confirmerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2699587536367265239L;
	public static final String VUE="/admin";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util=req.getParameter("id");
		HttpSession session=req.getSession();
		Map<String,UtilisateurBean> utilisateurEdit=(Map<String, UtilisateurBean>) session.getAttribute("utilisateurMap");
	       utilisateurEdit.remove(util);
//		req.setAttribute("utilisateur", utilisateur);
		resp.sendRedirect(VUE);
	}
	
	

}

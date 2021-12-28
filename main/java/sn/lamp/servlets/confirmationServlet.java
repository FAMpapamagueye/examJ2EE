package sn.lamp.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.UtilisateurBean;

public class confirmationServlet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8989087736113340017L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util=req.getParameter("nom");
		HttpSession session=req.getSession();
		Map<String,UtilisateurBean> utilisateurEdit=(Map<String, UtilisateurBean>) session.getAttribute("menuMap");
	       utilisateurEdit.remove(util);
	}
	

}

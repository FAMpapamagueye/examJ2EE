package sn.lamp.servlets.clients;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.PublicationBean;


public class confirmerServlets extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5344573032730928968L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util=req.getParameter("id");
		HttpSession session=req.getSession();
		Map<String,PublicationBean> publicationMap=(Map<String, PublicationBean>) session.getAttribute("publicationMap");
		if(util!=null) {
		publicationMap.remove(util);
//		req.setAttribute("utilisateur", utilisateur);
		resp.sendRedirect("client");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	

}

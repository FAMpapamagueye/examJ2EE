package sn.lamp.servlets.clients;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.bean.PublicationBean;

public class SupprimerServ extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 421125762435053635L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util=req.getParameter("id");
		HttpSession session=req.getSession();
		Map<String,PublicationBean> publicationEdit=(Map<String, PublicationBean>) session.getAttribute("publicationMap");
		PublicationBean publication=publicationEdit.get(util);
		req.setAttribute("publication", publication);
		this.getServletContext().getRequestDispatcher("/client/delet.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	

}

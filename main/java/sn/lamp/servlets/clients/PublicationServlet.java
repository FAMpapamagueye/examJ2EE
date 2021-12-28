package sn.lamp.servlets.clients;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.Form.PublicationForm;
import sn.lamp.bean.PublicationBean;

public class PublicationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5258098547953601615L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		this.getServletContext().getRequestDispatcher("/client/publication.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	
		
		PublicationForm form=new PublicationForm();
		PublicationBean publication=form.nouveauPost(req);
		req.setAttribute("form", form);
		req.setAttribute("publication", publication);
		if(form.getErreurs().isEmpty()) {
			HttpSession session=req.getSession();
			Map<String,PublicationBean> publicationMap=(Map<String, PublicationBean>) session.getAttribute("publicationMap");
			if(publicationMap==null) {
				publicationMap=new HashMap<String, PublicationBean>();
			}
			publicationMap.put(publication.getTitre(), publication);
			session.setAttribute("publicationMap", publicationMap);
			resp.sendRedirect("client");
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/publication.jsp").forward(req, resp);
		}
		
		
	}
	
	

}

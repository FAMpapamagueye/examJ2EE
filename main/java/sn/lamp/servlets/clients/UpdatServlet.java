package sn.lamp.servlets.clients;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.lamp.Form.PublicationForm;
import sn.lamp.Form.inscriptionForm;
import sn.lamp.bean.PublicationBean;
import sn.lamp.bean.UtilisateurBean;

public class UpdatServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2162473883738319976L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String util = req.getParameter("id");
		HttpSession session = req.getSession();
		Map<String, PublicationBean> publicationEdit = (Map<String, PublicationBean>) session
				.getAttribute("publicationMap");
		PublicationBean publication = publicationEdit.get(util);
		req.setAttribute("publication", publication);
		this.getServletContext().getRequestDispatcher("/client/update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		PublicationForm update = new PublicationForm();
		PublicationBean modif = update.nouveauPost(req);
		if (update.getErreurs().isEmpty()) {

			HttpSession session = req.getSession();
			Map<String, PublicationBean> publicationMap = (Map<String, PublicationBean>) session.getAttribute("publicationMap");

			publicationMap.replace(modif.getTitre(), modif);
			req.setAttribute("utilisateurMap", publicationMap);
			resp.sendRedirect("client");
		}
	}

}

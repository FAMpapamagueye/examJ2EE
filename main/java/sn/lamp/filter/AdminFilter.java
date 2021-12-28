package sn.lamp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request= (HttpServletRequest) req;
		HttpServletResponse response= (HttpServletResponse) resp;
		HttpSession session=request.getSession();
		if(session.getAttribute("utilisateurMap")==null) {
			response.sendRedirect("login");
		}else {
			chain.doFilter(request, response);
		}
		

	}

}

package sec06.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/sInit" }, initParams = { @WebInitParam(name = "email", value = "d@.com"),
		@WebInitParam(name = "tel", value = "111-1111") })
public class InitParamServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String str = getInitParameter("email");
		System.out.println(str);
		String str2 = getInitParameter("tel");
		System.out.println(str2);
		
	}

}

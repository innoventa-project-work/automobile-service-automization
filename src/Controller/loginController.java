package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.loginDAO;
import VO.loginVO;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("searchLogin"))
		{
			searchLoginDetails(request,response);
		}
	}

	private void searchLoginDetails(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		loginVO loginVO = new loginVO();
		loginDAO loginDAO = new loginDAO();
		List ls = loginDAO.searchLoginDetails(loginVO);
		HttpSession session = request.getSession();
		session.setAttribute("loginList", ls);
		response.sendRedirect("Admin/ViewLoginDetails.jsp");
	}

	private void checkUser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*HttpSession session = request.getSession();
		String loginEmail = request.getParameter("loginEmail");
		String loginPassword = request.getParameter("loginPassword");
		loginVO loginvo = new loginVO();
		loginvo.setEmail(loginEmail);
		loginvo.setPassword(loginPassword);
		loginDAO logindao = new loginDAO();
		List ls = logindao.authentication(loginvo);
		if(ls != null && ls.size() >= 1)
		{
			loginVO user=(loginVO) ls.get(0);
			long y = user.getLoginId();
			session.setAttribute("userID", y);
			System.out.println(user.getUserType());
			//	System.out.println(session.getAttribute("userId"));
				String type = user.getUserType();
				session.setAttribute("usertype",type);
				System.out.println(y);
				if(type.equalsIgnoreCase("admin"))
				{
					response.sendRedirect("Admin/Index.jsp");
				}
				else if(type.equalsIgnoreCase("user"))
				{
					response.sendRedirect("User/kaib.jsp");
				}
			
		}
		else
		{
			response.sendRedirect("User/login.jsp");
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("matchUser"))
		{
			checkUser(request,response);
		}
	}

}

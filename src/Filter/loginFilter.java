package Filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import DAO.loginDAO;
import VO.loginVO;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter("/*")
public class loginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public loginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpSession session = ((HttpServletRequest) request).getSession();
		RequestDispatcher requestDispatcher;
		String flag = request.getParameter("flag");
		
		String uri = ((HttpServletRequest)request).getRequestURI();

		/*System.err.println("uri before condition : "+uri);*/
		
		if(uri.contains("addUser") || uri.contains("/css") || (uri.contains("/js") && !uri.contains(".jsp")) || (uri.contains("/JASON")) || (uri.contains("/JSON")) || uri.contains("/img")|| uri.contains("/fonts") ||uri.contains("/Registration") || uri.contains("regController") ||  uri.contains("/index"))
		{
			//System.out.println("inside reg");
			/*System.out.println("uri Passed : "+uri);*/
			//requestDispatcher = request.getRequestDispatcher("/user/register.jsp");  
			//requestDispatcher.forward(request,response);  
			chain.doFilter(request,response);
		}
		
		else if (flag!= null && flag.equals("logout")) {
			//session.removeAttribute("userID");
			//System.out.println("logout in else if");
		
			session.invalidate();
			requestDispatcher = request.getRequestDispatcher("/User/login.jsp");
			requestDispatcher.forward(request, response);
		}
		else if(flag != null && flag.equals("matchUser") )
		{
			//System.out.println("Login");
			
			String loginEmail = request.getParameter("loginEmail");
			String loginPassword = request.getParameter("loginPassword");
			loginVO loginvo = new loginVO();
			loginvo.setEmail(loginEmail);
			loginvo.setPassword(loginPassword);
			loginDAO logindao = new loginDAO();
			List ls = logindao.authentication(loginvo);
			
			if(ls != null && ls.size()>=1){
				
				//Iterator itr = list.iterator();
				
				//while(itr.hasNext()){
				loginVO user=(loginVO) ls.get(0);
				
				long y = user.getLoginId();
				session.setAttribute("userID",y);
				
				System.out.println(user.getUserType());
			//	System.out.println(session.getAttribute("userId"));
				String type = user.getUserType();
				session.setAttribute("usertype",type);
				System.out.println(y);
				if(type.equalsIgnoreCase("admin"))
				{
					/*session.setAttribute("userID",y); */
					requestDispatcher = request.getRequestDispatcher("/Admin/Index.jsp");  
					requestDispatcher.forward(request,response);
				}
				else if(type.equalsIgnoreCase("staff"))
				{
					requestDispatcher = request.getRequestDispatcher("/Admin/Index.jsp");  
					requestDispatcher.forward(request,response);
				}
				else if(type.equalsIgnoreCase("wm"))
				{
					requestDispatcher = request.getRequestDispatcher("/WM/Index.jsp");  
					requestDispatcher.forward(request,response);
				}
				else if(type.equalsIgnoreCase("user"))
				{
					requestDispatcher = request.getRequestDispatcher("/User/userHome.jsp");  
					requestDispatcher.forward(request,response);
				}
				else
				{
					requestDispatcher = request.getRequestDispatcher("/User/login.jsp");  
					requestDispatcher.forward(request,response);  
				}
			}
			else
			{
				/*PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<script> alert(invalid);</script>");
				out.println("</head>");
				out.println("</html>");*/
				requestDispatcher = request.getRequestDispatcher("/User/login.jsp");
				requestDispatcher.forward(request,response);
			}	
		}
		else if(session.getAttribute("userID") != null)
		{
			String h = (String)session.getAttribute("usertype");
			//System.out.println("type = = = " + h);
			
			if(h!=null && h.equals("admin")){
			  //&& uri.contains("/Admin")
				//System.out.println("chain");
				if(uri.contains("/Staff") | uri.contains("/WM") | uri.contains("/User"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("/User/error.jsp");  
					rd.forward(request,response);
				}
				chain.doFilter(request,response);
			}	
			else if(h!=null && h.equals("staff"))
			{
				//System.out.println("chain");
				if(uri.contains("/Admin") | uri.contains("/WM") | uri.contains("/User"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("/User/error.jsp");  
					rd.forward(request,response);
				}
				chain.doFilter(request, response);
			}
			else if(h!=null && h.equals("user"))
			{
				if(uri.contains("/Staff") | uri.contains("/WM") | uri.contains("/Admin"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("/User/error.jsp");  
					rd.forward(request,response);
				}
				chain.doFilter(request, response);
			}
			else if(h!=null && h.equals("wm"))
			{
				if(uri.contains("/Staff") | uri.contains("/Admin") | uri.contains("/User"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("/User/error.jsp");  
					rd.forward(request,response);
				}
				chain.doFilter(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/User/error.jsp");  
				rd.forward(request,response);
			}
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/User/login.jsp");  
			rd.forward(request,response);  
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
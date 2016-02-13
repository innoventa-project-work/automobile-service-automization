package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CountryDAO;
import VO.CountryVO;


/**
 * Servlet implementation class CountryController
 */
@WebServlet("/CountryController")
public class CountryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		
		if(flag.equals("searchCountry"))
		{
			searchCountry(request,response);
		}
		if(flag.equals("editCountry"))
		{
			edit(request, response);
		}
	}

	private void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int countryid= Integer.parseInt(request.getParameter("cid"));
		CountryVO cv=new CountryVO();
		CountryDAO cd=new CountryDAO();
		cv.setCid(countryid);
		List ls=new ArrayList();
		ls=cd.editcountry(cv);
		HttpSession session = request.getSession();
		session.setAttribute("editcountryList",ls );
		System.out.println(ls);
		response.sendRedirect("Admin/EditCountry.jsp");
	}

	private void searchCountry(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException  {
		// TODO Auto-generated method stub
		CountryDAO d1 = new CountryDAO();
		CountryVO v1 = new CountryVO();
		List ls=new ArrayList();
		ls=d1.SearchCountry(v1);
		HttpSession session = request.getSession();
		session.setAttribute("countryList",ls );
		System.out.println(ls);
		response.sendRedirect("Admin/ViewCountry.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
			String flag=request.getParameter("flag");
			if(flag.equals("insertCountry"))
			{
				insertCountry(request, response);
			}
			if(flag.equals("updateCountry"))
			{
				updateCountry(request, response);
			}
		}

	private void updateCountry(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int countryId= Integer.parseInt(request.getParameter("id"));
		String countryName=request.getParameter("countryName");
        String countryDescription=request.getParameter("countryDescription");
		CountryVO cv=new CountryVO();
		cv.setCid(countryId);
		cv.setCountryname(countryName);
		cv.setCountrydesc(countryDescription);
		CountryDAO d = new CountryDAO();
		d.updateCountry(cv);
		searchCountry(request, response);
	}

	private void insertCountry(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = request.getParameter("countryName");
		String s2 = request.getParameter("countryDescription");
		CountryVO v=new CountryVO();
		v.setCountryname(s1);
		v.setCountrydesc(s2);
		CountryDAO d=new CountryDAO();
		d.InsertCountry(v);
		response.sendRedirect("Admin/AddCountry.jsp");
	}
	
}

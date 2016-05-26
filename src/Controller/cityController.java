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




import com.sun.org.apache.bcel.internal.generic.*;

import DAO.StateDAO;
import DAO.cityDAO;
import VO.CountryVO;
import VO.StateVO;
import VO.cityVO;


/**
 * Servlet implementation class cityController
 */
@WebServlet("/cityController")
public class cityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cityController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("searchCountry"))
		{	
			searchCountry(request,response);
		}
		if(flag.equals("searchCity"))
		{
			searchCity(request,response);
			
		}
		if(flag.equals("editCity"))
		{
			editCity(request,response);
		}
		if(flag.equals("loadState"))
		{
			loadState(request,response);
		}
	}
	private void loadState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int countryId=Integer.parseInt(request.getParameter("countryId"));
		CountryVO countryVo=new CountryVO();
		countryVo.setCid(countryId);
		cityDAO cityDao = new cityDAO();
		List ls = cityDao.loadState(countryVo);
		HttpSession session = request.getSession();
		session.setAttribute("stateList", ls);
		response.sendRedirect("Admin/JASON/loadState.jsp");
	}

	private void editCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid=Integer.parseInt(request.getParameter("cityId"));
		StateVO sv=new StateVO();
		StateDAO sd=new StateDAO();
		List stateList=sd.searchState(sv);
		cityVO cv=new cityVO();
		cityDAO cd=new cityDAO();
		cv.setCityId(cid);
		List ls=new ArrayList();
		ls=cd.editCity(cv);
		System.out.println(ls);
		HttpSession session=request.getSession();
		session.setAttribute("cityList", ls);
		session.setAttribute("stateList", stateList);
		response.sendRedirect("Admin/EditCity.jsp");
	}

	private void searchCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		cityVO cv= new cityVO();
		cityDAO cityDAO = new cityDAO();
		List ls = cityDAO.searchCity(cv);
		HttpSession session = request.getSession();
		session.setAttribute("cityList", ls);
		response.sendRedirect("Admin/ViewCity.jsp");
		
	}
	private void searchCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CountryVO sv = new CountryVO();
		cityDAO cv = new cityDAO();
		List ls = cityDAO.searchCountry(sv);
		HttpSession session = request.getSession();
		session.setAttribute("countryList", ls);
		response.sendRedirect("Admin/AddCity.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insertCity"))
		{
			insertCity(request,response);
		}
		if(flag.equals("updateCity"))
		{
			updateCity(request,response);
		}
}

	private void updateCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid= Integer.parseInt(request.getParameter("cityId"));
		String stateName=request.getParameter("stateName");
		String cityName=request.getParameter("cityName");
		String cityDescription=request.getParameter("cityDescription");
	
		
		cityVO v=new cityVO();
		StateVO sv=new StateVO();
		
		sv.setStateId(Integer.parseInt(stateName));
		v.setCityId(cid);
		v.setCityName(cityName);
		v.setCityDescription(cityDescription);
		v.setSv(sv);	
	
		cityDAO d = new cityDAO();
		d.updateCity(v);
		searchCity(request, response);
	}

	private void insertCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stateName=request.getParameter("stateid");
		String cityName=request.getParameter("cityName");
		String cityDescription=request.getParameter("cityDescription");
		cityVO cityvo=new cityVO();
		StateVO sv= new StateVO();
		sv.setStateId(Integer.parseInt(stateName));
		cityvo.setCityName(cityName);
		cityvo.setCityDescription(cityDescription);
		cityvo.setSv(sv);
		cityDAO d = new cityDAO();
		d.InsertCity(cityvo);
		response.sendRedirect("Admin/AddCity.jsp");
	}
}

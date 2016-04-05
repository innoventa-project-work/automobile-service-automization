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

import com.mysql.jdbc.ResultSet;

import DAO.CountryDAO;
import DAO.areaDAO;
import DAO.cityDAO;
import DAO.loginDAO;
import DAO.registrationDAO;
import VO.CountryVO;
import VO.StateVO;
import VO.cityVO;
import VO.loginVO;
import VO.registrationVO;

/**
 * Servlet implementation class regController
 */
@WebServlet("/regController")
public class regController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regController() {
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
		if(flag.equals("loadEmail"))
		{
			loadEmail(request,response);
		}
		if(flag.equals("searchUser"))
		{
			searchUser(request,response);
		}
		if(flag.equals("loadState"))
		{
			loadState(request, response);
		}
		if(flag.equals("loadCity"))
		{
			loadCity(request,response);
		}
	}
	private void loadCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stateId=Integer.parseInt(request.getParameter("stateId"));
		StateVO stateVo=new StateVO();
		stateVo.setStateId(stateId);
		registrationDAO regDao = new registrationDAO();
		List ls = regDao.loadCity(stateVo);
		HttpSession session = request.getSession();
		session.setAttribute("cityList", ls);
		response.sendRedirect("Admin/JASON/loadCity.jsp");
	}

	private void loadState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int countryId=Integer.parseInt(request.getParameter("countryId"));
		CountryVO countryVo=new CountryVO();
		countryVo.setCid(countryId);
		registrationDAO regDAO = new registrationDAO();
		List ls=regDAO.loadState(countryVo);
		HttpSession session = request.getSession();
		session.setAttribute("stateList", ls);
		response.sendRedirect("Admin/JASON/loadState.jsp");
	}
	private void searchUser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		registrationVO regVO = new registrationVO();
		registrationDAO regDAO = new registrationDAO();
		List ls = regDAO.searchUser(regVO);
		HttpSession session = request.getSession();
		session.setAttribute("userList", ls);
		response.sendRedirect("Admin/ViewUserInfo.jsp");
	}

	private void loadEmail(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String email=request.getParameter("email");
		loginVO loginVO = new loginVO();
		loginVO.setEmail(email);
		registrationDAO regDao = new registrationDAO();
		List ls = regDao.loadEmail(loginVO);
		session.setAttribute("emailList", ls);
		response.sendRedirect("User/JSON/loadEmail.jsp");
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
		response.sendRedirect("User/Registration.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("addUser"))
		{
			addUser(request,response);
		}
	}

	private void addUser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String dob = request.getParameter("dob");
			String gender = request.getParameter("gender");
			if(gender.equals("male"))
			{
				gender="male";
			}
			else
			{
				gender="female";
			}
			String countryName = request.getParameter("cityName");
			String stateName = request.getParameter("countryName");
			String cityName = request.getParameter("stateId");
			String address = request.getParameter("address");
			String contactNumber = request.getParameter("contactNumber");
			String userType="user";
			CountryVO countryVO = new CountryVO();
			StateVO stateVO = new StateVO();
			cityVO cityVO = new cityVO();
			registrationVO regVO = new registrationVO();
			registrationDAO regDAO = new registrationDAO();
			loginVO loginVO = new loginVO();
			loginDAO loginDAO = new loginDAO();
			loginVO.setEmail(email);
			loginVO.setPassword(password);
			loginVO.setUserType(userType);
			loginDAO.addUser(loginVO);
			regVO.setfName(firstName);
			regVO.setlName(lastName);
			regVO.setDob(dob);
			regVO.setGender(gender);
			regVO.setAddress(address);
			regVO.setContactno(contactNumber);
			countryVO.setCid(Integer.parseInt(countryName));
			stateVO.setStateId(Integer.parseInt(stateName));
			cityVO.setCityId(Integer.parseInt(cityName));
			regVO.setCountryVO(countryVO);
			regVO.setStateVO(stateVO);
			regVO.setCityvo(cityVO);
			regVO.setLoginVO(loginVO);
			regDAO.addUser(regVO);
			response.sendRedirect("User/login.jsp");
	}

}

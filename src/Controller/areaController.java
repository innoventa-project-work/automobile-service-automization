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

import DAO.StateDAO;
import DAO.areaDAO;
import DAO.cityDAO;
import VO.CountryVO;
import VO.StateVO;
import VO.areaVO;
import VO.cityVO;

/**
 * Servlet implementation class areaController
 */
@WebServlet("/areaController")
public class areaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public areaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("searchCountry")){
			searchCountry(request,response);
		}
	
		if(flag.equals("searchArea")){
			searchArea(request,response);
		}
		if(flag.equals("editArea")){
			editArea(request,response);
		}
		if(flag.equals("loadState")){
			loadState(request,response);
		}
		if(flag.equals("loadCity")){
			loadCity(request,response);
		}
	}

	private void loadCity(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stateId=Integer.parseInt(request.getParameter("stateId"));
		StateVO stateVo=new StateVO();
		stateVo.setStateId(stateId);
		areaDAO areaDao = new areaDAO();
		List ls = areaDao.loadCity(stateVo);
		HttpSession session = request.getSession();
		session.setAttribute("cityList", ls);
		response.sendRedirect("Admin/JASON/loadCity.jsp");
	}

	private void loadState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("state controller loaded");
		int countryId=Integer.parseInt(request.getParameter("countryId"));
		CountryVO countryVo=new CountryVO();
		countryVo.setCid(countryId);
		cityDAO cityDao = new cityDAO();
		List ls = cityDao.loadState(countryVo);
		HttpSession session = request.getSession();
		session.setAttribute("stateList", ls);
		System.out.println(ls.size());
		System.out.println("going to json");
		response.sendRedirect("Admin/JASON/loadState.jsp");
	}

	private void editArea(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aid=Integer.parseInt(request.getParameter("areaId"));
		cityVO cv=new cityVO();
		cityDAO cd=new cityDAO();
		List cityList=cd.searchCity(cv);
		areaVO av=new areaVO();
		areaDAO ad=new areaDAO();
		av.setAreaID(aid);
		List ls=new ArrayList();
		ls=ad.editArea(av);
		System.out.println(ls);
		HttpSession session=request.getSession();
		session.setAttribute("areaList", ls);
		session.setAttribute("cityList", cityList);
		response.sendRedirect("Admin/EditArea.jsp");
	}

	private void searchArea(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		areaVO av= new areaVO();
		areaDAO areaDAO = new areaDAO();
		List ls = areaDAO.SearchArea(av);
		HttpSession session = request.getSession();
		session.setAttribute("areaList", ls);
		response.sendRedirect("Admin/ViewArea.jsp");
	}

	private void searchCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CountryVO sv = new CountryVO();
		cityDAO cv = new cityDAO();
		List ls = cityDAO.searchCountry(sv);
		HttpSession session = request.getSession();
		session.setAttribute("countryList", ls);
		response.sendRedirect("Admin/AddArea.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("insertArea"))
		{
			insertArea(request,response);	
		}
		if(flag.equals("updateArea"))
		{
			updateArea(request,response);
		}
		
	}

	private void updateArea(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int areaId= Integer.parseInt(request.getParameter("areaId"));
		String cityName=request.getParameter("cityName");
		String areaName=request.getParameter("areaName");
		String areaDescription=request.getParameter("areaDescription");
	
		
		cityVO cityVO=new cityVO();
		areaVO areaVO=new areaVO();
		
		cityVO.setCityId(Integer.parseInt(cityName));
		areaVO.setAreaID(areaId);
		areaVO.setAreaName(areaName);;
		areaVO.setAreaDescription(areaDescription);
		areaVO.setCv(cityVO);	
	
		areaDAO areaDAO = new areaDAO();
		areaDAO.updateArea(areaVO);
		searchArea(request, response);
	}

	private void insertArea(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cityName=request.getParameter("cityName");
		String areaName=request.getParameter("areaName");
		String areaDescription=request.getParameter("areaDescription");
		areaVO av = new areaVO();
		cityVO cv = new cityVO();
		cv.setCityId(Integer.parseInt(cityName));
		av.setAreaName(areaName);
		av.setAreaDescription(areaDescription);
		av.setCv(cv);
		areaDAO d = new areaDAO();
		d.insertArea(av);
		response.sendRedirect("Admin/AddArea.jsp");
	}

}

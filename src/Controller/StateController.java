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

import org.hibernate.hql.ast.tree.UpdateStatement;

import DAO.CountryDAO;
import DAO.StateDAO;
import VO.CountryVO;
import VO.StateVO;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/StateController")
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("searchCountry")){
			searchCountry(request,response);
			
		}
		if(flag.equals("searchState")){
			searchState(request,response);
			
		}
		if(flag.equals("editState"))
		{	
			editState(request, response);
		}
	}

	private void editState(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stateId=Integer.parseInt(request.getParameter("stateId"));
		CountryVO cv=new CountryVO();
		CountryDAO cd=new CountryDAO();
		List countryList=cd.SearchCountry(cv);
		
		StateVO sv=new StateVO();
		StateDAO sd=new StateDAO();
		sv.setStateId(stateId);
		
		List ls=new ArrayList();
		ls=sd.editState(sv);
		System.out.println(ls);
		HttpSession session=request.getSession();
		session.setAttribute("stateList", ls);
		session.setAttribute("countrylist", countryList);
		response.sendRedirect("Admin/EditState.jsp");
	}

	private void searchState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StateVO sv = new StateVO();
		StateDAO stateDAO = new StateDAO();
		List ls = stateDAO.searchState(sv);
		HttpSession session = request.getSession();
		session.setAttribute("stateList", ls);
		response.sendRedirect("Admin/ViewState.jsp");
		
	}

	private void searchCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CountryVO countryVO = new CountryVO();
		StateDAO stateDAO = new StateDAO();
		List ls = stateDAO.searchCountry(countryVO);
		HttpSession session = request.getSession();
		session.setAttribute("countryList", ls);
		response.sendRedirect("Admin/AddState.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insertState"))
		{
			insertState(request,response);
		}
		if(flag.equals("updateState"))
		{
			updateState(request,response);
		}
	}

	private void insertState(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		String countryName=request.getParameter("countryName");
		String stateName=request.getParameter("stateName");
		String stateDescription=request.getParameter("stateDescription");

		HttpSession session = request.getSession();
		StateVO v=new StateVO();
		CountryVO cv= new CountryVO();
		cv.setCid(Integer.parseInt(countryName));
		v.setStateName(stateName);
		v.setStateDescription(stateDescription);
		v.setCv(cv);
		StateDAO d = new StateDAO();
		d.InsertState(v);
		response.sendRedirect("Admin/AddState.jsp");
	}

	private void updateState(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stateId= Integer.parseInt(request.getParameter("stateId"));
		String countryName=request.getParameter("countryName");
		String stateName=request.getParameter("stateName");
		String stateDescription=request.getParameter("stateDescription");
		StateVO sv=new StateVO();
		
		CountryVO cv=new CountryVO();
		cv.setCid(Integer.parseInt(countryName));
		sv.setStateId(stateId);
		sv.setStateName(stateName);
		sv.setStateDescription(stateDescription);
		sv.setCv(cv);	
		
		StateDAO d = new StateDAO();
		d.updateState(sv);
		searchState(request, response);
	}
}

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

import DAO.VehicleCategoryDAO;
import DAO.companyDAO;
import DAO.serviceDAO;
import VO.VehicleCategoryVO;
import VO.companyVO;
import VO.serviceVO;

/**
 * Servlet implementation class companyController
 */
@WebServlet("/companyController")
public class companyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public companyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if (flag.equals("searchCategory")){
			VehicleCategoryVO vc = new VehicleCategoryVO();
			searchCategory(request,response);
		}
		if (flag.equals("searchCompany")){
			companyVO cv = new companyVO();
			searchCompany(request,response);
		}
		if(flag.equals("editCompany")){
			editCompany(request,response);
		}
	}

	private void editCompany(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int companyid=Integer.parseInt(request.getParameter("companyId"));
		VehicleCategoryVO vehicleCategoryVO = new VehicleCategoryVO();
		companyVO companyVO = new companyVO();
		companyDAO companyDAO = new companyDAO();
		List ls=new ArrayList();
		ls=companyDAO.searchCategory(vehicleCategoryVO);
		List list = new ArrayList();
		companyVO.setComid(companyid);
		list=companyDAO.editCompany(companyVO);
		System.out.println(ls);
		HttpSession session=request.getSession();
		session.setAttribute("companyList", list);
		session.setAttribute("categorylist", ls);
		response.sendRedirect("Admin/EditCompany.jsp");
		
	}

	private void searchCompany(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		companyVO cv= new companyVO();
		companyDAO  companyDAO= new DAO.companyDAO();
		List ls = companyDAO.searchCompany(cv);
		HttpSession session = request.getSession();
		session.setAttribute("companyList", ls);
		response.sendRedirect("Admin/ViewVehCom.jsp");
	}

	private void searchCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VehicleCategoryVO vc = new VehicleCategoryVO();
		companyDAO cd = new companyDAO();
		List ls = cd.searchCategory(vc);
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", ls);
		response.sendRedirect("Admin/AddVehCom.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insertCompany"))
		{
			insert(request,response);
		}
		if(flag.equals("updateCompany"))
		{
			update(request,response);
		}
		
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int companyid= Integer.parseInt(request.getParameter("companyId"));
		String categoryName=request.getParameter("categoryName");
		String companyName=request.getParameter("companyName");
		String companyDescription=request.getParameter("companyDescription");
		companyVO companyVO = new companyVO();
		VehicleCategoryVO vehicleCategoryVO = new VehicleCategoryVO();
		vehicleCategoryVO.setVcid(Integer.parseInt(categoryName));
		companyVO.setComid(companyid);
		companyVO.setCompanyName(companyName);
		companyVO.setCompanyDescription(companyDescription);
		companyVO.setVc(vehicleCategoryVO);
		companyDAO companyDAO=new companyDAO();
		companyDAO.updateCompany(companyVO);
		searchCompany(request, response);

		
		
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String categoryName=request.getParameter("categoryName");
		String companyName=request.getParameter("companyName");
		String companyDescription=request.getParameter("companyDescription");

		HttpSession session = request.getSession();
		VehicleCategoryVO vc = new VehicleCategoryVO();
		companyVO cv = new companyVO();
		vc.setVcid(Integer.parseInt(categoryName));
		cv.setCompanyName(companyName);
		cv.setCompanyDescription(companyDescription);
		cv.setVc(vc);
		companyDAO cd = new companyDAO();
		cd.InsertService(cv);
		response.sendRedirect("Admin/AddVehCom.jsp");
		
	}

}

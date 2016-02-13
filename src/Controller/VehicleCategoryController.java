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

import org.hibernate.sql.Insert;

import DAO.CountryDAO;
import DAO.VehicleCategoryDAO;
import DAO.areaDAO;
import VO.CountryVO;
import VO.VehicleCategoryVO;
import VO.areaVO;

/**
 * Servlet implementation class VehicleCategoryController
 */
@WebServlet("/VehicleCategoryController")
public class VehicleCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleCategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("searchVehCategory")){
			searchVehCategory(request,response);	
		}
		if(flag.equals("editCategory")){
			edit(request,response);
		}
	}

	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int categoryId=Integer.parseInt(request.getParameter("categoryId"));
		VehicleCategoryVO vehicleCategoryVO = new VehicleCategoryVO();
		VehicleCategoryDAO vehicleCategoryDAO = new VehicleCategoryDAO();
		vehicleCategoryVO.setVcid(categoryId);
		List ls = new ArrayList();
		ls = vehicleCategoryDAO.editCategory(vehicleCategoryVO);
		HttpSession session = request.getSession();
		session.setAttribute("categoryList",ls );
		System.out.println(ls);
		response.sendRedirect("Admin/EditCategory.jsp");
		
	}

	private void searchVehCategory(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		VehicleCategoryVO vc= new VehicleCategoryVO();
		VehicleCategoryDAO vehicleCategoryDAO= new VehicleCategoryDAO();
		List ls = vehicleCategoryDAO.SeearchVehCategory(vc);
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", ls);
		response.sendRedirect("Admin/ViewVehCat.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("insertVehicleCategory"))
		{
			
			Insert(request,response);
		}
		if(flag.equals("updateCategory"))
		{
			update(request, response);
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int categoryId= Integer.parseInt(request.getParameter("categoryId"));
		String categoryName=request.getParameter("categoryName");
        String categoryDescription=request.getParameter("categoryDescription");
        VehicleCategoryVO vehicleCategoryVO = new VehicleCategoryVO();
        VehicleCategoryDAO vehicleCategoryDAO = new VehicleCategoryDAO();
        vehicleCategoryVO.setVcid(categoryId);
        vehicleCategoryVO.setCategory(categoryName);
        vehicleCategoryVO.setCategorydescription(categoryDescription);
        vehicleCategoryDAO.updateCategory(vehicleCategoryVO);
        searchVehCategory(request, response);
		
	}

	private void Insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String categoryname = request.getParameter("categoryName");
		String categorydesc = request.getParameter("categoryDescription");
		VehicleCategoryVO v=new VehicleCategoryVO();
		v.setCategory(categoryname);
		v.setCategorydescription(categorydesc);
		VehicleCategoryDAO d=new VehicleCategoryDAO();
		d.InsertCategory(v);
		response.sendRedirect("Admin/AddVehCat.jsp");
		
	}
}

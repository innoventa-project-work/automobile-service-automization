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
import DAO.modelDAO;
import VO.VehicleCategoryVO;
import VO.companyVO;
import VO.modelVO;

/**
 * Servlet implementation class modelController
 */
@WebServlet("/modelController")
public class modelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("searchCategory"))
		{
			
			searchCategory(request,response);
		}
		if(flag.equals("searchModel"))
		{	
			searchModel(request,response);
		}
		if(flag.equals("editModel")){
			editModel(request,response);
		}
		if(flag.equals("loadCompany"))
		{
			loadCompany(request,response);
		}
	}

	private void searchCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VehicleCategoryVO vcVO = new VehicleCategoryVO();
		modelDAO modelDAO = new modelDAO();
		List ls = modelDAO.SearchVehCategory(vcVO);
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", ls);
		response.sendRedirect("Admin/AddVehModel.jsp");
	}

	private void editModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int modelid=Integer.parseInt(request.getParameter("modelId"));
		modelVO modelVO = new modelVO();
		modelVO.setModelid(modelid);
		modelDAO modelDAO = new modelDAO();
		List ls = modelDAO.searchModel(modelVO);
		VehicleCategoryVO vcVO = new VehicleCategoryVO();
		VehicleCategoryDAO vcDAO = new VehicleCategoryDAO();
		List categoryls = vcDAO.SeearchVehCategory(vcVO);
		companyVO companyVO = new companyVO();
		companyDAO companyDAO = new companyDAO();
		List companyls = companyDAO.searchCompany(companyVO);
		HttpSession session=request.getSession();
		session.setAttribute("modelList", ls);
		session.setAttribute("categoryList", categoryls);
		session.setAttribute("companyList", companyls);
		response.sendRedirect("Admin/EditModel.jsp");
	}

	private void searchModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		modelVO mv=new modelVO();
		modelDAO md = new modelDAO();
		List ls = md.searchModel(mv);
		HttpSession session = request.getSession();
		session.setAttribute("modelList", ls);
		response.sendRedirect("Admin/ViewVehModel.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insertModel"))
		{
			insertModel(request,response);
		}
		if(flag.equals("updateModel"))
		{
			updateModel(request,response);
		}
}

	private void loadCompany(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		VehicleCategoryVO vcVO = new VehicleCategoryVO();
		vcVO.setVcid(categoryId);
		modelDAO modealDAO = new modelDAO();
		List ls = modealDAO.loadModel(vcVO);
		HttpSession session = request.getSession();
		session.setAttribute("companyList", ls);
		response.sendRedirect("Admin/JASON/loadCompany.jsp");
	}

	private void updateModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int categoryId = Integer.parseInt(request.getParameter("categoryName"));
		int companyId = Integer.parseInt(request.getParameter("companyName"));
		int modelid= Integer.parseInt(request.getParameter("modelId"));
		String modelName=request.getParameter("modelName");
		String modelDescription=request.getParameter("modelDescription");
		modelVO modelVO = new modelVO();
		VehicleCategoryVO vcVO = new VehicleCategoryVO();
		companyVO companyVO = new companyVO();
		vcVO.setVcid(categoryId);
		companyVO.setComid(companyId);
		modelVO.setModelid(modelid);
		modelVO.setModelName(modelName);
		modelVO.setModelDescription(modelDescription);
		modelVO.setVcVO(vcVO);
		modelVO.setCompanyVO(companyVO);
		modelDAO md = new modelDAO();
		md.updateModel(modelVO);
		searchModel(request, response);
		
	}

	private void insertModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int categoryId = Integer.parseInt(request.getParameter("categoryName"));
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		String modelName=request.getParameter("modelName");
		String modelDescription=request.getParameter("modelDescription");
		HttpSession session = request.getSession();
		VehicleCategoryVO vcVO = new VehicleCategoryVO();
		companyVO companyVO = new companyVO();
		modelVO modelVO = new modelVO();
		vcVO.setVcid(categoryId);
		companyVO.setComid(companyId);
		modelVO.setModelName(modelName);
		modelVO.setModelDescription(modelDescription);
		modelVO.setVcVO(vcVO);
		modelVO.setCompanyVO(companyVO);
		modelDAO md = new modelDAO();
		md.InsertModel(modelVO);
		response.sendRedirect("Admin/AddVehModel.jsp");
	}
}

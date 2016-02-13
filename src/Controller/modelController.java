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
		if(flag.equals("searchCompany")){
			
			searchCompany(request,response);
		}
		if(flag.equals("searchModel")){
			
			searchModel(request,response);
		}
		if(flag.equals("editModel")){
			editModel(request,response);
		}
	}

	private void editModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int modelid=Integer.parseInt(request.getParameter("modelId"));
		companyVO cv = new companyVO();
		companyDAO cd = new companyDAO();
		List companylist = new ArrayList();
		companylist=cd.searchCompany(cv);
		
		modelVO mv = new modelVO();
		modelDAO md = new modelDAO();
		mv.setModelid(modelid);
		List ls=new ArrayList();
		ls=md.editModel(mv);
		System.out.println(ls);
		HttpSession session=request.getSession();
		session.setAttribute("modelList", ls);
		session.setAttribute("companylist", companylist);
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

	private void searchCompany(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			companyVO cv = new companyVO();
			modelDAO md = new modelDAO();
			List ls = md.searchCompany(cv);
			HttpSession session = request.getSession();
			session.setAttribute("companyList", ls);
			response.sendRedirect("Admin/AddVehModel.jsp");
		// TODO Auto-generated method stub
		
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

	private void updateModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int modelid= Integer.parseInt(request.getParameter("modelId"));
		String modelName=request.getParameter("modelName");
		String modelDescription=request.getParameter("modelDescription");
		String companyname=request.getParameter("companyName");
		modelVO mv = new modelVO();
		companyVO cv = new  companyVO();
		cv.setComid(Integer.parseInt(companyname));
		mv.setModelid(modelid);
		mv.setModelName(modelName);
		mv.setModelDescription(modelDescription);
		mv.setCv(cv);
		modelDAO md = new modelDAO();
		md.updateModel(mv);
		searchModel(request, response);
		
	}

	private void insertModel(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String companyName=request.getParameter("companyName");
		String modelName=request.getParameter("modelName");
		String modelDescription=request.getParameter("modelDescription");
		HttpSession session = request.getSession();
		companyVO cv = new companyVO();
		modelVO mv = new modelVO();
		cv.setComid(Integer.parseInt(companyName));
		mv.setModelName(modelName);
		mv.setModelDescription(modelDescription);
		mv.setCv(cv);
		modelDAO md = new modelDAO();
		md.InsertModel(mv);
		response.sendRedirect("Admin/AddVehModel.jsp");
		
	}
}

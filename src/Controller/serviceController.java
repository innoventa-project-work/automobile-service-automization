package Controller;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.StateDAO;
import DAO.VehicleCategoryDAO;
import DAO.serviceDAO;
import VO.CountryVO;
import VO.StateVO;
import VO.VehicleCategoryVO;
import VO.serviceVO;

/**
 * Servlet implementation class serviceController
 */
@WebServlet("/serviceController")
public class serviceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serviceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("searchCategory")){
			searchCategory(request,response);
		}
		if(flag.equals("searchServices")){
			searchServices(request,response);
		}
		if(flag.equals("editService"))
		{
			editService(request,response);
		}
	}

	private void editService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int servceId = Integer.parseInt(request.getParameter("serviceId"));
		serviceVO serviceVO = new serviceVO();
		serviceVO.setServiceId(servceId);
		serviceDAO serviceDAO = new serviceDAO();
		List ls = serviceDAO.editService(serviceVO);
		HttpSession session = request.getSession();
		session.setAttribute("serviceList", ls);
		VehicleCategoryVO vcvo = new VehicleCategoryVO();
		List category = serviceDAO.searchCategory(vcvo);
		session.setAttribute("categoryList", category);
		response.sendRedirect("Admin/EditService.jsp");
	}

	private void searchServices(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		serviceVO sv=new serviceVO();
		serviceDAO sd = new serviceDAO();
		List ls = sd.searchServices(sv);
		HttpSession session = request.getSession();
		session.setAttribute("servicesList", ls);
		response.sendRedirect("Admin/ViewVehService.jsp");
	}

	private void searchCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VehicleCategoryVO vc = new VehicleCategoryVO();
		serviceDAO sd = new serviceDAO();
		List ls = sd.searchCategory(vc);
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", ls);
		response.sendRedirect("Admin/AddVehService.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insertService"))
		{	
			insertService(request,response);
		}
		if(flag.equals("updateService"))
		{	
			updateService(request,response);
		}
	}

	private void updateService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int serviceId = Integer.parseInt(request.getParameter("serviceId"));
		int category = Integer.parseInt(request.getParameter("categoryName"));
		String serviceName = request.getParameter("serviceName");
		String servicrDesc = request.getParameter("serviceDescription");
		VehicleCategoryVO vcvo = new VehicleCategoryVO();
		vcvo.setVcid(category);
		serviceVO serviceVO = new serviceVO();
		serviceDAO serviceDAO = new serviceDAO();
		serviceVO.setServiceId(serviceId);
		serviceVO.setServiceName(serviceName);
		serviceVO.setServiceDescription(servicrDesc);
		serviceVO.setVc(vcvo);
		serviceDAO.updateService(serviceVO);
		searchServices(request, response);
	}

	private void insertService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String categoryName=request.getParameter("categoryName");
		String serviceName=request.getParameter("serviceName");
		String serviceDescription=request.getParameter("serviceDescription");

		HttpSession session = request.getSession();
		VehicleCategoryVO vc = new VehicleCategoryVO();
		serviceVO sv = new serviceVO();
		vc.setVcid(Integer.parseInt(categoryName));
		sv.setServiceName(serviceName);
		sv.setServiceDescription(serviceDescription);
		sv.setVc(vc);
		serviceDAO sd = new serviceDAO();
		sd.InsertService(sv);
		response.sendRedirect("Admin/AddVehService.jsp");
	}

}

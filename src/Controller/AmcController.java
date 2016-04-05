package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

import DAO.AmcDAO;
import VO.AmcVO;

/**
 * Servlet implementation class AmcController
 */
@WebServlet("/AmcController")
public class AmcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		if(flag.equals("searchAmc"))
		{
			searchAmc(request,response);
		}
		if(flag.equals("editAmc"))
		{
			editAmc(request,response);
		}
	}

	private void editAmc(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int amcid = Integer.parseInt(request.getParameter("amcId"));
		AmcVO amcVO = new AmcVO();
		AmcDAO amcDAO = new AmcDAO();
		amcVO.setAmcid(amcid);
		List ls = amcDAO.editAmc(amcVO);
		HttpSession session = request.getSession();
		session.setAttribute("amcList", ls);
		response.sendRedirect("Admin/EditAmc.jsp");
		
	}

	private void searchAmc(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		AmcVO av=new AmcVO();
		AmcDAO d=new AmcDAO();
		List ls = d.searchAmc(av);
		HttpSession session = request.getSession();
		session.setAttribute("AmcList", ls);
		response.sendRedirect("Admin/ViewAmc.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("updateAmc"))
		{
			updateAmc(request,response);
		}
		
		if(flag.equals("insertAmc"))
		{
			insertAmc(request,response);
			
		}
	}

	private void insertAmc(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = request.getParameter("amcTitle");
		String s2 = request.getParameter("amcPrice");
		String s3 = request.getParameter("amcDescription");
		AmcVO v=new AmcVO();
		v.setAmctitle(s1);
		v.setAmcprice(s2);
		v.setAmcdesc(s3);
		AmcDAO d=new AmcDAO();
		d.InsertAmc(v);
		response.sendRedirect("Admin/AddAmc.jsp");
	}

	private void updateAmc(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int amcId = Integer.parseInt(request.getParameter("amcId"));
		String amcTitle = request.getParameter("amcTitle");
		String amcPrice = request.getParameter("amcPrice");
		String AmcDesc = request.getParameter("amcDescription");
		AmcVO amcVO = new AmcVO();
		amcVO.setAmcid(amcId);
		amcVO.setAmctitle(amcTitle);
		amcVO.setAmcprice(amcPrice);
		amcVO.setAmcdesc(AmcDesc);
		AmcDAO amcDAO = new AmcDAO();
		amcDAO.updateAMC(amcVO);
		searchAmc(request, response);
	}

}

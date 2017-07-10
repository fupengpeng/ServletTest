package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserInfo;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(
		description = "学习Servlet创建的", 
		urlPatterns = { 
				"/FirstServlet", 
				"/Home/FirstServlet"
		}, 
		initParams = { 
				@WebInitParam(name = "userName", value = "abc", description = "用户姓名")
		})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     * 默认的无参构造
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * get请求
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("o------- userName = " + getInitParameter("userName"));
//		
//		UserInfo userInfo = new UserInfo();
//		userInfo.setCode("0");
//		userInfo.setInfo("65365465");
//		userInfo.setData("100");
//		
//		response.getWriter().append("{"+"code"+":"+userInfo.getCode()+","+"info"+":"+userInfo.getInfo()+","+"data"+":"+userInfo.getData()+"}");
//		
//		response.getWriter().append(userInfo.toString());
		
		
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		String result = "";
		
		if ("17791654327".equals(account) && "123456".equals(password)) {
			result = "Login Success!";
		}else {
			result = "Sorry! Account or password error.";
		}
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println(result);
		printWriter.flush();
		
		
		
		
	}

	/**
	 * post请求
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

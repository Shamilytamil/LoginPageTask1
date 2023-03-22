package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Login;

/**
 * Servlet implementation class MathServlet
 */
@WebServlet(name = "Math", urlPatterns = { "/Math" })
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("operation");
		double number1 = Double.parseDouble(request.getParameter("no1"));
		double number2 = Double.parseDouble(request.getParameter("no2"));
		double result = 0.0;
		Login login = new Login();
		
		/*if("Add".equals(operation)) {
			
			result = number1 + number2;
			System.out.println("Addition done"+result);
		}else if("Multiple".equals(operation)) {
			result = number1 * number2;
			System.out.println("Addition done"+result);
		}else if("Subtract".equals(operation)) {
			result = number1 - number2;
			System.out.println("Addition done"+result);
		}else if("Divide".equals(operation)) {
			result = number1/number2;
			System.out.println("Addition done"+result);
		}*/
		
		if("Add".equals(operation)) {
			
			result =login.getAdd(number1, number2);
			System.out.println("Addition done"+result);
		}else if("Multiple".equals(operation)) {
			
			result =login.getMul(number1, number2);
			System.out.println("Addition done"+result);
		}else if("Subtract".equals(operation)) {
			
			result =login.getSub(number1, number2);
			System.out.println("Addition done"+result);
		}else if("Divide".equals(operation)) {
			
			result =login.getDiv(number1, number2);
			System.out.println("Addition done"+result);
		}
		
	request.setAttribute("number1", number1);
	request.setAttribute("number2", number2);
	request.setAttribute("result", result);	
	request.getRequestDispatcher("math.jsp").forward(request, response);
		
}

}

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CurrencyConverter;

/**
 * Servlet implementation class getCurrencyServlet
 */
@WebServlet("/getCurrencyServlet")
public class getCurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCurrencyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userCurrency = request.getParameter("userCurrency");
		CurrencyConverter userCurrencies = new CurrencyConverter(Double.parseDouble(userCurrency));
		
		request.setAttribute("userWallet", userCurrencies);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}

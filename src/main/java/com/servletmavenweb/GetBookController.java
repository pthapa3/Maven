package com.servletmavenweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servletmavenweb.dao.BookDAO;

/**
 * Servlet implementation class GetBookController
 */

public class GetBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int bookID = Integer.parseInt(request.getParameter("bookId"));
			
			BookDAO bookDao = new BookDAO();
			
			BookModel book = bookDao.getBook(bookID);
		
			
//			request.setAttribute("book", book);
//			
//			RequestDispatcher rd = request.getRequestDispatcher("showBooks.jsp");
//			rd.forward(request, response);
			
			
			
			HttpSession session = request.getSession();
			
			session.setAttribute("book", book);
			
			response.sendRedirect("showBooks.jsp");
			
		
	}

	
}

package com.servletmavenweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.servletmavenweb.*;
public class BookDAO {
	
	
	public BookModel getBook (int bookId) {
	
		BookModel book = new BookModel();
		
		
		try {
				String url = "jdbc:mysql://localhost:3306/RESTpractice" ;
				String sql =  "Select * from book where id="+bookId;
				String username = "root";
				String password = "Me2youn1mysql";
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				Statement st = con.createStatement();
				ResultSet rs  = st.executeQuery(sql);
				
				if(rs.next()) {
					
					book.setBookId(rs.getInt("id"));
					book.setAuthor(rs.getString("author"));
					book.setComments(rs.getString("comments"));
					
				}
				
				
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return book;
	
	
	}
}

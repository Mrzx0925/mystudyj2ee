package com.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class Tools {
	public void write(ServletActionContext con,String mess) {
		HttpServletResponse resp = ServletActionContext.getResponse() ;
		
		resp.setCharacterEncoding("utf-8") ;
		try {
			resp.getWriter().print(mess) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

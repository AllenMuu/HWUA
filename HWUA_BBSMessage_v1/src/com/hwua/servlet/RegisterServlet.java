package com.hwua.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwua.bin.User;
import com.hwua.biz.UserBiz;
import com.hwua.bizimpl.UserBizImpl;

public class RegisterServlet extends HttpServlet {
	UserBiz mUserBizImpl = new UserBizImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		String name = new String(req.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		String password = new String(req.getParameter("pwd").getBytes("iso-8859-1"),"utf-8");
		String confirm = new String(req.getParameter("affirm").getBytes("iso-8859-1"),"utf-8");
		String email = new String(req.getParameter("email").getBytes("iso-8859-1"),"utf-8");
		User user = new User();
		user.setUserName(name);
		user.setUserPassward(password);
		if (mUserBizImpl.addUser(user)) {
			req.getRequestDispatcher("/main.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("/index.html").forward(req, resp);
		}
		
	}
}

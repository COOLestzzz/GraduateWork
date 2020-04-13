package com.smart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.util.WebSocketUtil;

@Controller
@RequestMapping("chatWebsocket")
public class ChartWebsocketController {
	@RequestMapping("login")
	public void login(String username,HttpServletRequest request,HttpServletResponse response) throws Exception{
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		WebSocketUtil.setHttpSession(session);
		request.getRequestDispatcher("/socketChart.jsp").forward(request, response);
	}
	@RequestMapping("loginOut")
	public void loginOut(HttpServletRequest request,HttpServletResponse response) throws Exception{
		HttpSession session=request.getSession();
		session.removeAttribute("username");
		request.getRequestDispatcher("/socketChart.jsp").forward(request, response);
	}

}
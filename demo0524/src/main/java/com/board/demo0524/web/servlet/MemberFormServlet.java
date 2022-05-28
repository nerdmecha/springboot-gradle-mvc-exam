package com.board.demo0524.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.demo0524.domain.member.MemberRepository;

import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet/members/new-form")
public class MemberFormServlet extends HttpServlet {
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter w = response.getWriter();
		w.write("<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				" <title>Title</title>\n" +
				" <meta charset=\"utf-8\">\n" +
				"</head>\n" +
				"<body>\n" +
				"<form action=\"/servlet/members/save\" method=\"post\">\n" +
				" username: <input type=\"text\" name=\"username\" />\n" +
				" age: <input type=\"text\" name=\"age\" />\n" +
				" <button type=\"submit\">전송</button>\n" +
				"</form>\n" +
				"</body>\n" +
				"</html>\n");
	}
}
package com.board.demo0524.web.frontcontroller.v1.controller;

import com.board.demo0524.domain.member.Member;
import com.board.demo0524.domain.member.MemberRepository;
import com.board.demo0524.web.frontcontroller.v1.ControllerV1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.RequestDispatcher;

public class MemberSaveControllerV1 implements ControllerV1 {
	private MemberRepository memberRepository = MemberRepository.getInstance();

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Member member = new Member(username, age);
		memberRepository.save(member);
		
		request.setAttribute("member", member);
		
		String viewPath = "/WEB-INF/views/save-result.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}
}

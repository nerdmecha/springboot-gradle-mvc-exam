package com.board.demo0524.web.frontcontroller.v1.controller;

import com.board.demo0524.domain.member.Member;
import com.board.demo0524.domain.member.MemberRepository;
import com.board.demo0524.web.frontcontroller.v1.ControllerV1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;

public class MemberListControllerV1 implements ControllerV1 {
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Member> members = memberRepository.findAll();
			request.setAttribute("members", members);
			
			String viewPath = "/WEB-INF/views/members.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
			dispatcher.forward(request, response);
	}
}
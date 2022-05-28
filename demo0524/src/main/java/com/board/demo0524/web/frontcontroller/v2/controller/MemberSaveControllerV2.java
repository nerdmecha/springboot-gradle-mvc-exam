package com.board.demo0524.web.frontcontroller.v2.controller;

import com.board.demo0524.domain.member.Member;
import com.board.demo0524.domain.member.MemberRepository;
import com.board.demo0524.web.frontcontroller.MyView;
import com.board.demo0524.web.frontcontroller.v2.ControllerV2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Member member = new Member(username, age);
		memberRepository.save(member);
		
		request.setAttribute("member", member);
		
		return new MyView("/WEB-INF/views/save-result.jsp");
	}
}
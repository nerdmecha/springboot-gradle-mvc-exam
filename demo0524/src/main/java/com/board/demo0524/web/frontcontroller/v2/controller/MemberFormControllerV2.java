package com.board.demo0524.web.frontcontroller.v2.controller;

import com.board.demo0524.web.frontcontroller.MyView;
import com.board.demo0524.web.frontcontroller.v2.ControllerV2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {
	@Override
	public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new MyView("/WEB-INF/views/new-form.jsp");
	}
}
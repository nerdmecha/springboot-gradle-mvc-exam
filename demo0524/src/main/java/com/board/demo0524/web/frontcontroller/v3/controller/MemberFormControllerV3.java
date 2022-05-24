package com.board.demo0524.web.frontcontroller.v3.controller;

import com.board.demo0524.web.frontcontroller.ModelView;
import com.board.demo0524.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
	@Override
	public ModelView process(Map<String, String> paramMap) {
		return new ModelView("new-form");
	}
}
package com.board.demo0524.web.frontcontroller.v3;

import com.board.demo0524.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
	ModelView process(Map<String, String> paramMap);
}
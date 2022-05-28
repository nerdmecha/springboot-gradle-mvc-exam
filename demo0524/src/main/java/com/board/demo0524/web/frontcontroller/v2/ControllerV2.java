package com.board.demo0524.web.frontcontroller.v2;

import com.board.demo0524.web.frontcontroller.MyView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public interface ControllerV2 {
	MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
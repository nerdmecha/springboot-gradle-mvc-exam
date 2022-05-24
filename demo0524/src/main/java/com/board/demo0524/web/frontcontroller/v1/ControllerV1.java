package com.board.demo0524.web.frontcontroller.v1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public interface ControllerV1 {
	void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
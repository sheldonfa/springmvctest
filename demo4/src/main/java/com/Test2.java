package com;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author fangxin
 * @date 2017/4/25.
 */
public class Test2 implements HttpRequestHandler{

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("hello","hello demo4");
        request.getRequestDispatcher("/jsp/index.jsp").forward(request,response);
    }
}

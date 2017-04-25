package com;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author fangxin
 * @date 2017/4/25.
 */
public class Test1 implements Controller{
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        // 添加属性
        modelAndView.addObject("hello","helloJava");
        // 返回视图
        modelAndView.setViewName("index");
        return modelAndView;
    }
}

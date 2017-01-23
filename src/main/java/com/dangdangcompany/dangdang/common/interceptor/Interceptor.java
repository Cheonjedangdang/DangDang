package com.dangdangcompany.dangdang.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{
	
	private static final Logger logger = LoggerFactory.getLogger(Interceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		/* 응답이 페이지이동이 아니라면 로그인 검사하지 않음 */
		if(((HandlerMethod)handler).getMethod().getAnnotation(ResponseBody.class) != null) return true;
		
		if(request.getSession().getAttribute("user") == null )
		{
			response.sendRedirect(request.getContextPath()+"/");
            return false;
		}
		
		return true;
		
	}
}

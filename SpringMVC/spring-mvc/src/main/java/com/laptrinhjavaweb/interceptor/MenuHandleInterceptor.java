//package com.laptrinhjavaweb.interceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.laptrinhjavaweb.service.HomeService;
//
//public class MenuHandleInterceptor implements HandlerInterceptor {
//	@Autowired
//	private HomeService homeService;
//	
//
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		request.setAttribute("menu",homeService.loadMenu());//day data tu controller ra view
//		return true;
//	}
//
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//		
//		
//	}
//
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		
//		
//	}

//}

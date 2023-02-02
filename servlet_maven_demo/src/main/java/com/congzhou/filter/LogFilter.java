package com.congzhou.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

public class LogFilter implements Filter {

    public void init(FilterConfig var1) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String url = ((HttpServletRequest) servletRequest).getRequestURL().toString();
        System.out.printf("%tT 访问url：%s \n", new Date(), url);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
    }
}

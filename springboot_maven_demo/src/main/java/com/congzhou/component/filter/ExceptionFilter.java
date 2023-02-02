package com.congzhou.component.filter;

import com.congzhou.component.res.Result;
import com.congzhou.component.res.ResultCodeMessage;
import com.congzhou.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ExceptionFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } catch (Exception e) {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            logger.error("doFilter, exception happen", e);
            ResponseUtil.responseWriteJson(response, HttpStatus.OK.value(), new Result<>(ResultCodeMessage.INTERNAL_SERVER_ERROR));
        }
    }

    @Override
    public void destroy() {

    }
}

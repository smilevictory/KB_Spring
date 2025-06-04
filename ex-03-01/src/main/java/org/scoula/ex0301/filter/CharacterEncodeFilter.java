package org.scoula.ex0301.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"})
public class CharacterEncodeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터 동작 시작!");
        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request,response); // 필터가 여러개 있을 때 다 적용되는지 확인하는 것
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}

package org.scoula.ex03;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")

public class Utf8Filter implements Filter {

    private String encoding; // null로 자동 초기화!

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
        // FilterConfig --> web.xml에 filter에 사용할 변수를
        // 설정해두고 일어올 수 있음.
        if(encoding == null){
            encoding = "UTF-8";
        }
        System.out.println("필터객체 생성됨");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("필터객체 소멸됨");
    }
}

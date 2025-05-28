package org.scoula.servletlifecycle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/life-cycle")
public class LifeCycleTest extends HelloServlet{

    private int initCount=1;
    private int serviceCount = 1;
    private int destoryCount = 1;

    // 최초 서블릿 요청시 호출되는 메소드
    @Override
    public void init() throws ServletException {
        System.out.println("init() 메소드 호출" + initCount++);
    }

    // 서블릿 컨테이너가 종료될때 호출되는 메소드
    @Override
    public void destroy() {
        System.out.println("destroy() 메소드 호출" + destoryCount++);
    }


    // 서블릿 컨테이너에 의해 호출되며, 최초 요성시에는 init() 다음으로 동작
    // 이후 요청을 받을 때마다 service() 동작
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service() 메소드 호출" + serviceCount++);
    }
}

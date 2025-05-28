package org.scoula.ex02;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name="helloServlet", urlPatterns={"/xxx", "/yyy" })
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        System.out.println("블릿 객체생성시 초기화할 내용.. 한번만 호출");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }


    @Override
    public void destroy() {
        System.out.println("서블릿 객체소멸시 정리할 내용.. 한번만 호출");
    }
}
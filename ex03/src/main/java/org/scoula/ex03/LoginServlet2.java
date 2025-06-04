package org.scoula.ex03;

import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 컨트롤 기능 -> 전달된 데이터 추출, db처리 기능 (DAO호출)
        // userid = apple & passwd = 나는 한글이다, 파라메터
        String userid = req.getParameter("userid"); // apple, 전달받은 데이터는 모두 string으로 인식
        // 일단 파라메터 이름과 동일한 변수를 만들엇 저장해두는 편!
        String passwd = req.getParameter("passwd"); // 한글

        // 2. 응답하는 html 생성 ==> JSP로 하자!
        // 보낼 때 한글을 utf-8로 인코딩하고 싶으면 설정해야함.
        // http의 body로 전달되는 데이터는 한글 인코딩을 지정해주어야함.
        // 2-1. jsp에 출력할 항목 설정 ==> jsp파일을 forward할 때 req, res객체 전달함.
        // req객체의 전달할 항목으로 설정하면 jsp파일에 req객체와 함께 전달!
        req.setAttribute("userid", userid); // name은  String, value는 object
        req.setAttribute("passwd", passwd);

        // 2-2. 어떤 jsp 파일에 결과를 출력할지 설정(분배)
        RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
        // req.getRequestDispatcher("login.jsp").forward(req,resp);

        // 2-3. jsp파일을 호출(req, res 전달!)
        // 처리결과를 html로 만들고자 하는 경우 forward함
        rd.forward(req,resp);
        // 2-1에게 request객체로 항목 설정한 값이 따라감

    }


}


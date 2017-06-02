package com.draper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HomePage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language = req.getParameter("language");
        LanguageParse languageParse = new LanguageParse();
        List list = languageParse.getDetail(language);
        req.setAttribute("languageList", list);
        req.setAttribute("email", getServletContext().getInitParameter("email"));
        //请求分派器用来分派
        RequestDispatcher view = req.getRequestDispatcher("WEB-INF/result.jsp");
        view.forward(req, resp);
    }

    //覆盖只用覆盖无参版本就可以
    //若想获取 ServletConfig 只需调用 getServletConfig() 既可
    @Override
    public void init() throws ServletException {
        System.out.println("init()");
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
        super.destroy();
    }
}
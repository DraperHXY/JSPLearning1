package com.draper;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();

        String color = context.getInitParameter("Color");

        Sky sky = new Sky();
        sky.setColor(color);
        context.setAttribute("sky", sky);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

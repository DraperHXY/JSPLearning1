import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language = req.getParameter("language");
        LanguageParse languageParse = new LanguageParse();
        List list = languageParse.getDetail(language);
        req.setAttribute("languageList",list);

        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req,resp);
    }
}

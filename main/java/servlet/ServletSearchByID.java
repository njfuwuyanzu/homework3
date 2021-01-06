package servlet;

import com.google.gson.Gson;
import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import dao.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ServletSearchByID")
public class ServletSearchByID extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        String stuno = request.getParameter("stuno");
        StudentDaoImpl StudentDao=new StudentDaoImpl();
        List<Student> Student= (List<dao.Student>) StudentDao.getStudentByNo(stuno);
        Gson gson =new Gson();
        String student =gson.toJson(Student);
        PrintWriter out=response.getWriter();
        out.write(student);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

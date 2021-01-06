package servlet;

import com.google.gson.Gson;
import dao.Student;
import dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ServletSearchByName extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        String stuName=request.getParameter("search");
        StudentDaoImpl studentDao=new StudentDaoImpl();
        List<Student> Student=studentDao.getStudentByName(stuName);
        Gson gson =new Gson();
        String student =gson.toJson(Student);
        PrintWriter out=response.getWriter();
        out.write(student);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
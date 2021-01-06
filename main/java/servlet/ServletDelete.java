package servlet;

import dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletDelete")
public class ServletDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String stuno = request.getParameter("stuno");
        StudentDaoImpl studentDao=new StudentDaoImpl();
        boolean isSuccess = studentDao.deleteStdudent(stuno);
        if(isSuccess){
            PrintWriter out=response.getWriter();
            out.print("<script>alert('删除成功');window.location.href='ListStudents.html';</script>");
        }else{
            PrintWriter out=response.getWriter();
            out.print("<script>alert('删除失败');window.location.href='ListStudents.html';</script>");
        }
    }
}

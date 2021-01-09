package servlet;

import dao.impl.StudentDaoImpl;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String stuNo=request.getParameter("stuno");
        String stuName=request.getParameter("stuname");
        String classes=request.getParameter("classes");
        String gender=request.getParameter("gender");
        String department=request.getParameter("department");
        String tel=request.getParameter("tel");
        String dormNo=request.getParameter("dormNo");
        String photopath=request.getParameter("photopath");
        Student s=new Student(stuNo,stuName,classes,gender,department,tel,dormNo,photopath);
        StudentDaoImpl studentDao=new StudentDaoImpl();
        boolean isSuccess = studentDao.saveStudent(s);
        if(isSuccess){
            PrintWriter out=response.getWriter();
            out.print("<script>alert('添加成功');window.location.href='ListStudents.html';</script>");
        }else{
            PrintWriter out=response.getWriter();
            out.print("<script>alert('添加失败');window.location.href='AddStudent.html';</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package servlet;

import dao.Student;
import dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletUpdate")
public class ServletUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        String stuNo=request.getParameter("stuno");
        String stuName=request.getParameter("stuname");
        String classes=request.getParameter("classes");
        String gender=request.getParameter("gender");
        String department=request.getParameter("department");
        String tel=request.getParameter("tel");
        String dormNo=request.getParameter("dormNo");
        String photopath=request.getParameter("photopath");
        StudentDaoImpl studentDao=new StudentDaoImpl();
        Student s=new Student(stuNo,stuName,classes,gender,department,tel,dormNo,photopath);
        boolean isSuccess = studentDao.updateStdudent(stuNo,s);
        System.out.println(isSuccess);
        if(isSuccess){
            PrintWriter out=response.getWriter();
            out.print("<script>alert('更新成功');window.location.href='ListStudents.html';</script>");
        }else{
            PrintWriter out=response.getWriter();
            out.print("<script>alert('更新失败');window.location.href='ListStudents.html';</script>");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

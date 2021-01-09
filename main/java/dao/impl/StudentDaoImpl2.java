package dao.impl;

import dao.StudentDao;
import model.Student;
import util.C3p0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class StudentDaoImpl2 implements StudentDao {
    private  QueryRunner queryRunner=null;
    
    public List<Student> getAllStudent() throws SQLException {
        String sql="select * from tbl_student";
        queryRunner = new QueryRunner(C3p0Util.getConnection());
        List<Student> students = queryRunner.query(sql, new BeanListHandler<Student>(Student.class));
        return students;
    }

   
    public List<Student> getStudentsByName(String name) {
        return null;
    }

    
    public boolean saveStudent(Student s) {

        return false;
    }

    
    public Student getStudentByNo(String stuno) {
        return null;
    }

    
    public List<Student> getStudentByPaging(int currentPage, int pageSize) {
       String sql="select * from tbl_student where stuno limit ?,?";
       int start=(currentPage-1)*pageSize;
       queryRunner=new QueryRunner(C3p0Util.getConnection());
        try {
            /**
             * 如何才能把ResultSet转换为bean?
             * 1. java reflect, Student.class 动态创建Student对象,动态获取方法
             * 2. jdbc meta , 获取表的字段名称age
             * 3. 根据字段名称, 来调用Student的setter方法
             */
            List<Student> students = queryRunner.query(sql, new BeanListHandler<Student>(Student.class), new Object[]{start, pageSize});
            return  students;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    
    public long totalRecords() {
        String sql="select count(*) as count from tbl_student ";
        //long result=0;
        queryRunner = new QueryRunner(C3p0Util.getConnection());
        try {
            List<Map<String, Object>> query =queryRunner.query(sql, new MapListHandler());
            return (Long) query.get(0).get("count");
            /**
             * block scope 块作用域 ,在块内定义的变量,在块外不能方法
             */
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

    @Override
    public boolean deleteStdudent(String stuno) {
        return false;
    }
    @Override
    public List<dao.Student> getStudentByName(String name) {
        return null;
    }
    @Override
    public boolean updateStdudent(String stuNo, dao.Student s) {
        return false;
    }
}

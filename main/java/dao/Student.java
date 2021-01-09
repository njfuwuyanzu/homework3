package dao;

public class Student {
    private String stuNo;
    private String stuName;
    private String classes;
    private String gender;
    private String department;
    private String tel;
    private String dormNo;
    private String photopath;
    public Student(String stuNuo, String stuName, String classes, String gender, String department, String tel, String dornNo, String photopath) {
        this.stuNo = stuNuo;
        this.stuName = stuName;
        this.classes = classes;
        this.gender = gender;
        this.department = department;
        this.tel = tel;
        this.dormNo = dornNo;
        this.photopath = photopath;
    }
    public Student() {
        super();
    }
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNuo) {
        this.stuNo = stuNuo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDormNo() {
        return dormNo;
    }

    public void setDormNo(String dornNo) {
        this.dormNo = dornNo;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }
    public String toString() {
        return "student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", classes='" + classes + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", tel='" + tel + '\'' +
                ", dormNo='" + dormNo + '\'' +
                ", photoPath='" + photopath + '\'' +
                '}';
    }
}

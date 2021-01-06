package dao;

public class user {
    private String userName;
    private String password;
    public user(String userName, String password){
        this.password=password;
        this.userName=userName;
    }

    @Override
    public String toString() {
        return "user{" +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public user(){}


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package dao;

import model.User;

public interface UserDao {
    public boolean checkLogin(User user);
    boolean saveUser(User user);
    boolean updateStuno(String no);
}

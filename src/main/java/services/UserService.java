package services;

import database.dao.UserDAO;
import database.entyties.User;

public class UserService {

    private static UserDAO userDao;

    public UserService() {
        userDao = new UserDAO();
    }

    public void persist(User entity) {
        userDao.openCurrentSession();
        userDao.persist(entity);
        userDao.closeCurrentSession();
    }

    public User findById(String id) {
        userDao.openCurrentSession();
        User user = userDao.findById(id);
        userDao.closeCurrentSession();
        return user;
    }
}

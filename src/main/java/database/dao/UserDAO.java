package database.dao;



import Repository.UserRepository;
import database.entyties.User;
import org.hibernate.Session;

import java.util.List;

import static io.swagger.Swagger2SpringBoot.getSession;

public class UserDAO implements UserDAOInterface {

    private Session currentSession;




    public Session openCurrentSession() {
        final Session session = getSession();
        currentSession = session;
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    @Override
    public void persist(User entity) {
        getSession().persist(entity);
    }

    @Override
    public User findById(String id) {
        User user = currentSession.get(User.class, Integer.valueOf(id));
        return user;
    }



}

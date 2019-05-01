package database.dao;

import database.entyties.User;

import java.io.Serializable;
import java.util.List;

public interface UserDAOInterface<T, Id extends Serializable> {

    void persist(User entity);

    User findById(String id);

}

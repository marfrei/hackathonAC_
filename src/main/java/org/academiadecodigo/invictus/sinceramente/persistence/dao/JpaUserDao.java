package org.academiadecodigo.invictus.sinceramente.persistence.dao;

import org.academiadecodigo.invictus.sinceramente.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericDao<User> implements UserDao {
    public JpaUserDao() {
        super(User.class);
    }
}

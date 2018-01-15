package com.pbp333.springbootjpa.springBootJpa.Service;


import com.pbp333.springbootjpa.springBootJpa.Model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserServiceDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public long insertUser(User user){

        entityManager.persist(user);
        return user.getId();
    }


}

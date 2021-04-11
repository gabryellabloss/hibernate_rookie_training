package com.mastercard.commercial.hibernatetraining.hero.repository;

import com.mastercard.commercial.hibernatetraining.hero.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public User persist(User user) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }


}

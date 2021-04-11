package com.mastercard.commercial.hibernatetraining.hero.repository;

import com.mastercard.commercial.hibernatetraining.hero.entity.Team;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class TeamRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Team persist(Team team) {
        entityManager.persist(team);
        return team;
    }

    public Team merge(Team team) {
        return null;
    }

    public List<Team> findAll() {
        return entityManager.createQuery("from Team", Team.class).getResultList();
    }

}

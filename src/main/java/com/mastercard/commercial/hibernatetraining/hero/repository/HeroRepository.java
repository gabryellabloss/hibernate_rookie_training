package com.mastercard.commercial.hibernatetraining.hero.repository;

import com.mastercard.commercial.hibernatetraining.hero.entity.Hero;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class HeroRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Hero persist(Hero hero) {
        entityManager.persist(hero);
        return hero;
    }

    public Hero merge(Hero hero) {
        return null;
    }

    public List<Hero> findAll() {
        return entityManager.createQuery("from Hero").getResultList();
    }

    public Hero findById(Long id) {
        return entityManager.find(Hero.class, id);
    }

    public Hero findByIdHQL(Long id) {
        return null;
    }

    public List<Hero> findByInitialName(String name) {
        return null;
    }

    public List<Hero> findHeroesByMissionName(String missionName) {
        return null;
    }

}

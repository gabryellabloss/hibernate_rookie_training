package com.mastercard.commercial.hibernatetraining.hero.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Team extends BaseEntity {

    @OneToMany(mappedBy = "team")
    private List<Hero> heroList;

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hero> getHeroList() {
        if(heroList == null)
        {
            heroList = new ArrayList<>();
        }
        return heroList;
    }

    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }
}

package com.mastercard.commercial.hibernatetraining;

import com.mastercard.commercial.hibernatetraining.hero.entity.Hero;
import com.mastercard.commercial.hibernatetraining.hero.entity.Mission;
import com.mastercard.commercial.hibernatetraining.hero.entity.Team;
import com.mastercard.commercial.hibernatetraining.hero.entity.User;
import com.mastercard.commercial.hibernatetraining.hero.repository.HeroRepository;
import com.mastercard.commercial.hibernatetraining.hero.repository.MissionRepository;
import com.mastercard.commercial.hibernatetraining.hero.repository.TeamRepository;
import com.mastercard.commercial.hibernatetraining.hero.repository.UserRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HibernateTrainingApplication  implements ApplicationRunner {

	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private HeroRepository heroRepository;
	@Autowired
	private MissionRepository missionRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateTrainingApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		//Exerciocio 1: Mapeamentos - descomente para testar
		/*Team team = new Team();
		team.setName("Vingadores");

		teamRepository.persist(team);*/


		System.exit(0);


	}

}

package org.horizonefele.webMVC;

import org.horizonefele.webMVC.dao.TeamRepository;
import org.horizonefele.webMVC.entities.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CrudAppApplication.class, args);
		TeamRepository teamDao = ctx.getBean(TeamRepository.class);

		teamDao.save(new Team("Team1", new Float(45000)));
		teamDao.save(new Team("Team2", new Float(60000)));
		teamDao.save(new Team("Team3", new Float(40000)));
		teamDao.save(new Team("Team4", new Float(85000)));
		teamDao.save(new Team("Team5", new Float(600000)));
	}
}

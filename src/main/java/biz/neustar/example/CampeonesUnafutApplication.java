package biz.neustar.example;

import biz.neustar.example.jooq.tables.daos.EquiposDao;
import org.jooq.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CampeonesUnafutApplication {

	@Bean
	public EquiposDao equiposDao(Configuration configuration){
		return new EquiposDao(configuration);
	}

	public static void main(String[] args) {
		SpringApplication.run(CampeonesUnafutApplication.class, args);
	}
}

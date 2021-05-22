package jk.pp.platform.servers.spring.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ConfigServerMain.class);
		app.setAdditionalProfiles(new String[] { "platform-server-spring-config" });

		app.run(args);
	}

}

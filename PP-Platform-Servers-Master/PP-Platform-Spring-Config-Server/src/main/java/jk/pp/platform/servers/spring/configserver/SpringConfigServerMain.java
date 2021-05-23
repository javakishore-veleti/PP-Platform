package jk.pp.platform.servers.spring.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SpringConfigServerMain.class);
		app.setAdditionalProfiles(new String[] { "platform-server-spring-config" });

		app.run(args);
	}

}

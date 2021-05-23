package jk.pp.platform.servers.spring.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistryMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(EurekaServiceRegistryMain.class);

		app.setAdditionalProfiles(new String[] { "platform-server-spring-registry" });

		app.run(args);
	}

}

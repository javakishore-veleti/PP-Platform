package jk.pp.platform.servers.spring.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAPIGWMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SpringAPIGWMain.class);

		app.setAdditionalProfiles(
				new String[] { "platform-server-spring-apigw", "platform-server-spring-apigw-clients" });
		app.run(args);
	}

}

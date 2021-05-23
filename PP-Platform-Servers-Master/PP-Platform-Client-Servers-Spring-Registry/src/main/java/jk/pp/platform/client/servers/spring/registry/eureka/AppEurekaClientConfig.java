package jk.pp.platform.client.servers.spring.registry.eureka;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("pp-platform-client-servers-spring-registry-erueka")
@ConditionalOnProperty(name = "pp.platform.client.servers.spring.service.registry", havingValue = "true")
@Configuration
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = { "jk.pp.platform.client.servers.spring.registry.eureka" })
public class AppEurekaClientConfig {

}

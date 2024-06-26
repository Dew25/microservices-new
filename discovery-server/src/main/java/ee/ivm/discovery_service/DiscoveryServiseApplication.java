package ee.ivm.discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiseApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiseApplication.class, args);
    }
}

package mafoe;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Web application that serves as spring-boot-admin server for other servers (called client servers).
 * <br/>
 * Application is available at http://localhost:8080/. Login with username/password (literally).
 */
@EnableAdminServer
@SpringBootApplication
public class AdminServer {

    private static final Logger LOG = LoggerFactory.getLogger(AdminServer.class);

    public static void main(String[] args) {

        SpringApplication.run(AdminServer.class, args);

        LOG.info("Spring Boot Admin Server can be accessed via http://localhost:8080/");
        LOG.info("Log in with username/password (literally)");
    }
}

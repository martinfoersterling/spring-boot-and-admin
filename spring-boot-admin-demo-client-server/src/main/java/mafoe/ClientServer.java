package mafoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Web application that connects as a client to the admin server.
 * <br/>
 * You can start this server multiple times because it uses a random port.
 */
@SpringBootApplication
public class ClientServer {

    public static void main(String[] args) {
        SpringApplication.run(ClientServer.class, args);
    }
}

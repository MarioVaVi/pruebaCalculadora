package main.start;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import main.ApiConfig;

/**
 * The Class ProyectoRestServiceApplication.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { ApiConfig.class, ProyectoRestConfig.class })
public class ProyectoRestServiceApplication {

    /** The Constant _logger. */
    static final Logger _logger = LogManager.getLogger(ProyectoRestServiceApplication.class);

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	SpringApplication.run(ProyectoRestServiceApplication.class, args);
    }
}

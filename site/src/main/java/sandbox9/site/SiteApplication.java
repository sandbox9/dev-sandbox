package sandbox9.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"sandbox9.site"})
@EnableAutoConfiguration
public class SiteApplication {
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SiteApplication.class, args);
    }
}

package jjug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    ServletRegistrationBean calcServlet() {
        return new ServletRegistrationBean(new CalcServlet(), "/calc");
    }

    @Bean
    ServletRegistrationBean calc2Servlet() {
        return new ServletRegistrationBean(new Calc2Servlet(), "/calc2");
    }

    @Bean
    ServletRegistrationBean calc3Servlet() {
        return new ServletRegistrationBean(new Calc3Servlet(), "/calc3");
    }

    @Bean
    ServletRegistrationBean calc4Servlet() {
        return new ServletRegistrationBean(new Calc4Servlet(), "/calc4");
    }

    @Bean
    ServletRegistrationBean statsServlet() {
        return new ServletRegistrationBean(new StatsServlet(), "/stats");
    }
}

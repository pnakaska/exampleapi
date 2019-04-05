package pn.example.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "pn.example.apiserver")
public class MyAPIServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAPIServerApplication.class, args);
	}

}

package liuxg.client3;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Client3Application {

	public static void main(String[] args) {
		SpringApplication.run(Client3Application.class, args);
	}

}

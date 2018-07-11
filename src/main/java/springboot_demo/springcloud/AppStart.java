package springboot_demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AppStart {
	
    public static void main( String[] args )
    {
    	SpringApplication.run(AppStart.class, args);
    }
    
}

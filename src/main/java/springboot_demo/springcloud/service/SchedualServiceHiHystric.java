package springboot_demo.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HelloService{

	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}

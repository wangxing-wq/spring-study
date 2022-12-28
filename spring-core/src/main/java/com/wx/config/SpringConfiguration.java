package com.wx.config;

import com.wx.domain.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 22343
 * @version 1.0
 */
@Configuration
public class SpringConfiguration {
	
	@Bean
	public Person person(){
		return new Person("1","wx","sex");
	}
	
	@Bean
	public Animal animal(){
		return new Animal();
	}
	
	
	
	
}

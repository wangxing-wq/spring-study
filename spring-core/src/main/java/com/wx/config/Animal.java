package com.wx.config;

import com.wx.domain.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Animal {
	
	@Autowired
	Person person;
	
}

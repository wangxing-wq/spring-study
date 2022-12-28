package com.wx.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;

/**
 * @author 王兴
 * 2022/12/24 23-15
 */
@Data
@Lazy
@Builder
@AllArgsConstructor
public class Person implements InitializingBean {
	
	private String id;
	private String name;
	private String sex;
	
	public Person(){
		System.out.println("Person constructor");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化");
	}
}

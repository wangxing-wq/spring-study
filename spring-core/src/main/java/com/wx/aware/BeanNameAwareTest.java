package com.wx.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author 22343
 * @version 1.0
 */
public class BeanNameAwareTest implements BeanNameAware {
	
	private String name;
	
	@Override
	public void setBeanName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
}

package com.wx.factoryBean;

import com.wx.domain.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * 默认获取的bean 是当前类getObject得到的,如果需要获取FactoryBeanImpl,需要在
 * getName方法里的name加上&, 如右:getName("&factoryBeanImpl")
 * @author 22343
 * @version 1.0
 */
public class FactoryBeanImpl implements FactoryBean<Person> {
	
	@Override
	public Person getObject() throws Exception {
		return null;
	}
	
	@Override
	public Class<?> getObjectType() {
		return null;
	}
}

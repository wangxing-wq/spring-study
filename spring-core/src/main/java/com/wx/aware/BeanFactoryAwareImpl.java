package com.wx.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author 22343
 * @version 1.0
 */
public class BeanFactoryAwareImpl implements BeanFactoryAware {
	
	private BeanFactory beanFactory;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
}

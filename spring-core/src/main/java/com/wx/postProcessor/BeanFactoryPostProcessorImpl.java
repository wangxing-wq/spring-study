package com.wx.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

import java.util.Arrays;

/**
 * BeanFactoryPostProcessor,
 * @author 22343
 * @version 1.0
 */
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor , Ordered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("BeanDefinitionCount\t" + beanFactory.getBeanDefinitionCount());
		System.out.println("beanDefinitionNames\t" + Arrays.toString(beanDefinitionNames));
	}
	
	@Override
	public int getOrder() {
		return 0;
	}
}

package com.wx.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor,spring注解的方式大多通过BeanPostProcessor接口实现
 * 命名规则是 注解名称 + AnnotationBeanPostProcessor 例如:AutowiredAnnotationBeanPostProcessor
 * @author 22343
 * @version 1.0
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean,beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessAfterInitialization(bean,beanName);
	}
}

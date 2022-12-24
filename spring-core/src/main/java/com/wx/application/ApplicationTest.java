package com.wx.application;


import com.wx.aware.PersonAware;
import com.wx.service.PersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * Spring 存在三种注入方式.
 * 1. 根据Xml配置，例如通过ClassPathXmlApplicationContext，FilePathXmlApplicationContext 读取配置文件进行配置
 * 2. 根据java注解进行配置
 * 3. 根据java代码@Configuration, @Bean, @Import, 和 @DependsOn。
 * BeanPostProcessor 与注解是扩展Spring 的原理
 */
@Order
public class ApplicationTest {
	
	/**
	 * ApplicationContext是能够创建bean定义以及处理相互依赖关系的高级工厂接口
	 * @throws Exception
	 */
	@Test
	public void application() throws Exception {
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		PersonService bean = application.getBean(PersonService.class);
		System.out.println(bean.list());
		
	}
	@Test
	public void genApplication() {
		GenericApplicationContext context = new GenericApplicationContext();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println("beanDefinitionNames: " + beanDefinitionNames.length);
		System.out.println(Arrays.toString(beanDefinitionNames));
		System.out.println(context.containsBean("person"));
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("application.xml");
		context.refresh();
		System.out.println(context.containsBean("person"));
		System.out.println("beanDefinitionNames: " + beanDefinitionNames.length);
		System.out.println(Arrays.toString(beanDefinitionNames));
	}
	
	/**
	 * 自动注入测试,查看autowire.xml进行学习
	 */
	@Test
	public void autowire() throws Exception{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowrie.xml");
		PersonService bean = applicationContext.getBean(PersonService.class);
		System.out.println(bean.getPersonMapper());
	}
	
	/**
	 * aware 接口学习
	 */
	@Test
	public void aware(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aware.xml");
		PersonAware bean = applicationContext.getBean(PersonAware.class);
		System.out.println(bean.getPersonMapper().list());
	}
	
	
}

package com.xszheng.domain;

import javax.security.auth.Destroyable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, Destroyable {
	
	private final Logger logger = LoggerFactory.getLogger(BeanLifeCycle.class);

	private String name;
	
	public BeanLifeCycle() {
		super();
		logger.info("----constructor()-----");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		logger.info("----setName()-----");
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("----afterPropertiesSet()-----");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		if(arg0 instanceof BeanLifeCycle){
			logger.info("----postProcessAfterInitialization()-----");
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		if(arg0 instanceof BeanLifeCycle){
			logger.info("----postProcessBeforeInitialization()-----");
		}
		return arg0;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		logger.info("----setApplicationContext()-----");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		logger.info("----setBeanFactory()-----");
	}

	@Override
	public void setBeanName(String arg0) {
		logger.info("----setBeanName()-----");
	}
	
	public void init(){
		logger.info("----init()-----");
	}
	
	public void destroy(){
		logger.info("----destroy()-----");
	}
}

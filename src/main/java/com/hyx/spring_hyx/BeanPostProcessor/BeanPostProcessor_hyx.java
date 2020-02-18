package com.hyx.spring_hyx.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * spring中包含一个BeanPostProcessor的接口，可以在bean的初始化方法的前后调用该方法，
 * 如果配置了初始化方法的前置和后置处理器，无论是否包含初始化方法，都会进行调用
 */
public class BeanPostProcessor_hyx implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("初始化前"+beanName);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("初始化后"+beanName);
        return bean;
    }

}

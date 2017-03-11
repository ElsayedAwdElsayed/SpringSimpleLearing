/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author elsayedawd
 */
public class DispalyBeanName  implements BeanPostProcessor{

    //before intialzing the bean 
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
          System.out.println("before Intialization current bean Name is "+beanName);
          return bean;
    }
    
//after intializing the bean this will be excuted 
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
           
           System.out.println("after Intialization current bean Name is "+beanName);
           return bean;
    }
    
}

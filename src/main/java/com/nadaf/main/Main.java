/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.main;

import com.nadaf.beans.Traingle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author elsayedawd
 */
public class Main {

    public static void main(String[] args) {
        //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); the Normal application Context
        //the abstract application context that is used in the make the intialization events and destruction events of Spring beans
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook(); //when the application close the context closes and destroyes all the beans 
        Traingle traingle1 = (Traingle) context.getBean("traingle1");
        traingle1.draw();
    }
}

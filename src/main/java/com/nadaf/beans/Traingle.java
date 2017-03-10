/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.beans;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author elsayedawd
 */
//Implement Intializing bean ===> after setting the properites in the Spring.xml afterProperties method will be 
//called 
//Implementing DisposableBean when the application is closed and beans is cleaned  this method will be called
public class Traingle implements Serializable,ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
  
 private List<Point> points;
 
    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

   
   //I 'am here inject the value type into constructor 
    public Traingle()
    {
    
    }
    
    //print all the x,y of the points 
   public void draw()
    {
      
        System.out.println("draw method called here ----------------------"+ points.size());
        
    }
 //it is called after setting the application context that we have 
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("application context -----------------");
    }
//it is called first time 
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Intializing Bean ------------------ ");
    }
    
  //This method is called when the application is closed and the beaned is cleaning up 
    @Override
    public void destroy() throws Exception {
        System.out.println("cleaning Up -------------------------- ");          
    }
    //if I want to not to implements the the IntializingBean and the DisposableBean you should make this method and
    //then add this to the Spring.xml Configration 
    public void myInit()
    {
        System.out.println("MyInit Method is called ----------- ");
    }
    //also if I need to make my destroy method 
    public void myDestroy()
    {
        System.out.println("Mydestroy is called -------------- ");
    }
   
   
}

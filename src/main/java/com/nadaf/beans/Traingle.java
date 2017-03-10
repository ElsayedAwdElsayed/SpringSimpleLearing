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
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author elsayedawd
 */

public class Traingle implements Serializable,ApplicationContextAware,BeanNameAware{
  
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

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("application context -----------------");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
   
   
}

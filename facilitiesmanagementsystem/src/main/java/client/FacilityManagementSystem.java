package main.java.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.facility.*;
import main.java.client.*;
import main.java.maintenance.*;
import main.java.use.*;

public class FacilityManagementSystem {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
	    System.out.println("***************** Application Context instantiated! ******************");

    }
}
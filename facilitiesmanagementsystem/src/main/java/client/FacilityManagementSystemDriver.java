package main.java.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.facility.*;
//import main.java.client.*; unnnecessary 
import main.java.maintenance.*; 
import main.java.operations.FacilityOperations;
import main.java.use.*;

public class FacilityManagementSystemDriver {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        // Testing package imports
        Facility facility = (Facility) context.getBean("facility");
        facility = new Facility(6107, "Chicago", true, 100, false, 100, 17);
        User u = new User(0, 0, "Wednesday", 7);

        // Following line causes Bean Instantiation Exception
        FacilityManager facilityManager = (FacilityManager) context.getBean("facilityManager");
        facilityManager.addNewFacility(facility);

        //attaching facility as an observer to operationsManager
        FacilityOperations operationsManager = new FacilityOperations();
        operationsManager.attach(facility);
        operationsManager.makeMaintenanceRequest(facility, facility.getFacilityID(), "Deep Cleaning", 1);

        facility.printFacilityInfo();

        // TODO Add presentation logic here!
    }
}
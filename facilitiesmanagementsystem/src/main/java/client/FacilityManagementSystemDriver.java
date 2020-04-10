package main.java.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.facility.*;
//import main.java.client.*; unnnecessary 
import main.java.maintenance.*;
import main.java.use.*;

public class FacilityManagementSystemDriver {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        // Testing package imports
        Facility facility = new Facility(6107, "Chicago", true, 100, false, 100, 17);
        MaintenanceRequest cleaningMRequest = new MaintenanceRequest(0, 0, "Cleaning", 1);
        User u = new User(0, 0, "Wednesday", 7);

        // Following line causes Bean Instantiation Exception
        FacilityManager facilityManager = (FacilityManager) context.getBean("facilityManager");
        facilityManager.addNewFacility(facility);

        FacilityMaintenance facilityMaintenance = (FacilityMaintenance) context.getBean("facilityMaintenance");
        facilityMaintenance.addMaintenanceRequest(facility, cleaningMRequest);

        facility.printFacilityInfo();

        // TODO Add presentation logic here!
    }
}
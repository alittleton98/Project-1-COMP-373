package main.java.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.facility.*;
//import main.java.client.*; unnnecessary 
import main.java.maintenance.*;
import main.java.use.*;

public class FacilityManagementSystem {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        // Everything past this line does not work, but should.
        // Testing package imports
        Facility facility = new Facility(6107, "Chicago", true, 100, false, 100, 17);
        MaintenanceRequest cleaningMRequest = new MaintenanceRequest(0, 0, "Cleaning", 1);
        User u = new User(0, 0, "Wednesday", 7);

        FacilityManager facilityManager = (FacilityManager) context.getBean("facilitymanager");
        facilityManager.addNewFacility(facility);

        FacilityMaintenance facilityMaintenance = (FacilityMaintenance) context.getBean("facilitymaintenance");
        facilityMaintenance.addMaintenanceRequest(facility, cleaningMRequest);

        facility.printFacilityInfo();
    }
}
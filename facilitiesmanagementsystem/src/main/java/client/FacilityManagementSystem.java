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

        // Testing package imports
        Facility facil1 = (Facility) context.getBean("facility");
        facil1 = new Facility(6107, "Chicago", true, 100, false, 100, 17);
        
        MaintenanceRequest cleaningMRequest = (MaintenanceRequest) context.getBean("maintenanceRequest");
        cleaningMRequest = new MaintenanceRequest(0, 0, "Cleaning", 1);
        
        User user1 = (User) context.getBean("user");
        user1 = new User(0, 0, "Wednesday", 7);

        // Following line causes Bean Instantiation Exception
        FacilityManager facilityManager = (FacilityManager) context.getBean("facilityManager");
        facilityManager.addNewFacility(facil1);

        FacilityMaintenance facilityMaintenance = (FacilityMaintenance) context.getBean("facilityMaintenance");
        facilityMaintenance.addMaintenanceRequest(facil1, cleaningMRequest);

        facil1.printFacilityInfo();
    }
}
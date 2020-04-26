package main.java.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.facility.*;
//import main.java.client.*; unnnecessary 
import main.java.maintenance.*; 
import main.java.operations.*;
import main.java.use.*;

public class FacilityManagementSystemDriver {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Design pattern implementation objects
        BuilderImpl builder = new BuilderImpl();

        // Testing package imports
        Facility facility = (Facility) context.getBean("facility");
        facility = new Facility(6107, "Chicago", true, 100, false, 100, 17);
        User u = new User(0, 0, "Wednesday", 7);

        

        // Following line causes Bean Instantiation Exception
        FacilityManager facilityManager = (FacilityManager) context.getBean("facilityManager");
        facilityManager.addNewFacility(facility);

        //attaching facility as an observer to operationsManager
        FacilityOperationsManager operationsManager = (FacilityOperationsManager) context.getBean("facilityOperationsManager");
        operationsManager = new FacilityOperationsManager();
        operationsManager.attach(facility);
        operationsManager.makeMaintenanceRequest(facility, "Deep Cleaning", 1);

        facility.printFacilityInfo();

        //Builder Implentation
        Facility facility2 = builder.buildFacility();
        FacilityOperationsManager operationsManager2 = new FacilityOperationsManager();
        MaintenanceRequest builtMaintenanceRequest = builder.buildMaintenanceRequest(facility2, "testing", 7);
        operationsManager2.notifyUpdate(builtMaintenanceRequest); //feels clunky.Maybe apply to one line?


        // TODO Add presentation logic here!
    }
}
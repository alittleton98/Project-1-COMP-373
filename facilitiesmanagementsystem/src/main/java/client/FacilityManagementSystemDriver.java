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
        Facility facilityDefault = builder.buildFacilityDef();
        Facility facilityCustom = builder.buildFacility(6107, "Detroit", true, 15, false, 150, 140);
        FacilityOperationsManager operationsManager2 = new FacilityOperationsManager();
        MaintenanceRequest builtMaintenanceRequest1 = builder.buildMaintenanceRequest(facilityDefault, "testing Default Facility", 7);
        MaintenanceRequest builtMaintenanceRequest2 = builder.buildMaintenanceRequest(facilityCustom, "testing Custom Facility", 7);
        operationsManager2.notifyUpdate(builtMaintenanceRequest1); 
        operationsManager2.notifyUpdate(builtMaintenanceRequest2);

        // TODO Add presentation logic here!
    }
}
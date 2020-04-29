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
        VisitorImpl visitor = new VisitorImpl();

        // Testing package imports
        Building building1 = (Building) context.getBean("building");
        building1 = new Building();
        building1.setBuildingID(001);
        building1.setFacilityID(6107);
        building1.setBuildingService("IT");

        Facility facility = (Facility) context.getBean("facility");
        facility = new Facility();
        facility.setFacilityID(6107);
        facility.setFacilityLocation("Chicago");
        facility.setEmployeeCount(500);
        facility.setFacilityCapacity(1000);
        

        

        // Following line causes Bean Instantiation Exception
        FacilityManager facilityManager = (FacilityManager) context.getBean("facilityManager");
        facilityManager = new FacilityManager();
        facilityManager.addNewFacility(facility);

        //attaching facility as an observer to operationsManager
        FacilityOperationsManager operationsManager = (FacilityOperationsManager) context.getBean("facilityOperationsManager");
        operationsManager = new FacilityOperationsManager();
        operationsManager.attach(facility);
        MaintenanceRequest maintreq = (MaintenanceRequest) context.getBean("maintenanceRequest");
        maintreq = operationsManager.makeMaintenanceRequest(facility, "Deep Cleaning", 1);

        facility.printFacilityInfo();

        //Builder/Visitor Implentation
        FacilityManager builderFacilityManager = new FacilityManager();
        Facility facilityDefault = builder.buildFacilityDef(builderFacilityManager); //creates facility using builder class using default constructor
        Facility facilityCustom = builder.buildFacility(6107, "Detroit", true, 15, false, 150, 140, builderFacilityManager); //creates facility using builder class but with parameters
        FacilityOperationsManager operationsManager2 = new FacilityOperationsManager();
        MaintenanceRequest builtMaintenanceRequest1 = builder.buildMaintenanceRequest(facilityDefault, "testing Default Facility", 7); //creates maint req using builder for default facility
        MaintenanceRequest builtMaintenanceRequest2 = builder.buildMaintenanceRequest(facilityCustom, "testing Custom Facility", 7); //creates maint req for custom facility
        operationsManager2.notifyUpdate(builtMaintenanceRequest1); //uses observer to update facility manager with maintenance requests for the facility the req belongs to (facilityDefault)
        operationsManager2.notifyUpdate(builtMaintenanceRequest2); //uses observer to update facility manager with maintenance requests for the facility the req belongs to (facilityCustom)
        visitor.visit(builderFacilityManager); //performs visit function on facility manager declared above
        visitor.visit(operationsManager2); //performs visit function on facility manager declared above


    }
}
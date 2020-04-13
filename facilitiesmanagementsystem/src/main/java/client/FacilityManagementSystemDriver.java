package main.java.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.facility.*;
import main.java.maintenance.*;
import main.java.operations.FacilityOperations;
import main.java.use.*;

public class FacilityManagementSystemDriver {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

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
        facility.setBuildingCluster(building1);

        // Following line causes Bean Instantiation Exception
        FacilityManager facilityManager = (FacilityManager) context.getBean("facilityManager");
        facilityManager = new FacilityManager();
        facilityManager.addNewFacility(facility);

        // attaching facility as an observer to operationsManager
        FacilityOperations operationsManager = (FacilityOperations) context.getBean("facilityOperations");
        operationsManager = new FacilityOperations();
        operationsManager.attach(facility);
        MaintenanceRequest maintreq = (MaintenanceRequest) context.getBean("maintenanceRequest");
        maintreq = operationsManager.makeMaintenanceRequest(facility, "Deep Cleaning", 1);

        facility.printFacilityInfo();

        // TODO Add presentation logic here!
    }
}
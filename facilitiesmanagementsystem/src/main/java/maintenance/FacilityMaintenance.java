package main.java.maintenance;

//import faciltiy package
import main.java.facility.*;
import java.util.*;

//Faciltiy Maintenance interface
public interface FacilityMaintenance {
    public void makeMaintenanceRequest(Facility f);

    // public boolean facilityExists(int fID);

    public void scheduleMaintenance();

    public double calcMaintenanceCostForFacility(Facility f);

    public float calcProblemRateForFacility(Facility f);

    public int calcDownTimeForFacility(Facility f);

    public void listFacilityMaintRequests(Facility f);

    public void listMaintenance();

    public void listFacilityProblems(Facility f);

    public void addMaintenanceRequest(Facility f, MaintenanceRequest m);

    public ArrayList<MaintenanceRequest> getMaintenanceRequests();

}
package main.java.maintenance;

//import faciltiy package
import main.java.facility.*;
import java.util.*;

//Faciltiy Maintenance interface
public interface FacilityMaintenance {
    public MaintenanceRequest makeMaintenanceRequest(Facility f, String requestDesc, int daysReq);

    // public boolean facilityExists(int fID);

    public void scheduleMaintenance();

    public double calcMaintenanceCostForFacility(Facility f);

    public float calcProblemRateForFacility(Facility f);

    public int calcDownTimeForFacility(Facility f);

    public ArrayList<MaintenanceRequest> listFacilityMaintRequests(Facility f);

    public ArrayList<MaintenanceRequest> listMaintenance();

    public void listFacilityProblems(Facility f);

}
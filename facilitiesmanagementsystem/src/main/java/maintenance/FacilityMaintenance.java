package maintenance;

//import faciltiy package
import facility.*;

//Faciltiy Maintenance interface
public interface FacilityMaintenance {
    public void makeMaintenanceRequest();

    public void scheduleMaintenance();

    public double calcMaintenanceCostForFacility();

    public float calcProblemRateForFacility();

    public int calcDownTimeForFacility(Facility f);

    public void listMaintRequests(Facility f);

    public void listMaintenance();

    public void listFacilityProblems();

}
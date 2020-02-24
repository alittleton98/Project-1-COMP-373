package maintenance;

import facility.*;

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
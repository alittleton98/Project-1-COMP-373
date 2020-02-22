package maintenance;

public interface FacilityMaintenance {
    public void makeMaintenanceRequest();

    public void scheduleMaintenance();

    public double calcMaintenanceCostForFacility();

    public float calcProblemRateForFacility();

    public int calcDownTimeForFacility();

    public void listMaintRequests();

    public void listMaintenance();

    public void listFacilityProblems();

}
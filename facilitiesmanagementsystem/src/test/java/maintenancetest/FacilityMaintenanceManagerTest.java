package test.java.maintenancetest;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import main.java.facility.*;
import main.java.maintenance.FacilityMaintenanceManager;
import main.java.maintenance.MaintenanceRequest;

public class FacilityMaintenanceManagerTest {
    Facility testFacility = new Facility();
    MaintenanceRequest m = new MaintenanceRequest(0, 0, "test", 1);
    FacilityMaintenanceManager testMaintenanceManager;

    @Test
    public void makeMaintenanceRequest() {
        testMaintenanceManager.makeMaintenanceRequest(testFacility);
        assertTrue(testFacility.getMaintList().size() > 0);
    }

    @Test
    public void calcMaintenanceCostForFacility() {
        double testFacilityMaintCost = testFacility.getFacilityMaintenanceCost() * testFacility.getMaintList().size();
        assertTrue(testMaintenanceManager.calcMaintenanceCostForFacility(testFacility) == testFacilityMaintCost);
    }

    @Test
    public void addMaintRequestTest() {
        testMaintenanceManager.addMaintenanceRequest(testFacility, m);
        assertTrue(
                testFacility.getMaintList().contains(m) && testMaintenanceManager.getMaintenanceRequests().contains(m));
    }
    /*
     * Following tests may not be implemented
     * 
     * @Test public void scheduleMaintenance() {
     * 
     * }
     * 
     * 
     * 
     * @Test public float calcProblemRateForFacility() {
     * 
     * }
     * 
     * @Test public int calcDownTimeForFacility(Facility f) {
     * 
     * }
     * 
     * @Test public void listMaintRequests(Facility f) {
     * 
     * }
     * 
     * @Test public void listMaintenance() {
     * 
     * }
     * 
     * @Test public void listFacilityProblems() {
     * 
     * }
     */
}
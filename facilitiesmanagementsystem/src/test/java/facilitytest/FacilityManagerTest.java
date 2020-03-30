package test.java.facilitytest;

import static org.junit.Assert.*;

import org.junit.*;
import main.java.facility.*;

public class FacilityManagerTest {
    Facility testFacility = new Facility(0, "", true, 0, false, 1, 0);
    FacilityManager testFacilityManager;

    @Test
    public void addNewFacilityTest(Facility testFacility) {
        testFacilityManager.addNewFacility(testFacility);
        assertTrue(testFacilityManager.getFacilitiesList().contains(testFacility));
    }

    @Test
    public void removeFacilityTest(Facility testFacility) {
        testFacilityManager.removeFacility(testFacility);
        assertFalse(testFacilityManager.getFacilitiesList().contains(testFacility));
    }

    @Test
    public void requestAvailableCapacityTest(Facility testFacility) {
        int comparison = 100;
        testFacility.setFacilityCapacity(100);
        assertTrue(testFacility.getCapacityCount() == comparison);
    }

    // TODO: find way to automate following tests as they require console input
    // Automation should occur through the addFacilityDetail function and not
    // directly to Facility
    @Test
    public void facilityDetailChangeIDTest(Facility testFacility) {
        int newID = 1234;
        testFacilityManager.addFacilityDetail(testFacility, "ID");
        // automated value entry will occur here
        assertTrue(testFacility.getFacilityID() == newID);
    }

    @Test
    public void facilityDetailChangeLocTest(Facility testFacility) {
        String newLoc = "Detroit";
        testFacilityManager.addFacilityDetail(testFacility, "Location");
        // automated value entry will occur here
        assertTrue(testFacility.getFacilityLocation() == newLoc);
    }

    @Test
    public void facilityDetailChangeUseCondTest(Facility testFacility) {
        boolean newUseCond = false;
        testFacilityManager.addFacilityDetail(testFacility, "Use Condition");
        // automated value entry will occur here
        assertTrue(testFacility.getFacilityUseCondition() == newUseCond);
    }

    @Test
    public void facilityDetailChangeMaintCostTest(Facility testFacility) {
        int newMaintCost = 5555;
        testFacilityManager.addFacilityDetail(testFacility, "Use Condition");
        // automated value entry will occur here
        assertTrue(testFacility.getFacilityMaintenanceCost() == newMaintCost);
    }

    @Test
    public void facilityDetailChangeMaintStatTest(Facility testFacility) {
        boolean newMaintStat = true;
        testFacilityManager.addFacilityDetail(testFacility, "Use Condition");
        // automated value entry will occur here
        assertTrue(testFacility.getFacilityMaintenanceStatus() == newMaintStat);
    }

    @Test
    public void facilityDetailChangeEmpCountTest(Facility testFacility) {
        int newEmpCount = 10;
        int initalEmpCount = testFacility.getEmployeeCount();
        testFacilityManager.addFacilityDetail(testFacility, "Use Condition");
        // automated value entry will occur here
        assertTrue(testFacility.getEmployeeCount() == newEmpCount + initalEmpCount);
    }

    @Test
    public void facilityDetailChangeEmpCountOverCapTest(Facility testFacility) {
        int newEmpCount = 1000;
        testFacility.setFacilityCapacity(100);
        testFacilityManager.addFacilityDetail(testFacility, "Use Condition");
        // automated value entry will occur here
        // TODO: Also find way to check for printed wrong input message
    }

}

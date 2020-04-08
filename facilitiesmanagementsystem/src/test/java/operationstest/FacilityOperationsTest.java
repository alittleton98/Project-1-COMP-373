package test.java.operationstest;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import main.java.facility.*;
import main.java.maintenance.*;
import main.java.use.*;
import main.java.operations.*;

public class FacilityOperationsTest {
    Facility testFacility = new Facility();
    MaintenanceRequest m = new MaintenanceRequest(0, 0, "test", 1);
    User testUser = new User(12345678, 0, "Monday", 1);
    FacilityOperations testFacilityOperations;

    @Test
    public void assignFacilityToUse() {
        testFacility.setFacilityID(1234);
        testFacilityOperations.assignFacilityToUse(testFacility, testUser);
        assertTrue(testUser.getFacilityID() == testFacility.getFacilityID()
                && testFacilityOperations.getUsers().contains(testUser));
    }

    @Test
    public void makeMaintenanceRequest() {
        testFacilityOperations.makeMaintenanceRequest(testFacility, testFacility.getFacilityID(), "Testing", 1);
        assertTrue(testFacility.getMaintList().size() > 0);
    }

    @Test
    public void calcMaintenanceCostForFacility() {
        double testFacilityMaintCost = testFacility.getFacilityMaintenanceCost() * testFacility.getMaintList().size();
        assertTrue(testFacilityOperations.calcMaintenanceCostForFacility(testFacility) == testFacilityMaintCost);
    }

    @Test
    public void addMaintRequestTest() {
        testFacilityOperations.addMaintenanceRequest(testFacility, m);
        assertTrue(
                testFacility.getMaintList().contains(m) && testFacilityOperations.getMaintenanceRequests().contains(m));
    }
}
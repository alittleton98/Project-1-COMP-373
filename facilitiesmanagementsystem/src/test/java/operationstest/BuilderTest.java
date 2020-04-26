package test.java.operationstest;

import main.java.facility.*;
import main.java.maintenance.MaintenanceRequest;
import main.java.operations.*;
import static org.junit.Assert.assertTrue;
import org.junit.*;

public class BuilderTest {
    Builder testBuilder = new BuilderImpl();
    Facility testFacility;
    MaintenanceRequest testMaintenanceRequest;
    FacilityManager testFacilityManager = new FacilityManager();
    FacilityOperationsManager testFacilityOperationsManager = new FacilityOperationsManager();

    @Test
    public void testFacilityBuildDefault(){
        testFacility = testBuilder.buildFacilityDef(testFacilityManager);
        assertTrue(testFacilityManager.getFacility(testFacility.getFacilityID()).getFacilityID() == testFacility.getFacilityID());
    }

    @Test 
    public void testMaintenanceRequestBuild(){
        testMaintenanceRequest = testBuilder.buildMaintenanceRequest(testFacility, "testing Default Facility", 7);
        testFacilityOperationsManager.notifyUpdate(testMaintenanceRequest);
        assertTrue(testFacility.getMaintList().contains(testMaintenanceRequest));
    }
}


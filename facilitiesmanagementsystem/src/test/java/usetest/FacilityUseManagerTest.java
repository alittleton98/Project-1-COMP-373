package test.java.usetest;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import main.java.facility.*;
import main.java.use.FacilityUseManager;
import main.java.use.User;

public class FacilityUseManagerTest {
    Facility testFacility = new Facility();
    User testUser = new User(12345678, 0, "Monday", 1);
    FacilityUseManager testUseManager;

    @Test
    public void assignFacilityToUse() {
        testFacility.setFacilityID(1234);
        testUseManager.assignFacilityToUse(testFacility, testUser);
        assertTrue(testUser.getFacilityID() == testFacility.getFacilityID()
                && testUseManager.getUsers().contains(testUser));
    }

    /*
     * 
     * TODO: Figure how to implement or if following tests will be implemented
     * 
     * @Test public boolean isInUseDuringIntervalReturnBool(Facility f) { boolean
     * inUse = false; return inUse; }
     * 
     * 
     * 
     * @Test public void vacateFacility() {
     * 
     * }
     * 
     * @Test public String[] listInspections() {
     * 
     * }
     * 
     * @Test public void listActualUsage() {
     * 
     * }
     * 
     * @Test public int calcUsageRate() { int finalUsageRate = 0; return
     * finalUsageRate; }
     */

}

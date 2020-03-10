package facilitytest;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import facility.*;

public class FacilityManagerTest {
    Facility testFacility;
    FacilityManager testFacilityManager;

    @Test
    public int requestAvailableCapacityTest(Facility testFacility) {
        testFacility.setEmployeeCount(55);
        testFacility.setFacilityCapacity(155);
        assertEquals(testFacility.getCapacityCount(), 100);
    }

    @Test
    public void addNewFacilityTest(Facility testFacility) {
        testFacilityManager.addNewFacility(testFacility);
        assertTrue(testFacilityManager.getFacilitiesList().contains(testFacility));
    }

    @Test
    public void addFacilityDetailTest(Facility testFacility, String detail) {
        
    }

    @Test
    public Facility removeFacilityTest(Facility f) {

    }
}

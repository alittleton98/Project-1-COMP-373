package facilitytest;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import facility.*;

public class FacilityManagerTest {
    Facility testFacility;
    FacilityManager testFacilityManager;

    @Test
    public int requestAvailableCapacityTest(Facility f) {

    }

    @Test
    public void addNewFacilityTest(Facility testFacility) {
        testFacilityManager.addNewFacility(testFacility);
        assertTrue(testFacilityManager.getFacilitiesList().contains(testFacility));
    }

    @Test
    public void addFacilityDetailTest(Facility f, String detail) {

    }

    @Test
    public Facility removeFacilityTest(Facility f) {

    }
}

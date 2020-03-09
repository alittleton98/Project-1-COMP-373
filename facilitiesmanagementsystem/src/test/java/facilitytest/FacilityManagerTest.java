package facilitytest;
import org.junit.*;
import facility.*;

public class FacilityManagerTest{
    FacilityManager testFacilityManager = new FacilityManager();
    Facility testFacility = new Facility();
    
    @Test
    public void listAvailableFacilitiesTest(){
        
    }

    @Test
    public void getFacilityInformationTest(Facility f){
        
    }

    @Test
    public int requestAvailableCapacityTest(Facility f){
        
    }

    @Test
    public void addNewFacilityTest(Facility f){
        testFacilityManager.addNewFacility(f);
    }

    @Test
    public void addFacilityDetailTest(Facility f, String detail){

    }

    @Test
    public Facility removeFacilityTest(Facility f){

    }
}

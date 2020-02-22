package facility;

import java.util.*;

public class FacilityManager implements FacilityManagement {
    protected ArrayList<Facility> FacilitiesList;
    protected ArrayList<Facility> availableFacilities;

    public void listAvailableFacilities() {
        for (int i = 0; i < availableFacilities.size(); i++) {
            if (availableFacilities(i).getFacilityUseCondition() == false) {
                System.out.println(availableFacilities(i).getFacilityID());
            }
        }
    }

    public void getFacilityInformation(Facility f) {
        f.printFacilityInfo();
    }

    public int requestAvailableCapacity(Facility f) {
        int cap = f.FACILITY_CAPACITY;
        int currentCount = f.employeeCount;

        return cap - currentCount;
    }

    public void addNewFacility(Facility f) {

    }

    public void addFacilityDetail(Facility f, String detail) {
        switch (detail) {
            case "ID":

            case "Location":
            
            case value:

            case value:

            case value:

            case value:

            case value:

            default:
                System.out.println("Nothing was changed");
        }
    }

    public Facility removeFacility(Facility f) {
        FacilitiesList.remove(f);
        return f;
    }

}

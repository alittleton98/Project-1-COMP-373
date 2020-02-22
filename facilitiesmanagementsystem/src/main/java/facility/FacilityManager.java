package facility;

import java.util.*;

public class FacilityManager implements FacilityManagement {
    protected ArrayList<Facility> FacilitiesList;
    protected ArrayList<Facility> availableFacilities;
    Scanner user = new Scanner(System.in);

    public void listAvailableFacilities() {
        for (int i = 0; i < availableFacilities.size(); i++) {
            if (availableFacilities.get(i).getFacilityUseCondition() == false) {
                System.out.println(availableFacilities.get(i).getFacilityID());
            }
        }
    }

    public void getFacilityInformation(Facility f) {
        f.printFacilityInfo();
    }

    public int requestAvailableCapacity(Facility f) {
        return f.getCapacityCount();
    }

    public void addNewFacility(Facility f) {
        FacilitiesList.add(f);
    }

    public void addFacilityDetail(Facility f, String detail) {
        switch (detail) {
            case "ID":
                //

            case "Location":
                //

            case "Use Condition":
                //

            case "Maintenance Cost":
                //

            case "Maintenance Status":
                //

            case "Employee Count":
                //

            default:
                System.out.println("Nothing was changed");
        }
    }

    public Facility removeFacility(Facility f) {
        FacilitiesList.remove(f);
        return f;
    }

}

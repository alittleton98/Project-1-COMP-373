package main.java.facility;

public class Building {
    private int BuildingIDNum; // Building Identification number
    private int facilityIDNum; // Facility Identification number
    private String buildingService; // Building service description

    // Default constructor for building
    public Building() {
        BuildingIDNum = 0;
        facilityIDNum = 0;
        buildingService = "Warehouse";
    }

    public void setBuildingID(int n) {
        BuildingIDNum = n;
    }

    public int getBuildingID() {
        return BuildingIDNum;
    }

    public void setFacilityID(int n) {
        facilityIDNum = n;
    }

    public int getFacilityID() {
        return facilityIDNum;
    }

    public void setBuildingService(String buildServ) {
        buildingService = buildServ;
    }

    public String getBuildingService() {
        return buildingService;
    }

}

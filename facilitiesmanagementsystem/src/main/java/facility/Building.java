package facility;

public class Building {
    private int BuildingIDNum;
    private int facilityIDNum;
    private String buildingService;

    Building() {
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

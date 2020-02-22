package fms;

import java.util.*;

public class Facility {
    private int facilityIDNum;
    private String facilityLocation;
    private ArrayList<Building> buildingCluster;
    private int costToMaintain;
    private boolean inMaintenance;
    private final int FACILITY_CAPACITY;

    Facility() {
        facilityIDNum = 0;
        facilityLocation = "";
        buildingCluster = null;
        costToMaintain = 1;
        inMaintenance = false;
        FACILITY_CAPACITY = 100;
    }

    Facility(int fID, String loc, ArrayList<Building> clust, int cost, boolean maint, int cap) {
        facilityIDNum = fID;
        facilityLocation = loc;
        buildingCluster = clust;
        costToMaintain = cost;
        inMaintenance = maint;
        FACILITY_CAPACITY = cap;
    }

    public void setFacilityID(int n) {
        facilityIDNum = n;
    }

    public int getFacilityID() {
        return facilityIDNum;
    }

    public void setFacilityLocation(String loc) {
        facilityLocation = loc;
    }

    public String getFacilityLocation() {
        return facilityLocation;
    }

    public void addBuilding(Building b) {

    }

}
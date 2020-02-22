package facility;

import java.util.*;

public class Facility {
    private int facilityIDNum;
    private String facilityLocation;
    private boolean inUse;
    private ArrayList<Building> buildingCluster;
    private int costToMaintain;
    private boolean inMaintenance;
    protected final int FACILITY_CAPACITY;
    protected int employeeCount;

    Facility() {
        facilityIDNum = 0;
        facilityLocation = "";
        inUse = false;
        buildingCluster = new ArrayList<Building>();
        costToMaintain = 1;
        inMaintenance = false;
        FACILITY_CAPACITY = 100;
        employeeCount = 1;
    }

    Facility(int fID, String loc, boolean useCond, Building b, int cost, boolean maint, int cap, int empCount) {
        facilityIDNum = fID;
        facilityLocation = loc;
        inUse = useCond;
        buildingCluster = new ArrayList<Building>();
        buildingCluster.add(b);
        costToMaintain = cost;
        inMaintenance = maint;
        FACILITY_CAPACITY = cap;
        employeeCount = empCount;
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

    public void setFacilityUseCondition(boolean b) {
        inUse = b;
    }

    public boolean getFacilityUseCondition() {
        return inUse;
    }

    public void addBuilding(Building b) {
        buildingCluster.add(b);
    }

    public void setEmployeeCount(int n) {
        employeeCount = employeeCount + n;
    }

    public int getCapacityCount() {
        return FACILITY_CAPACITY - employeeCount;
    }

    public void printFacilityInfo() {
        System.out.println("Facility ID Number:                     " + facilityIDNum);
        System.out.println("Facility Location:                      " + facilityLocation);
        System.out.println("Number of Buildings:                    " + buildingCluster.size());
        System.out.println("Cost to Maintain (in Thousands USD):    " + costToMaintain);
        System.out.println("Maintenance Status:                     " + inMaintenance);
        System.out.println("Facility Employee Capacity:             " + FACILITY_CAPACITY);
        System.out.println("Facility Employees Present:             " + employeeCount);
    }
}
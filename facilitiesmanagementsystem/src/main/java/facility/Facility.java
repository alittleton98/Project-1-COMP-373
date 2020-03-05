package facility;

import java.util.*;
import maintenance.*;

public class Facility {
    private int facilityIDNum;
    private String facilityLocation;
    private boolean inUse;
    private ArrayList<Building> buildingCluster;
    private double costToMaintain;
    private boolean inMaintenance;
    private final int FACILITY_CAPACITY;
    private int employeeCount;
    protected ArrayList<MaintenanceRequest> facilityMaintenanceRequests;

    // Default constructor for faciltiy object
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

    // constructor for faciltiy object
    Facility(int fID, String loc, boolean useCond, Building b, double cost, boolean maint, int cap, int empCount) {
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

    public void setFacilityMaintenanceCost(double n) {
        costToMaintain = n;
    }

    public double getFacilityMaintenanceCost() {
        return costToMaintain;
    }

    public void setFacilityMaintenanceStatus(boolean b) {
        inMaintenance = b;
    }

    public boolean getFacilityMaintenanceStatus() {
        return inMaintenance;
    }

    // Function to add buildings to facility
    public void addBuilding(Building b) {
        buildingCluster.add(b);
    }

    // Function to add any given number of employees to facility
    public void addEmployees(int n) {
        employeeCount = employeeCount + n;
    }

    // Function to add any given number of employees to facility
    public int getEmployeeCount() {
        return employeeCount;
    }

    // Function to return number of spaces available at the facility for emoplyees
    public int getCapacityCount() {
        return FACILITY_CAPACITY - employeeCount;
    }

    // Function to add a maintenacne request to the facility
    public void addMaintenanceRequest(MaintenanceRequest m) {
        facilityMaintenanceRequests.add(m);
    }

    // Function to list all maintenance requests at the selected faciltiy
    public void listMaintenanceRequests() {
        for (int i = 0; i < facilityMaintenanceRequests.size(); i++) {
            System.out.println(facilityMaintenanceRequests.get(i).printRequestInfo());

        }
    }

    // Returns all facility information
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
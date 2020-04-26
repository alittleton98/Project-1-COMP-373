package main.java.facility;

import java.util.*;
import main.java.maintenance.*;
import main.java.use.*;

public class Facility implements Observer {
    private int facilityIDNum;
    private String facilityLocation;
    private boolean inUse;
    private ArrayList<Building> buildingCluster;
    private double costToMaintain;
    private boolean inMaintenance;
    private int FACILITY_CAPACITY;
    private int employeeCount;
    protected ArrayList<MaintenanceRequest> facilityMaintenanceRequests;
    protected ArrayList<Inspection> facilityInspections;

    // Default constructor for facility object
    public Facility() {
        this.facilityIDNum = 0;
        this.facilityLocation = "";
        this.inUse = false;
        this.buildingCluster = new ArrayList<Building>();
        this.costToMaintain = 1;
        this.inMaintenance = false;
        this.FACILITY_CAPACITY = 100;
        this.employeeCount = 1;
    }

    // constructor for faciltiy object
    public Facility(int fID, String loc, boolean useCond, double cost, boolean maint, int cap, int empCount) {
        this.facilityIDNum = fID;
        this.facilityLocation = loc;
        this.inUse = useCond;
        this.buildingCluster = new ArrayList<Building>();
        // buildingCluster.add(b);
        this.costToMaintain = cost;
        this.inMaintenance = maint;
        this.FACILITY_CAPACITY = cap;
        this.employeeCount = empCount;
    }

    public void setFacilityID(int n) {
        this.facilityIDNum = n;
    }

    public int getFacilityID() {
        return facilityIDNum;
    }

    public void setFacilityLocation(String loc) {
        this.facilityLocation = loc;
    }

    public String getFacilityLocation() {
        return facilityLocation;
    }

    public void setFacilityUseCondition(boolean b) {
        this.inUse = b;
    }

    public boolean getFacilityUseCondition() {
        return inUse;
    }

    public void setFacilityMaintenanceCost(double n) {
        this.costToMaintain = n;
    }

    public double getFacilityMaintenanceCost() {
        return costToMaintain;
    }

    public void setFacilityMaintenanceStatus(boolean b) {
        this.inMaintenance = b;
    }

    public boolean getFacilityMaintenanceStatus() {
        return inMaintenance;
    }

    public void addInspection() {
        Inspection i = new Inspection(this.facilityIDNum);
        this.facilityInspections.add(i);
    }

    public ArrayList<Inspection> getInspections() {
        return facilityInspections;
    }

    // Function to add buildings to facility
    public void addBuilding(Building b) {
        buildingCluster.add(b);
        b.setFacilityID(facilityIDNum);
    }

    // Function to add any given number of employees to facility
    public void addEmployees(int n) {
        this.employeeCount = employeeCount + n;
    }

    public void setEmployeeCount(int n) {
        this.employeeCount = n;
    }

    public void setFacilityCapacity(int n) {
        this.FACILITY_CAPACITY = n;
    }

    // Function to add any given number of employees to facility
    public int getEmployeeCount() {
        return employeeCount;
    }

    // Function to return number of spaces available at the facility for emoplyees
    public int getCapacityCount() {
        return FACILITY_CAPACITY - employeeCount;
    }

    public ArrayList<MaintenanceRequest> getMaintList() {
        return facilityMaintenanceRequests;
    }

    //OBSERVER IMPL. to set maintenance requests based on observing FacilityOperations
    @Override
    public void update(MaintenanceRequest maintenance){
        if (maintenance.getFacilityID() == this.facilityIDNum) {
            this.facilityMaintenanceRequests.add(maintenance);
        }
    }

    // Function to list all maintenance requests at the selected faciltiy
    public void listMaintenanceRequests() {
        for (int i = 0; i < facilityMaintenanceRequests.size(); i++) {
            facilityMaintenanceRequests.get(i).printRequestInfo();
        }
    }

    public ArrayList<MaintenanceRequest> getMaintenanceRequests(){
        return facilityMaintenanceRequests;
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
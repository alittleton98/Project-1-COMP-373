package main.java.facility;

import java.util.*;

//Facility manager class
//Provides functionality for Facility interface

public class FacilityManager implements FacilityManagement {
    protected ArrayList<Facility> FacilitiesList;
    protected ArrayList<Facility> availableFacilities;
    Scanner user = new Scanner(System.in);

    // Function to list all available facilities from the FacilitiesList Arraylist
    
    public FacilityManager(){
        this.FacilitiesList = new ArrayList<Facility>();
        this.availableFacilities = new ArrayList<Facility>();
    }
    
    
    public void listAvailableFacilities() {
        for (int i = 0; i < availableFacilities.size(); i++) {
            if (availableFacilities.get(i).getFacilityUseCondition() == false) {
                System.out.println(availableFacilities.get(i).getFacilityID());
            }
        }
    }

    public ArrayList<Facility> getFacilitiesList() {
        return FacilitiesList;
    }

    // Provides information for the provided facility
    public void getFacilityInformation(Facility f) {
        f.printFacilityInfo();
    }

    // Provides the available capacity for provided facility
    public int requestAvailableCapacity(Facility f) {
        return f.getCapacityCount();
    }

    // Adds new facility to FacilitiesList arraylist
    public void addNewFacility(Facility f) {
        this.FacilitiesList.add(f);
    }

    // TODO fix presentation logic
    // NEEDS TO ACCEPT VALUE
    // Changes selected detail for the selected facility
    public void addFacilityDetail(Facility f, String detail) {
        /*
         * switch (detail) { case "ID":
         * System.out.print("Please enter the new ID number for this faciltiy: ");
         * f.setFacilityID(user.nextInt()); System.out.println("Facility ID is now " +
         * f.getFacilityID());
         * 
         * case "Location":
         * System.out.print("Please enter the new ID number for this faciltiy: ");
         * f.setFacilityLocation(user.nextLine());
         * System.out.println("Facility ID is now " + f.getFacilityLocation());
         * 
         * case "Use Condition": System.out.print(
         * "Please enter the new use status for this facility (\"true\" for in use/\"false\" for not in use): "
         * ); String useBool = user.nextLine(); if (useBool.equals("true") ||
         * useBool.equals("True")) { f.setFacilityUseCondition(true); } if
         * (useBool.equals("false") || useBool.equals("False")) {
         * f.setFacilityUseCondition(false); }
         * System.out.println("Facility Use Condition is now: " +
         * f.getFacilityUseCondition()); case "Maintenance Cost":
         * System.out.print("Please enter the new maintenance cost for this faciltiy: "
         * ); f.setFacilityMaintenanceCost(user.nextDouble());
         * System.out.println("Facility maintenance cost is now " +
         * f.getFacilityMaintenanceCost());
         * 
         * case "Maintenance Status": System.out.print(
         * "Please enter the new use status for this facility (\"true\" for in use/\"false\" for not in use): "
         * ); String maintBool = user.nextLine(); if (maintBool.equals("true") ||
         * maintBool.equals("True")) { f.setFacilityMaintenanceStatus(true); } if
         * (maintBool.equals("false") || maintBool.equals("False")) {
         * f.setFacilityMaintenanceStatus(false); }
         * System.out.println("Facility Use Condition is now: " +
         * f.getFacilityMaintenanceStatus());
         * 
         * case "Employee Count":
         * System.out.print("Please enter the number of new employees added: "); int
         * newCount = user.nextInt(); do { if (f.getEmployeeCount() >
         * f.getCapacityCount()) {
         * System.out.println("EMPLOYEE COUNT EXCEEDS FACILITY CAPACITY"); } else {
         * f.addEmployees(newCount);
         * System.out.println("Facility employee count is now " + f.getEmployeeCount());
         * } } while (newCount > f.getCapacityCount());
         * 
         * default: System.out.println("Nothing was changed");
         * 
         * }
         */
    }

    // Removes the facility from the FacilitiesList arraylist
    public Facility removeFacility(Facility f) {
        FacilitiesList.remove(f);
        return f;
    }

}

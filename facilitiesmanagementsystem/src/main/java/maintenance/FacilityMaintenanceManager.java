package main.java.maintenance;

import java.util.*;
import main.java.facility.*;

public class FacilityMaintenanceManager implements FacilityMaintenance {
    protected ArrayList<MaintenanceRequest> maintenanceRequestsList;
    private int requestCount = 0;
    Scanner user = new Scanner(System.in);
    // TODO: SPLIT MAINTENANCE LISTS TO ACTIVE AND INACTIVE FOR EACH FACILITY

    // Function to generate a maintenance request
    public void makeMaintenanceRequest(Facility f) {
        int fID;
        String request;
        int days;
        System.out.println("Please enter the follow information: ");
        System.out.print("Facility ID: ");
        fID = user.nextInt();
        System.out.print("Request description: ");
        request = user.nextLine();
        System.out.print("Days required: ");
        days = user.nextInt();
        MaintenanceRequest m = new MaintenanceRequest(requestCount + 1, fID, request, days);
        maintenanceRequestsList.add(m);
        requestCount++;
        f.addMaintenanceRequest(m);
    }

    public void scheduleMaintenance() {
        // unsure
    }

    public double calcMaintenanceCostForFacility(Facility f) {
        double finalCost = 0.0;
        finalCost = f.getFacilityMaintenanceCost() * f.getMaintList().size();
        return finalCost;
    }

    public float calcProblemRateForFacility(Facility f) {
        float finalProblemRate = 0f;
        // unsure
        return finalProblemRate;
    }

    // TODO: to be done after step above. Use active maint list for this function
    public int calcDownTimeForFacility(Facility f) {
        int daysDown = 1;
        for (int i = 0; i < f.getMaintList().size(); i++) {
            MaintenanceRequest m = f.getMaintList().get(i);

        }
        return daysDown;
    }

    // Lists Maintenance requests for a specific facility
    public void listFacilityMaintRequests(Facility f) {
        f.listMaintenanceRequests();
    }

    // Lists all current maintenance requests.
    public void listMaintenance() {
        for (int i = 0; i < maintenanceRequestsList.size(); i++) {
            if (maintenanceRequestsList.get(i).getCompletionStatus()) {
                maintenanceRequestsList.get(i).printRequestInfo();
                System.out.println();
            }
        }
    }

    public void listFacilityProblems(Facility f) {
        // unsure
    }

    public void addMaintenanceRequest(Facility f, MaintenanceRequest m) {
        maintenanceRequestsList.add(m);
        requestCount++;
        f.addMaintenanceRequest(m);
    }

    public ArrayList<MaintenanceRequest> getMaintenanceRequests() {
        return maintenanceRequestsList;
    }
}
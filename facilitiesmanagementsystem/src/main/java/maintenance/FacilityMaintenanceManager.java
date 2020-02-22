package maintenance;

import java.util.*;
import facility.*;

public class FacilityMaintenanceManager implements FacilityMaintenance {
    protected ArrayList<MaintenanceRequest> maintenanceRequestsList;
    private int requestCount = 0;
    Scanner user = new Scanner(System.in);

    public void makeMaintenanceRequest() {
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
    }

    public void scheduleMaintenance() {
        // unsure
    }

    public double calcMaintenanceCostForFacility() {
        double finalCost = 0.0;
        // multiply facilility maintenance cost by size of maintenance requests list
        // size
        return finalCost;
    }

    public float calcProblemRateForFacility() {
        float finalProblemRate = 0f;
        // unsure
        return finalProblemRate;
    }

    public int calcDownTimeForFacility(Facility f) {
        int daysDown = 1;
        // sum maintenance requests days for a given facility
        return daysDown;
    }

    public void listMaintRequests(Facility f) {
        f.listMaintenanceRequests();
    }

    public void listMaintenance() {
        for (int i = 0; i < maintenanceRequestsList.size(); i++) {
            if (maintenanceRequestsList.get(i).getCompletionStatus()) {
                System.out.println(maintenanceRequestsList.get(i).printRequestInfo());
            }
        }
    }

    public void listFacilityProblems() {
        // unsure
    }
}
package main.java.operations;

import main.java.facility.*;
import main.java.maintenance.*;
import main.java.use.*;
import java.util.*;

//Bridge pattern implementation
//FacilityOperations connects to FacilityManagement

public class FacilityOperations extends Observable implements FacilityUse, FacilityMaintenance   {
    protected ArrayList<User> userList;
    protected ArrayList<MaintenanceRequest> maintenanceRequestsList;
    Scanner user = new Scanner(System.in);
    
    public boolean isInUseDuringInterval(Facility f, String day) {

        // check if userList date is already taken

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getDayUsing() == day) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public void assignFacilityToUse(Facility f, User u) {

        // assign a facility to a user
        u.setFacilityID(f.getFacilityID());
        f.setFacilityUseCondition(true);
        userList.add(u);
    }

    public void vacateFacility(Facility f, String day) {

        // check if a facility is assigned to be used for a certain time,
        // if so, remove that assignment

    }

    public void listInspections(Facility f) {
        for (int i = 0; i < f.getInspections().size(); i++) {
            f.getInspections().get(i).printInspectionInfo();
        }
    }

    public void listActualUsage(Facility f) {

        // list total time a facility has been used

    }

    public int calcUsageRate(Facility f) {
        // list total time a facility has been used / time unused during business hours
        // (?)

        int finalrate = 0;
        return finalrate;
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    // Function to generate a maintenance request
    public void makeMaintenanceRequest(Facility f, int facilityID, String requestDesc, int daysReq) {
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
        MaintenanceRequest m = new MaintenanceRequest(this.maintenanceRequestsList.size() + 1, fID, request, days);
        this.maintenanceRequestsList.add(m);
        //OBSERVABLE
        setChanged();
        // Pass data of newly created MaintenanceRequest to observer
        notifyObservers(m);
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
    public ArrayList<MaintenanceRequest> listFacilityMaintRequests(Facility f) {
        return f.getMaintList();
    }

    // Lists all current maintenance requests.
    public ArrayList<MaintenanceRequest> listMaintenance() {
        return this.maintenanceRequestsList;
    }

    public void listFacilityProblems(Facility f) {
        // unsure
    }
}
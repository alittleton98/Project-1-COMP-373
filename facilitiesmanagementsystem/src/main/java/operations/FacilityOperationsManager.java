package main.java.operations;

import main.java.facility.*;
import main.java.facility.Observer;
import main.java.maintenance.*;
import main.java.use.*;
import java.util.*;


//Bridge pattern implementation
//FacilityOperations connects to FacilityManagement

public class FacilityOperationsManager implements FacilityUse, FacilityMaintenance, Subject, Visitable   {
    protected ArrayList<User> userList;
    protected ArrayList<MaintenanceRequest> maintenanceRequestsList;
    private ArrayList<Observer> observers;
    Scanner user = new Scanner(System.in);
    
    @Override
    public void attach(Observer o){
        this.observers.add(o);
    }

    @Override
    public void detach(Observer o){
        this.observers.remove(o);
    }

    @Override
    public void notifyUpdate(MaintenanceRequest m){
        for (Observer o: observers){
            o.update(m);
        }
    }
    
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
    public MaintenanceRequest makeMaintenanceRequest(Facility f, String requestDesc, int daysReq) {
        MaintenanceRequest m = new MaintenanceRequest(this.maintenanceRequestsList.size() + 1, f.getFacilityID(), requestDesc, daysReq);
        this.maintenanceRequestsList.add(m);
        notifyUpdate(m);
        return m;
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

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
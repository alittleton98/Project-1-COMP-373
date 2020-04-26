package main.java.operations;

import main.java.facility.*;
import main.java.maintenance.MaintenanceRequest;

public class BuilderImpl implements Builder {

    public Facility buildFacilityDef(){
        FacilityManager fm = new FacilityManager();
        fm.createFacility();
    }
    public Facility buildFacility(){
        FacilityManager fm = new FacilityManager();
        fm.createFacility();
    }

    public MaintenanceRequest buildMaintenanceRequest(Facility f, String requestReason, int daysReq){
        int maintRequestID = f.getMaintenanceRequests().size();
        MaintenanceRequest builtMaintReq = new MaintenanceRequest(maintRequestID + 1, f.getFacilityID(), requestReason, daysReq);
        return builtMaintReq;
    }
}
package main.java.operations;

import main.java.facility.*;
import main.java.maintenance.MaintenanceRequest;

public class BuilderImpl implements Builder {

    public Facility buildFacilityDef(){
        FacilityManager fm = new FacilityManager();
        fm.createFacility();
        return fm.getFacility(fm.getFacilitiesList().size() + 1);
    }
    public Facility buildFacility(int fID, String loc, boolean useCond, double cost, boolean maint, int cap, int empCount){
        FacilityManager fm = new FacilityManager();
        fm.createFacility(fID, loc, useCond, cost, maint, cap, empCount);
        return fm.getFacility(fID);
    }

    public MaintenanceRequest buildMaintenanceRequest(Facility f, String requestReason, int daysReq){
        int maintRequestID = f.getMaintenanceRequests().size();
        MaintenanceRequest builtMaintReq = new MaintenanceRequest(maintRequestID + 1, f.getFacilityID(), requestReason, daysReq);
        return builtMaintReq;
    }
}
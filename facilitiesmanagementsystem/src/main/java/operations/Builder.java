package main.java.operations;

import main.java.facility.*;
import main.java.maintenance.MaintenanceRequest;

public interface Builder {
    public Facility buildFacilityDef();
    public Facility buildFacility(int fID, String loc, boolean useCond, double cost, boolean maint, int cap, int empCount);
    public MaintenanceRequest buildMaintenanceRequest(Facility f, String requestReason, int daysReq);
}
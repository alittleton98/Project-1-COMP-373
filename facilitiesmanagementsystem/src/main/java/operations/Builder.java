package main.java.operations;

import main.java.facility.*;
import main.java.maintenance.MaintenanceRequest;

public interface Builder {
    public Facility buildFacilityDef();
    public Facility buildFacility();
    public MaintenanceRequest buildMaintenanceRequest(Facility f, String requestReason, int daysReq);
}
package main.java.operations;

import main.java.facility.Facility;
import main.java.maintenance.MaintenanceRequest;
import main.java.use.Inspection;

public interface Visitor {
    public void visit(Facility facility);
    public void visit(MaintenanceRequest maintenanceRequest);
    public void visit(Inspection inspection);
    
}
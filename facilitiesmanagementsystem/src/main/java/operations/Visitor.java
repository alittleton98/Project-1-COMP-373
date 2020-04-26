package main.java.operations;

import main.java.facility.FacilityManager;

public interface Visitor {

    public void visit(FacilityManager facilityManager);
    public void visit(FacilityOperationsManager facilityOperationsManager);
    
}
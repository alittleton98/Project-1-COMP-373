package main.java.operations;

import main.java.facility.FacilityManager;

public interface Visitor {

    public boolean visit(FacilityManager facilityManager); //returns true if successful visit
    public boolean visit(FacilityOperationsManager facilityOperationsManager); //returns true if successful visit
    
}
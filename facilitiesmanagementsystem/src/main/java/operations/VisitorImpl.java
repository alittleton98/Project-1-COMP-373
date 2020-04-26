package main.java.operations;

import main.java.facility.*;

public class VisitorImpl implements Visitor {

    public boolean visit(FacilityManager facilityManager){
        audit();
        return true; //returns true if called
    }
    public boolean visit(FacilityOperationsManager facilityOperationsManager){
        audit();
        return true; //returns true if called
    }

    public void audit() {
        //Should perform a greater action but for now just prints
        System.out.println("This object has been visted and audited.");
    }
}
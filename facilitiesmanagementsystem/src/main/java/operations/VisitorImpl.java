package main.java.operations;

import main.java.facility.*;

public class VisitorImpl {

    public void visit(FacilityManager facilityManager){
        audit();
    }
    public void visit(FacilityOperationsManager facilityOperationsManager){
        audit();
    }

    public void audit() {
        //Should perform a greater action but for now just prints
        System.out.println("This object has been visted and audited.");
    }
}
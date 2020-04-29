package main.java.operations;

import main.java.facility.*;

public class VisitorImpl implements Visitor {

    public boolean visit(FacilityManager facilityManager){
        if (facilityManager.accept(this)){
            audit();
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean visit(FacilityOperationsManager facilityOperationsManager){
        if (facilityOperationsManager.accept(this)){
            audit();
            return true;
        }
        else{
            return false;
        }
    }

    public void audit() {
        //Should perform a greater action but for now just prints
        System.out.println("This object has been visted and audited.");
    }
}
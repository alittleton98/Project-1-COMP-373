package use;
import facility.*;

public class FacilityUseManager implements FacilityUse {



    public boolean isInUseDuringInterval(Facility f){
        return true;
    }

    public void assignFacilityToUse(){

    }

    public void vacateFacility(){

    }

    public String[] listInspections(){
        String[] arr = new String[10];
        return arr;
    }

    public void listActualUsage(){

    }

    public int calcUsageRate(){
        int finalrate = 0;
        return finalrate;
    }
}
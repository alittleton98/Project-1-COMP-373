package use;

import java.util.*;
import facility.*;

public class FacilityUseManager implements FacilityUse {
    protected ArrayList<User> userList;
    private int userCount = 0;

    public boolean isInUseDuringInterval(Facility f, String day){
        
        // check if userList date is already taken
        
        for (int i = 0; i<userList.size(); i++){
            if (userList.get(i).dayUsing == day) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }

    public void assignFacilityToUse(Facility f, User u){
        
        // assign a facility to a user
        
        u.setFacilityID(f.getFacilityID());
        userList.add(u);
    }

    public void vacateFacility(Facility f, String day){
        
        // check if a facility is assigned to be used for a certain time,
        // if so, remove that assignment

    }

    public String[] listInspections(Facility f){
        
        // unsure what this should do

    }

    public void listActualUsage(Facility f){

        // list total time a facility has been used

    }

    public int calcUsageRate(Facility f){

        // list total time a facility has been used / time unused during business hours (?)

    }
}
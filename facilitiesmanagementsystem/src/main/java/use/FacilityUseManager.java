package use;

import facility.*;
import java.util.*;

public class FacilityUseManager implements FacilityUse {
    protected ArrayList<User> userList;
    private int userCount = 0;

    public boolean isInUseDuringInterval(Facility f, String day) {

        // check if userList date is already taken

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).dayUsing == day) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public void assignFacilityToUse(Facility f, User u) {

        // assign a facility to a user

        u.setFacilityID(f.getFacilityID());
        userList.add(u);
    }

    public void vacateFacility(Facility f, String day) {

        // check if a facility is assigned to be used for a certain time,
        // if so, remove that assignment

    }

    <<<<<<<HEAD

    public String[] listInspections(){
        String[] arr = new String[10];
        return arr;
=======

    public String[] listInspections(Facility f){
        
        // unsure what this should do

>>>>>>> 951665028add26aa1d0ae12aaf490cc734cf3fe7
    }

    public void listActualUsage(Facility f) {

        // list total time a facility has been used

    }

    <<<<<<<HEAD

    public int calcUsageRate(){
        int finalrate = 0;
        return finalrate;
=======

    public int calcUsageRate(Facility f){

        // list total time a facility has been used / time unused during business hours (?)

>>>>>>> 951665028add26aa1d0ae12aaf490cc734cf3fe7
    }
}
package main.java.use;

import main.java.facility.*;
import java.util.*;

public class FacilityUseManager implements FacilityUse {
    protected ArrayList<User> userList;
    private int userCount = 0;

    public boolean isInUseDuringInterval(Facility f, String day) {

        // check if userList date is already taken

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getDayUsing() == day) {
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

    public void listInspections(Facility f) {
        for (int i = 0; i < f.getInspections().size(); i++) {
            f.getInspections().get(i).printInspectionInfo();
        }
    }

    public void listActualUsage(Facility f) {

        // list total time a facility has been used

    }

    public int calcUsageRate(Facility f) {
        // list total time a facility has been used / time unused during business hours
        // (?)

        int finalrate = 0;
        return finalrate;
    }

}
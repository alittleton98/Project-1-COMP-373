package use;

import facility.*;

public interface FacilityUse {
    public boolean isInUseDuringInterval(Facility f, String day);

    public void assignFacilityToUse(Facility f, User u);

    public void vacateFacility(Facility f, String day);

    public void listInspections(Facility f);

    public void listActualUsage(Facility f);

    public int calcUsageRate(Facility f);
}
package use;
import facility.*;

public interface FacilityUse {
    public boolean isInUseDuringInterval(Facility f);
    
    public void assignFacilityToUse();

    public void vacateFacility();

    public String[] listInspections();

    public void listActualUsage();

    public int calcUsageRate();
}
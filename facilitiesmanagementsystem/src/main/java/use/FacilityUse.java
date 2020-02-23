package use;

public interface FacilityUse {
    public boolean isInUseDuringInterval();
    
    public void assignFacilityToUse();

    public void vacateFacility();

    public String[] listInspections();

    public void listActualUsage();

    public int calcUsageRate();
}
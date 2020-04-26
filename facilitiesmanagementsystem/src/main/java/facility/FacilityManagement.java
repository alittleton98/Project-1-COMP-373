package main.java.facility;

//Facility management interface

interface FacilityManagement {

    public void createFacility();

    public void createFacility(int fID, String loc, boolean useCond, double cost, boolean maint, int cap, int empCount);

    public void listAvailableFacilities();

    public void getFacilityInformation(Facility f);

    public int requestAvailableCapacity(Facility f);

    public void addNewFacility(Facility f);

    public void addFacilityDetail(Facility f, String detail);

    public Facility removeFacility(Facility f);

}
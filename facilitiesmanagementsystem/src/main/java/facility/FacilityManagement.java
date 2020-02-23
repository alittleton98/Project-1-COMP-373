package facility;

interface FacilityManagement {

    public void listAvailableFacilities();

    public void getFacilityInformation(Facility f);

    public int requestAvailableCapacity(Facility f);

    public void addNewFacility(Facility f);

    public void addFacilityDetail(Facility f, String detail);

    public Facility removeFacility(Facility f);

}
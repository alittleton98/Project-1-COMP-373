package fms;

public class FacilityMaintenanceRequest {
    private int FacilityIDNum;
    private String requestReason;
    private int daysRequired;

    FacilityMaintenanceRequest() {
        FacilityIDNum = 0;
        requestReason = "";
        daysRequired = 1;
    }

    FacilityMaintenanceRequest(int fID, String request, int days) {
        FacilityIDNum = fID;
        requestReason = request;
        daysRequired = days;
    }
}
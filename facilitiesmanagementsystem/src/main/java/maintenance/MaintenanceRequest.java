package maintenance;

public class MaintenanceRequest {
    private int FacilityIDNum;
    private String requestReason;
    private int daysRequired;

    MaintenanceRequest() {
        FacilityIDNum = 0;
        requestReason = "";
        daysRequired = 1;
    }

    MaintenanceRequest(int fID, String request, int days) {
        FacilityIDNum = fID;
        requestReason = request;
        daysRequired = days;
    }
}
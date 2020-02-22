package maintenance;

public class MaintenanceRequest {
    private int maintReqID;
    private int FacilityIDNum;
    private String requestReason;
    private int daysRequired;
    protected boolean isCompleted;

    MaintenanceRequest(int requestID, int fID, String request, int days) {
        maintReqID = requestID;
        FacilityIDNum = fID;
        requestReason = request;
        daysRequired = days;
        isCompleted = false;
    }

    public void setFacilityID(int n) {
        FacilityIDNum = n;
    }

    public void setRequestReason(String s) {
        requestReason = s;
    }

    public void setDaysRequired(int d) {
        daysRequired = d;
    }

    public void setCompletionStatus(boolean b) {
        isCompleted = b;
    }

    public boolean getCompletionStatus() {
        return isCompleted;
    }

    public void printRequestInfo() {
        System.out.println("Request ID Number:     " + maintReqID);
        System.out.println("Facility ID Number:    " + FacilityIDNum);
        System.out.println("Request Reason         " + requestReason);
        System.out.println("Days Required:         " + daysRequired);
        if (isCompleted) {
            System.out.println("Completion Status:     True");
        } else {
            System.out.println("Completion Status:     False");
        }

    }
}
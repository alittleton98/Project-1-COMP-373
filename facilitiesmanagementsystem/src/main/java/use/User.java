//UNUSED CLASS
//POSSIBLE IMPLIMENTATION
//UNNECESSARY AS OF 2/22/2020

package main.java.use;

public class User {
    private int userID;
    private int FacilityIDNum;
    private String dayUsing;
    private boolean isUsing;
    private int totalTimeUsed;

    public User(int id, int facilID, String dayUsing, int totalTimeUsed) {
        this.userID = id;
        this.FacilityIDNum = facilID;
        this.dayUsing = dayUsing;
        this.isUsing = false;
        this.totalTimeUsed = totalTimeUsed;
    }

    public void setFacilityID(int n) {
        this.FacilityIDNum = n;
    }

    public void setIsUsing(boolean b) {
        this.isUsing = b;
    }

    public void setTotalTimeUsed(int n) {
        this.totalTimeUsed = n;
    }

    public void setDayUsing(String s) {
        this.dayUsing = s;
    }

    public String getDayUsing() {
        return dayUsing;
    }

    public int getUserID() {
        return this.userID;
    }

    public int getFacilityID() {
        return this.FacilityIDNum;
    }

    public int getTotalTimeUsed() {
        return this.totalTimeUsed;
    }

}

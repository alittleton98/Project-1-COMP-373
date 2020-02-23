//UNUSED CLASS
//POSSIBLE IMPLIMENTATION
//UNNECESSARY AS OF 2/22/2020

package use;

public class User {
    
    private int userID;
    private int FacilityIDNum;
    // need dateUsing attribute, unsure how to do this
    private boolean isUsing;
    private int totalTimeUsed;

    User(int id, int facilID, int totalTimeUsed){
        this.userID = id;
        this.FacilityIDNum = facilID;
        this.isUsing = false;
        this.totalTimeUsed = totalTimeUsed;
    }

    public void setFacilityID(int n){
        this.FacilityIDNum = n;
    }

    public void setIsUsing(boolean b){
        this.isUsing = b;
    }

    public void setTotalTimeUsed(int n){
        this.totalTimeUsed = n;
    }

    public int getUserID() {
        return this.userID;
    }

    public int getFacilityID(){
        return this.FacilityIDNum;
    }

    public int getTotalTimeUsed(){
        return this.totalTimeUsed;
    }
    
}

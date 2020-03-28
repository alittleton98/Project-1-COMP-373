package main.java.use;

import java.time.LocalDate;

public class Inspection {
    int facilityID;
    LocalDate dateOfInspection;
    Boolean facilityPassed;

    public Inspection(int f) {
        dateOfInspection = LocalDate.now();
        facilityID = f;
        facilityPassed = false;
    }

    public void printInspectionInfo() {
        System.out.println(facilityID + " " + dateOfInspection + " PASSED INSPECTION: " + facilityPassed);
    }
}
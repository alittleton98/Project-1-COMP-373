package main.java.operations;

import main.java.maintenance.MaintenanceRequest;
import main.java.facility.*;

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(MaintenanceRequest m);
}
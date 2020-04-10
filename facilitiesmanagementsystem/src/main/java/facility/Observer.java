package main.java.facility;

import main.java.maintenance.MaintenanceRequest;

public interface Observer {
    public void update(MaintenanceRequest m);
}
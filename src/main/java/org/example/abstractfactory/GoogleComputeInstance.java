package org.example.abstractfactory;

public class GoogleComputeInstance implements Instance {
    @Override
    public void start() {
        System.out.println("Created GCP instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.print("Attached " + storage + " to GCPInstance");
    }

    @Override
    public void stop() {
        System.out.println("Terminated GCP instance stopped");
    }
}

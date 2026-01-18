package org.example.abstractfactory;

public class Ec2Instance implements Instance {
    @Override
    public void start() {
        System.out.println("Created Ec2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.print("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Terminated Ec2 instance stopped");
    }
}

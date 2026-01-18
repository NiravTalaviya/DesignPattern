package org.example.abstractfactory;

public class GCPResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance() {
        return new GoogleComputeInstance();
    }

    @Override
    public Storage createStorage() {
        return new GoogleCloudStorage();
    }
}

package org.example.abstractfactory;

public interface ResourceFactory {
    Instance createInstance();

    Storage createStorage();
}

package org.example.abstractfactory;

public class GoogleCloudStorage implements Storage {

    @Override
    public String getId() {
        return "Google Cloud Storage";
    }

    @Override
    public String toString() {
        return "GCP  Storage";
    }
}

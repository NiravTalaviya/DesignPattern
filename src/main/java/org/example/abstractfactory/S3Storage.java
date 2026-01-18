package org.example.abstractfactory;

class S3Storage implements Storage {
    S3Storage() {

    }

    @Override
    public String getId() {
        return "S3";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}

package org.example.iterator;

interface Aggregate<T> {
    CustomIterator<T> createIterator();
}

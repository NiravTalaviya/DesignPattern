package org.example.prototype;

/**
 * This class represents an abstract prototype & defines the clone method.
 */
public abstract class GameUnit implements Cloneable {
    private int position;

    public GameUnit() {
        position = 0;
    }

    public GameUnit(int x) {
        position = x;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone(); // Shallow copy
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = 0;
        reset();
    }

    protected abstract void reset();

    public void move(int distance) {
        position += distance;
    }

    public int getPosition() {
        return position;
    }
}

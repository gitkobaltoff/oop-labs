package com.company.GeometricBody;

public class Sphere implements GeometricBody {
    private final double surface;
    private final double volume;

    public Sphere(double radius) {
        this.surface = 4 * Math.PI * radius * radius;
        this.volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double getSurface() {
        return this.surface;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }
}
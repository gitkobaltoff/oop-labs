package com.company.GeometricBody;

public class Parallelepiped implements GeometricBody {
    private final double surface;
    private final double volume;

    public Parallelepiped(double a, double b, double c) {
        this.surface = 2 * (a * b + b * c + a * c);
        this.volume = a * b * c;
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
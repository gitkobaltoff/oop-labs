package com.company.GeometricBody;

public class Cub implements GeometricBody {
    private final double surface;
    private final double volume;

    public Cub(double size) {
        this.surface = 6 * size * size;
        this.volume = size * size * size;
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
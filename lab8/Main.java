package com.company;

import com.company.GeometricBody.Cub;
import com.company.GeometricBody.GeometricBody;
import com.company.GeometricBody.Parallelepiped;
import com.company.GeometricBody.Sphere;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();
        GeometricBodyController bodyController = new GeometricBodyController();

        bodies.add(new Cub(4));
        bodies.add(new Sphere(2.75f));
        bodies.add(new Parallelepiped(5, 5, 3));

        GeometricBody biggestSurface = bodyController.getBiggestSurface(bodies);
        GeometricBody biggestVolume = bodyController.getBiggestVolume(bodies);

        println("Biggest Volume: " +
                biggestVolume.getClass().getSimpleName() + " : " +
                biggestVolume.getVolume());
        println("Biggest Surface: " +
                biggestSurface.getClass().getSimpleName() + " : " +
                biggestSurface.getSurface());

   }

    private static void println(Object o) {
        System.out.println(o.toString());
    }
}
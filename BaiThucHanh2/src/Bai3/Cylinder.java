package Bai3;

public class Cylinder {

    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        return baseArea * height;
    }

    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}

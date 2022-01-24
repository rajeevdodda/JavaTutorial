/*
 * Types of interfaces
 * 1. Normal
 * 2. Single Abstract Interface => Single Method-> Functional Interface -> Lamda Expression  -> Scala
 * 3. Marker Interface => No methods
 */

public class FunctionalInterfaceDemo {
    public static void main(String args[]) {
        // Lamda expression
        MarkerInterface marker = () -> System.out.println("Im the best");
        marker.show();
    }
}

@FunctionalInterface
interface MarkerInterface {
    void show();
    // void show2();
}

package design_patterns.startergy_pattern;

class Vehicle {
    void drive() {
        System.out.println("Driving normally.");
    }

    void display() {
        System.out.println("Displaying normal vehicle.");
    }
}

// NormalVehicle subclass
class NormalVehicle extends Vehicle {
    // Inherits drive()  from Vehicle
    @Override
    void display() {
        System.out.println("Displaying vehicle.");
    }
}

// SportsVehicle subclass
class SportsVehicle extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving fast like a sports car.");
    }

    @Override
    void display() {
        System.out.println("Displaying vehicle.");
    }
}

// OffroadVehicle subclass
class OffroadVehicle extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving off-road.");
    }

    @Override
    void display() {
        System.out.println("Displaying durable off-road vehicle.");
    }
}

// Usage
public class Prob_Main {
    public static void main(String[] args) {
        Vehicle normalVehicle = new NormalVehicle();
        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle offroadVehicle = new OffroadVehicle();

        normalVehicle.drive();
        normalVehicle.display();

        sportsVehicle.drive();
        sportsVehicle.display();

        offroadVehicle.drive();
        offroadVehicle.display();
    }
}

// Here Normal and SPorts have same display() method
// But they have beeen implemeted twice in both classes
// This is not a good practice
package design_patterns.startergy_pattern;

 // Strategy interface for driving behavior
interface DriveStratergy {
    void drive();
}

// Concrete strategies for driving
class NormalDrive implements DriveStratergy {
    public void drive() {
        System.out.println("Driving normally.");
    }
}

class SportsDrive implements DriveStratergy {
    public void drive() {
        System.out.println("Driving fast like a sports car.");
    }
}

class OffroadDrive implements DriveStratergy {
    public void drive() {
        System.out.println("Driving off-road.");
    }
}

// Strategy interface for display behavior
interface DisplayStratergy {
    void display();
}

// Concrete strategies for display
class NormalDisplay implements DisplayStratergy {
    public void display() {
        System.out.println("Displaying normal vehicle.");
    }
}

class SportsDisplay implements DisplayStratergy {
    public void display() {
        System.out.println("Displaying sports vehicle.");
    }
}

class OffroadDisplay implements DisplayStratergy {
    public void display() {
        System.out.println("Displaying durable off-road vehicle.");
    }
}

// Vehicle class using strategies
class Vehicle {
    private DriveStratergy driveBehavior;
    private DisplayStratergy displayBehavior;

    public void setDriveBehavior(DriveStratergy db) {
        driveBehavior = db;
    }

    public void setDisplayBehavior(DisplayStratergy db) {
        displayBehavior = db;
    }

    public void performDrive() {
        driveBehavior.drive();
    }

    public void performDisplay() {
        displayBehavior.display();
    }
}

// Usage
public class Sol_Main {
    public static void main(String[] args) {
        Vehicle normalVehicle = new Vehicle();
        normalVehicle.setDriveBehavior(new NormalDrive());
        normalVehicle.setDisplayBehavior(new NormalDisplay());

        Vehicle sportsVehicle = new Vehicle();
        sportsVehicle.setDriveBehavior(new SportsDrive());
        sportsVehicle.setDisplayBehavior(new SportsDisplay());

        Vehicle offroadVehicle = new Vehicle();
        offroadVehicle.setDriveBehavior(new OffroadDrive());
        offroadVehicle.setDisplayBehavior(new OffroadDisplay());

        normalVehicle.performDrive();
        normalVehicle.performDisplay();

        sportsVehicle.performDrive();
        sportsVehicle.performDisplay();

        offroadVehicle.performDrive();
        offroadVehicle.performDisplay();
    }
} 

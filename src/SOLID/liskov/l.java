package SOLID.liskov;

// Liskov SUbstition Principle
// If ClassB is a subclass of ClassA, then we should be able to replace ClassA with ClassB without affecting the functionality of the program
// In other words, the subclass should be able to replace the parent class without any issues
// When a subclass is used in place of a parent class, it should not break the functionality of the program
// A subclass should not override the parent class in a way that breaks the functionality of the program
// A sublcass must always increase functionality of parent class not decrease it

interface Bike{
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
        System.out.println("Engine is on");
    }

    @Override
    public void accelerate() {
        if(isEngineOn){
            speed += 10;
            System.out.println("Accelerating to " + speed + " km/hr");
        }else{
            System.out.println("Turn on the engine first");
        }
    }
}


// Cycle class is a subclass of Bike interface
// Cycle class does not have an engine
// So, when we try to turn on the engine, it should throw an exception
// This breaks the functionality of the program
// So, Cycle class is not a proper subclass of Bike interface
// This narrows done functionality of parent class/interface
class Cycle implements Bike{
        int speed;
        @Override
        public void turnOnEngine() {
            throw new UnsupportedOperationException("Cycle does not have an engine");
            System.out.println("Cycle does not have an engine");
        }
    
        @Override
        public void accelerate() {
            speed += 10;
            System.out.println("Accelerating to " + speed + " km/hr");
        }
    }
   
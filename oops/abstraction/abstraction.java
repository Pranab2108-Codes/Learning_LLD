class Car {

    public void startEngine() {

    }

    public void shiftGear(int gear) {

    }

    public void accelerate() {

    }

    public void brake() {

    }

    public void stopEngine() {

    }

}

class SportsCar extends Car {

    String brand;
    String model;
    boolean isEngineOn;
    int currentSpeed;
    int currentGear;

    SportsCar(String b, String m) {

        this.brand = b;
        this.model = m;
        isEngineOn = false;
        currentSpeed = 0;
        currentGear = 0;

    }

    public void startEngine() {

        isEngineOn = true;
        System.out.println(brand + " " + model + " : Engine starts with a roar!");

    }

    public void shiftGear(int gear) {

        if (!isEngineOn) {

            System.out.println(brand + " " + model + " : Engine is off! Cannot Shift Gear.");
            return;

        }
        currentGear = gear;
        System.out.println(brand + " " + model + " : Shifted to gear " + currentGear);

    }

    public void accelerate() {

        if (!isEngineOn) {

            System.out.println(brand + " " + model + " : Engine is off! Cannot accelerate.");
            return;

        }
        currentSpeed += 20;
        System.out.println(brand + " " + model + " : Accelerating to " + currentSpeed + " km/h");
    
    }

    public void brake() {

        currentSpeed -= 20;
        if (currentSpeed < 0) {

            currentSpeed = 0;

        }
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
    
    }

    public void stopEngine() {

        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " : Engine turned off.");
    
    }

}

public class abstraction {

    public static void main(String[] args) {

        Car myCar = new SportsCar("Ford", "Mustang");

        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();

    }
    
}
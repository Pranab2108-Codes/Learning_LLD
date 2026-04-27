class SportsCar {

    private String brand;                                                                /* We maked all these things as private means these can not be changed, because speed can not be fixed by us, or we can not say that always start the car with a particular gearNo. like 2 or 4 or 6. */
    private String model;                                                                /* This tells the main feature of encapsulation which is data security, all these datas should not be hinder directly. */
    private boolean isEngineOn;
    private int currentSpeed;                                                            /* We can not set the current speed from main, but there should be a way to see the currentSpeed, so we use here getter method. */
    private int currentGear;                                                             /* But in some characteristics there suppose to be getter and setter method exist. */
    private String tyre;                                                                 /* Like we can do getter and setter in tyre. */
    
    SportsCar(String b, String m) {

        this.brand = b;
        this.model = m;
        isEngineOn = false;
        currentSpeed = 0;
        currentGear = 0;
        tyre = "MRF";

    }

    int getCurrentSpeed(){

        return currentSpeed;

    }

    String getTyre(){

        return tyre;

    }

    String setTyre(String tyres){                                                                    /* We define the setter method because, we not only set the tyres but also we can do some validation like, the tyres are actually those tyres which supposed to fit or not, so it means the string passed through it actually the valid one or not, or someone passed a random string. */

        return this.tyre = tyres;

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

public class encapsulation {

    public static void main(String[] args) {

        SportsCar mySportsCar = new SportsCar("Buggati", "Chiron");

        mySportsCar.startEngine();
        mySportsCar.shiftGear(1);
        mySportsCar.accelerate();
        mySportsCar.shiftGear(2);
        mySportsCar.accelerate();
        mySportsCar.brake();

        // mySportsCar.currentSpeed = 330;                                               /* This will give us error, because the currentSpeed is a private characteristic in class SportsCar. */
        // System.out.println("Current speed of my soprts car is set to: " +mySportsCar.currentSpeed);

        System.out.println("Now current speed of this car is: " +mySportsCar.getCurrentSpeed());
        System.out.println("Tyres are: " +mySportsCar.getTyre());
        System.out.println("Tyres got changed to: "+ mySportsCar.setTyre("Hero"));
        System.out.println("Tyres are: " +mySportsCar.getTyre());
        mySportsCar.stopEngine();

    }

}

package com_Vehicle;
import java.util.Scanner;
public class ElectricCar  extends Car{
    Scanner caleb=new Scanner(System.in);
    private double batteryLevel;//the battery level of the car as a percentage

    public ElectricCar(double speedKph, float fuelLevel, int distanceTraveled) {
        super();
    }//The constructor

    public void setBatteryLevel(double battery) {
        batteryLevel=battery;
    }//the battery level of the car as a percentage

    public double getBatteryLevel() {
        batteryLevel=40;
        return batteryLevel;
    }//sets the battery level of the car.

    @Override
    public void drive() {
        super.drive();

            if (getDistanceKm() == 10) {

                batteryLevel-=batteryLevel;
            }
    }//Overriding the drive method to also decrease the battery level by 1% for every 10 kilometers driven.
}

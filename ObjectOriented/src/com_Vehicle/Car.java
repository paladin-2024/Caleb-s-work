package com_Vehicle;

import java.util.Scanner;

public class Car {
    private double speedKph; //The speed of the car in Kph
    private float fuelLevel;//the fuel level of the car as a percentage (0.0 to 100)
    private int distanceTraveled;//The distance traveled by the car in meters

    public Car(double speedKph, float fuelLevel, int distanceTraveled) {
        this.speedKph = speedKph;
        this.fuelLevel = fuelLevel;
        this.distanceTraveled = distanceTraveled;
    }

    public Car() {
        this.speedKph = speedKph;
        this.fuelLevel = fuelLevel;
        this.distanceTraveled = distanceTraveled;
    }


    public void setSpeed(double speed) {
        speedKph = speed;
    }//setting the speed of the car

    public void setFuelLevel(float fuel) {
        fuelLevel = fuel;
    }//setting the fuel level of the car

    public void drive(int distance) {

        distanceTraveled += distance;
    }//simulating driving the car for a given distance in meters

    public double getSpeedMph() {

        return speedKph / 1.60934;
    }//returning the speed of the car in miles per hour

    public int getDistanceKm() {
        return distanceTraveled / 1000;
    }//returning the distance traveled in kilometers.

    public int calculateRemainingFuel(double distance) {
        double remainingFuel;
        double usedFuel;
        usedFuel = (distance / 1000) * 0.5;
        remainingFuel = fuelLevel - usedFuel;
        int remainingFuel_int;
        remainingFuel_int = (int) remainingFuel;
        return remainingFuel_int;// Implicit conversion from for variables with datatypes of the same nature
        //it covert a double which is remainingFuel to an integer which is remainingFuel_int.
    }//calculating the remaining fuel percentage after driving a given distance

    public void drive() {

    }//The class to override in electric car

}







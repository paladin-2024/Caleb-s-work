package com_Vehicle_test;
import com_Vehicle.*;



public class VehicleTest {
    public static void main(String[] args) {
        
                Car car=new Car(34.6,455.6f,49900);
                System.out.println("Car Speed (mph): " + car.getSpeedMph());
                System.out.println("Distance Traveled (km): " + car.getDistanceKm());
                System.out.println("Remaining Fuel (%): " + car.calculateRemainingFuel(40));
                car.setSpeed(120);

                ElectricCar electricCar = new ElectricCar(456,3.76f,45990000);

                System.out.println("Electric Car Speed (mph): " + car.getSpeedMph());
                System.out.println("Distance Traveled (km): " + car.getDistanceKm());
                electricCar.drive();
                System.out.println("Battery Level (%): " + electricCar.getBatteryLevel());

    }
}

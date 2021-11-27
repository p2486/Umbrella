package at.ac.fhstp.gof.flyweight;

import java.awt.Color;

public class App {
    
    public static void main(String[] args) {
        Vehicle blueCar = VehicleFactory.createVehicle(Color.BLUE);
        blueCar.start();   
    }
    
}

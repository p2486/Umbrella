package at.ac.fhstp.gof.mediator;

public class App {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        // Init Mediator
        PowerSupplier powerSupplier = new PowerSupplier();
        mediator.setPowerSupplier(powerSupplier);
        Fan fan = new Fan();
        mediator.setFan(fan);
        Button button = new Button();
        mediator.setButton(button);
        

        System.out.println(fan.isOn());
        
        button.press();
        System.out.println("Pressed the button.");

        System.out.println(fan.isOn());
    }
}

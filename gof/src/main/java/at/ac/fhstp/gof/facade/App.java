package at.ac.fhstp.gof.facade;

public class App {

    public static void main(String[] args) {
        CarEngine carEngine = new CarEngineFacade();
        carEngine.startEngine();
    }
}

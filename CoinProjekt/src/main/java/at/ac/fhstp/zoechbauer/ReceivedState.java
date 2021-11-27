package at.ac.fhstp.zoechbauer;

public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("Package already delivered");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("final step done - delivered");
    }

    @Override
    public String toString() {
        return "ReceivedState [toString()=" + super.toString() + "]";
    }

}

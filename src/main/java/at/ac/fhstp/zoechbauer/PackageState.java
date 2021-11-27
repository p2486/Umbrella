package at.ac.fhstp.zoechbauer;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();

}

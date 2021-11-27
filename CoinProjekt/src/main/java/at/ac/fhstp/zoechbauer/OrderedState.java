package at.ac.fhstp.zoechbauer;
public class OrderedState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());
	}
	
	@Override
	public void prev(Package pkg) {
		System.out.println("the package is in its root state");
	}
	
	@Override
	public void printStatus() {
		System.out.println("package ordered, not delivered");
	}
	
}

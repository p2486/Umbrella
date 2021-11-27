package at.ac.fhstp.zoechbauer;
public class DeliveredState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new ReceivedState());
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new OrderedState());
	}
	
	@Override
	public void printStatus() {
		System.out.println("Package not delivered to post office");
	}
}


package defaults;

public class ExampleZ implements ExampleX, ExampleY {

	// below method needed to be added manually to get rid from error caused because
	// of multiple interface inheritance
	public void method() {
		System.out.println("From class Example B");
	};

}

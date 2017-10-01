package defaults;

public interface ExampleA {
	
	default void method() {
		System.out.println("From interface Example A");
	};

}

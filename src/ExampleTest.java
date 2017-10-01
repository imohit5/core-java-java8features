
public class ExampleTest {

	public static void main(String[] args) {
//		ExampleC exampleC = new ExampleC();
//		exampleC.method();
		
		ExampleA exampleA = ()->System.out.println("Inside method");
		exampleA.method();
	}

}

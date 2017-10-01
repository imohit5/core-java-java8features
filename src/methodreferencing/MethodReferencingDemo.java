package methodreferencing;

public class MethodReferencingDemo {

	public static void main(String[] args) {
		
		Runnable r = MethodReferencingDemo::method;
		
		Thread th = new Thread(r);
		
		th.start();
		
		for (int i = 0; i < 11; i++) {
			System.out.println("From Main: "+i);
		}

	}
	
	public static void method() {
		for (int i = 0; i < 11; i++) {
			System.out.println("From Child: "+i);
		}
	}

}

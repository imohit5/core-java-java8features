package lambda;

public class RunnableDemoTest {

	public static void main(String[] args) {
//		Runnable runnableDemo = new RunnableDemo();
//		Thread thread = new Thread(runnableDemo);
//		thread.start();
		
		Runnable rd = ()-> {
			
			for (int i = 0; i < 10; i++) {
				System.out.println("From Child: "+i);
			}
			
		};
		
		Thread thread = new Thread(rd);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("From main: "+i);
		}
	}

}

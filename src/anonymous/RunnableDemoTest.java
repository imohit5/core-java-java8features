package anonymous;

public class RunnableDemoTest {

	public static void main(String[] args) {

		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("From Child: "+i);
//				}
//			}
//		});
		
		Thread thread = new Thread(()-> {
			
				for (int i = 0; i < 10; i++) {
					System.out.println("From Child: "+i);
				}
		});
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("From main: "+i);
		}
	}

}

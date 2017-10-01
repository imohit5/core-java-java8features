package lambda;

public class AddTest {

	public static void main(String[] args) {

		Add add = (a, b) -> {
			System.out.println("result: " + (a + b));
		};
		
		add.result(2, 3);
	}

}

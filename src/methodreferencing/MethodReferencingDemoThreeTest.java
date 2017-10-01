package methodreferencing;

public class MethodReferencingDemoThreeTest {

	public static void main(String[] args) {
		MethodReferenceInterfaceTwo mrit1 = s -> new MethodReferencingDemoThree(s);
		mrit1.get("Testing 1 using lambdas");
		
		MethodReferenceInterfaceTwo mrit2 = MethodReferencingDemoThree::new;
		mrit2.get("Testing 2 using constructor method referencing");
	}

}

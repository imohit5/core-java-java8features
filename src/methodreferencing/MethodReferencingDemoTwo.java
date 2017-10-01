package methodreferencing;

public class MethodReferencingDemoTwo {

	public static void main(String[] args) {
		
		MethodReferenceInterface mri1 = i->{
			System.out.println(i);
		};
		mri1.method1(7);
		
		MethodReferencingDemoTwo mrd2 = new MethodReferencingDemoTwo();
		MethodReferenceInterface mri2 = mrd2::method2;
		mri2.method1(10);
		
		

	}
	
	public void method2(int i) {
			System.out.println(i);
	}

}

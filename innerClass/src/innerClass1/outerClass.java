package innerClass1;
//normal inner class

public class outerClass {
	void outerMethod() {
		System.out.println("Hello from the outer class");
	}

	public class innerClass {
		void innerMethod() {
			System.out.println("Hello from the inner class");
		}
	}
}

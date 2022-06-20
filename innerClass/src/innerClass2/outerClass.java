package innerClass2;
//static inner class


public class outerClass {
	void outerMethod() {
		System.out.println("Hello from the outer class");
	}

	static class innerClass {
		void innerMethod() {
			System.out.println("Hello from the inner class");
		}
	}
}

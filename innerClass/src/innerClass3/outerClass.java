package innerClass3;
//method local inner class

public class outerClass {
	void outterMethod() {
		System.out.println("Hello from the outer class");

		class LocalInnerClass {
			String LocalInnerVariable = "Hello from the local inner class";

			void LocalInnerMethod() {
				System.out.println(LocalInnerVariable);
			}
		}
		LocalInnerClass Lic = new LocalInnerClass();
		Lic.LocalInnerMethod();
	}

}

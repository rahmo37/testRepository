package innerClass2;

public class main {
	public static void main(String[] args) {
		outerClass outer = new outerClass();
		outer.outerMethod();

		outerClass.innerClass inner = new outerClass.innerClass();

		inner.innerMethod();
	}
}

package innerClass1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass outer = new outerClass();
		outerClass.innerClass inner = outer.new innerClass();

		outer.outerMethod();
		inner.innerMethod();
	}

}

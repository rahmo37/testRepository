import javax.swing.JOptionPane;

public class JOptionPaneExample {

	String gender;

	public void method() {

		gender();

		String name = JOptionPane.showInputDialog("What is your name??");
		String food = JOptionPane.showInputDialog("What is your favorite food??");
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height??"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age??"));

		JOptionPane.showMessageDialog(null,
				"Your description : \n" + gender + "\n" + name + "\n" + age + "\n" + food + "\n" + height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPaneExample jp = new JOptionPaneExample();

		jp.method();

	}

	public String gender() {

		return gender = JOptionPane.showInputDialog("What is your gender??");
	}

}

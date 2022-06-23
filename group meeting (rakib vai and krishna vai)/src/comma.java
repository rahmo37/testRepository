import java.util.ArrayList;

public class comma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "a", "b", "c", "d" };
		ArrayList<Character> comma = new ArrayList<>();

		for (int a = 0; a < s.length; a++) {
			comma.add(',');
		}

		comma.set(s.length - 1, '.');

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			System.out.print(comma.get(i));
		}
	}

}

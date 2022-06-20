import java.util.ArrayList;

public class repeatingCharacter2 {
	
	//if any character is repeating than print that repeating character only once
	//no space allowed
	//print comma after every character

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i live in new york";
		ArrayList<Character> array = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			array.add(s.charAt(i));
		}

		for (int j = 0; j < array.size(); j++) {
			for (int k = j + 1; k < array.size(); k++) {

				if (array.get(k) == ' ') {
					array.remove(k);
				}
				if (array.get(j) == array.get(k)) {
					System.out.print(array.get(k) + ",");
					break;
				}
			}
			for (int l = j + 1; l < array.size(); l++) {
				if (array.get(j) == array.get(l)) {
					array.remove(l);
				}

			}
		}

	}

}

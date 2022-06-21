import java.util.ArrayList;
import java.util.Arrays;

public class uniqueValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 2, 5, 4, 6, 7, 8, 9 };
		
		// fills the anotherArray with the size of array
		boolean[] anotherArray = new boolean[array.length];
		
		// fills all the elements with of anotherArray with boolean value
		Arrays.fill(anotherArray, false);

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					anotherArray[i] = true;
					anotherArray[j] = true;
				}
			}
			if (anotherArray[i] == false) {
				System.out.print(array[i] + " ");
			}
		}

	}

}

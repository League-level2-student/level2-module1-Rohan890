package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		ArrayList<String> str = new ArrayList<String>();
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		str.add("t");
		str.add("S");
		str.add("g");
		str.add("ME");
		// 3. Print all the Strings using a standard for-loop
		{
			for (int i = 0; i < str.size(); i++) {
				String s = str.get(i);
				System.out.println("String at element " + i + " " + s);
			}
			// 4. Print all the Strings using a for-each loop

			// 5. Print only the even numbered elements in the list.
			for (int i = 0; i < str.size(); i += 2) {
				String s = str.get(i);
				System.out.println("String at element " + i + " " + s);
			}
			// 6. Print all the Strings in reverse order.
			for (int i = str.size() - 1; i > -1; i--) {
				String s = str.get(i);
				System.out.println("String at element " + i + " " + s);
			}
			// 7. Print only the Strings that have the letter 'e' in them.
			System.out.println("HIHIHHIH");
			for (int i = 0; i < str.size(); i++) {
				if (str.get(i).contains("E")) {
					String s = str.get(i);
					System.out.println("String at element " + i + " " + s);
				}
			}

		}
	}
}

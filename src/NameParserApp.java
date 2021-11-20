

import java.util.Scanner;

public class NameParserApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a name: ");
		String name = sc.nextLine();

		String[] names = name.split(" ");
		for (String n : names) {
			System.out.println();
		}

		if (names.length == 2) {
			System.out.println("First name: " + names[0]);
			System.out.println("Last name: " + names[1]);

		} else if (names.length == 3) {
			System.out.println("First name: " + names[0]);
			System.out.println("Middle name: " + names[1]);
			System.out.println("Last name: " + names[2]);
		}
	}

}

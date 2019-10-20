import java.util.Scanner;

public class nameletters {

	public static void main(String[] args) {
		int length;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = s.nextLine();
		String name2 = "";
		length = name.length();

		for (int x = 0; x < length; x++) {
			char c = name.charAt(x);
			for (int y = 0; y < length; y++) {
				name2 = name2 + c;
			}
		}
		s.close();
		System.out.println(name2);
	}

}

// describe what this program is doing at the beginning and at the end give some examples of output

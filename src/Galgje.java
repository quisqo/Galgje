import java.util.Scanner;

public class Galgje {

	public static void main(String[] args) {
		System.out.println("Welkom bij Galgje");
		System.out.println("Het te raden woord");

		String teRadenWoord = "Qien";

		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 10; j++) {
			String i = sc.nextLine();
			System.out.println("Uw ingevoerde letter is: " + i);
			if (teRadenWoord.contains(i)) {
				System.out.println("ja komt voor");
			} else {
				System.out.println("nee komt niet voor");
			}

			System.out.println("Het spel is klaar");

		}
	}

}

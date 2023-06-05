package flip_Robo;

import java.util.Scanner;

public class VowelConsonentChecker {

	public static boolean isVowel(char letter) {
		letter = Character.toLowerCase(letter);

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = scanner.next().charAt(0);
		scanner.close();

		if (isVowel(letter)) {
			System.out.println(letter + " is a vowel.");
		} else {
			System.out.println(letter + " is a consonant.");
		}
	}
}

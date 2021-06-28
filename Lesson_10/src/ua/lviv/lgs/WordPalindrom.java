package ua.lviv.lgs;

import java.util.Scanner;

public class WordPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Введіть слово з п'яти літер");
		String word=sc.next();
		if (word.length() == 5) {
			String wordArray [] = word.split("");
			
			if ((wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
				System.out.println("Введене слово " + word + " - паліндром");
			} else {
				System.out.println("Введене слово " + word + " - не паліндром");
			}
		} else {
			System.out.println("Потрібно ввести слово з п'яти літер!");

	}
	}
}

package ua.lviv.lgs;

import java.util.Scanner;

public class LetterDash {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �����:");

		String text = scanner.nextLine();

		System.out.println(replaceVowels(text));
	}

	static String replaceVowels(String text) {

		char textArray[] = text.toCharArray();
		char vowelArray[] = { '�', '�', '�','�','�','�', '�','�','�','�','�', '�', '�','�','�','�','�','�' ,'�', '�'  };

		for (int i = 0; i < textArray.length; i++) {

			for (int j = 0; j < vowelArray.length; j++) {

				if (textArray[i] == vowelArray[j]) {
					textArray[i] = '-';
				}
			}
		}

		String newText = new String(textArray);
		return newText;

	}

}

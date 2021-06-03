package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println();
		System.out.println("¬вед≥ть 1,щоб перев≥рити чи ≥снуЇ введений м≥с€ць ");
		System.out.println("¬вед≥ть 2,щоб вивести вс≥ м≥с€ц≥ з такою ж порою року ");
		System.out.println("¬вед≥ть 3,щоб вивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в ");
		System.out.println("¬вед≥ть 4,щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в ");
		System.out.println("¬вед≥ть 5, щоб,вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в ");
		System.out.println("¬вед≥ть 6,щоб вивести на екран наступну пору року ");
		System.out.println("¬вед≥ть 7, щоб вивести на екран попередню пору року");
		System.out.println("¬вед≥ть 8,щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("¬вед≥ть 9,щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("¬вед≥ть 10,щоб вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");
	}

	public static void main(String[] args) throws WrongInputConsoleParametersException{
		Scanner scanner = new Scanner(System.in);
		Months[] arrayMonths = Months.values();
		Seasons[] arraySeasons = Seasons.values();
		while (true) {
			menu();
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("ѕерев≥рка ≥снуванн€ введеного м≥с€ц€");
				System.out.println("¬вед≥ть м≥с€ць");
				scanner = new Scanner(System.in);
				String month1 = scanner.next().toUpperCase();
				
				boolean flag =  isMonthExists(arrayMonths, month1);
				for (Months c : arrayMonths) {
					if (c.name().equals(month1)) {
						System.out.println("¬ведений м≥с€ць ≥снуЇ");
						flag = true;
					}
				}
				if (!flag) {
					String message = "“акого  м≥с€ц€ немаЇ";
					throw new WrongInputConsoleParametersException(message);
				}
				break;

			}

			case 2: {

				System.out.println("ћ≥с€ц≥ з такою ж порою року");
				System.out.println(" ¬вед≥ть пору року");
				String season2 = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getSeason().name().equalsIgnoreCase(season2)) {
						flag = true;
					}
				}
				if (flag == true) {
					System.out.println("ѕора року " + season2 + "  в наступних м≥с€ц€х:");
					for (Months months2 : arrayMonths) {
						if (months2.getSeason().toString().equalsIgnoreCase(season2)) {
							System.out.println(months2);
						}
					}
				}
				if (flag == false) {
					String message = "“аких м≥с€ц≥в немаЇ";
				throw new WrongInputConsoleParametersException(message);}
				
				break;
			}
			case 3: {
				System.out.println("¬иведенн€ вс≥х м≥с€ц≥в з введеною к≥льк≥стю дн≥в");
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в:");
				int numberOfDays3 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println(" ≥льк≥сть дн≥в " + numberOfDays3 + " в наступних м≥с€ц€х:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() == numberOfDays3) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message ="“аких м≥с€ц≥в немаЇ";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}
			case 4: {
				System.out.println("виведенн€ на екран вс≥х м≥с€ц≥в, €к≥ мають меншу к≥льк≥сть дн≥в");
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в:");
				int numberOfDays4 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println(" ≥льк≥сть дн≥в менше " + numberOfDays4 + " в таких м≥с€ц€х:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() < numberOfDays4) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message ="“аких м≥с€ц≥в немаЇ!";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}
			case 5: {
				System.out.println("¬иведенн€ на екран вс≥х м≥с€ц≥в, €к≥ мають б≥льшу к≥льк≥сть дн≥в");
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в:");
				int numberOfDays5 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays5 && numberOfDays5 <= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println(" ≥льк≥сть дн≥в б≥льша " + numberOfDays5 + " в таких м≥с€ц€х:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() > numberOfDays5) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message ="“аких м≥с€ц≥в немаЇ!";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}

			case 6: {
				System.out.println("¬иведенн€ наступоноњ пори року:");
				System.out.println("¬вед≥ть пору року:");
				String season6 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season6)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("Ќаступна пора року:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season6.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == (arraySeasons.length - 1)) {
						i = 0;
						System.out.println(arraySeasons[i]);
					} else {
						System.out.println(arraySeasons[i + 1]);
					}
				}

				if (flag == false) {
		
				String message = "“акоњ пори року немаЇ!";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}
			case 7: {
				System.out.println(" ѕрограма виведенн€ попередньоњ пори року");
				System.out.println("¬ведите пору года:");
				String season7 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season7)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("ѕопередн€ пора року:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season7.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == 0) {
						i = (arraySeasons.length - 1);
						System.out.println(arraySeasons[i]);
					} else {
						System.out.println(arraySeasons[i - 1]);
					}
				}

				if (flag == false) {
					String message = "“акоњ пори року немаЇ!";
				throw new WrongInputConsoleParametersException(message);}
				

				break;
			}
			case 8: {
				System.out.println("ѕрограма виведенн€ м≥с€ц≥в з парною к≥льк≥стю дн≥в");

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() % 2 == 0) {
						System.out.println(months);
					}
				}

				break;
			}
			case 9: {
				System.out.println(" ѕрограма виведенн€ м≥с€ц≥в з непарною к≥льк≥стю дн≥в ");

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() % 2 != 0) {
						System.out.println(months);
					}
				}

				break;
			}
			case 0: {
				System.out.println(" ѕрограма перев≥рки парност≥ к≥льк≥ст≥ дн≥в у введеному м≥с€ц≥");
				System.out.println("¬вед≥ть м≥с€ць:");
				String month0 = scanner.next();

				boolean flag = isMonthExists(arrayMonths, month0);

				if (flag == true) {
					Months month = Months.valueOf(firstUpperCase(month0.toLowerCase()));

					if (month.getNumberOfDays() % 2 == 0) {
						System.out.println(" ≥льк≥сть дн≥в в м≥с€ц≥ " + month0 + " - " + month.getNumberOfDays()
								+ ". ÷е число пароне");
					} else {
						System.out.println(" ≥льк≥сть дн≥в в м≥с€ц≥ " + month0 + " - " + month.getNumberOfDays()
								+ "÷е число непарне");
					}
				}

				if (flag == false)
					System.out.println("“акого м≥с€ц€ немаЇ!");

				break;
			}

			default: {
				System.out.println("¬вед≥ть число в≥д 0 до 9!");

				break;
			}
			}
		}
	}

	/**
	 * Checks if the month exists in array and returns a boolean expression
	 * 
	 * @param arrayMonths, month
	 * 
	 * @return boolean expression
	 * 
	 */

	static boolean isMonthExists(Months[] arrayMonths, String month) {
		boolean flag = false;

		for (Months months : arrayMonths) {
			if (months.name().equalsIgnoreCase(month)) {
				flag = true;
			}
		}

		return flag;
	}

	/**
	 * Converts the first character of a string to upper case
	 * 
	 * @param string
	 * 
	 * @return String (with first letter in UpperCase)
	 * 
	 */

	static String firstUpperCase(String string) {
		if (string == null || string.isEmpty()) {
			return string;
		} else {
			return string.substring(0, 1).toUpperCase() + string.substring(1);
		}
	}
}
	
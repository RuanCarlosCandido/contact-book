package org.util;

import java.util.Scanner;

public class Util {
	
	public static void showsMenu() {
		StringBuilder userMenu = new StringBuilder();
		userMenu.append("Type 1 to consult a contact \n");
		userMenu.append("Type 2 to add a contact \n");
		userMenu.append("Type 0 to exit");
		System.out.println(userMenu);

	}
	
	public static int getUserChoice(Scanner scan) {

		String s = "";
		boolean validInput = false;
		int userChoice = 0;

		while (!validInput) {
			Util.showsMenu();
			try {
				s = scan.nextLine();
				userChoice = Integer.parseInt(s);

				if (userChoice >= 0 && userChoice <= 2) {
					validInput = true;
				}
			} catch (NumberFormatException e) {
//				LOG.warning(e.toString());
				 System.out.println("InvalidInput");
			}
		}
		return userChoice;
	}
}

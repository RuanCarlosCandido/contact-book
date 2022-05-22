package org;

import java.util.Scanner;

import org.controllers.ContactBookController;
import org.util.Util;

public class TestContactBook {

	public static void main(String[] args) {
		ContactBookController conBookController = new ContactBookController();

		Scanner scan = new Scanner(System.in);
		boolean end = false;
		do {
			switch (Util.getUserChoice(scan)) {
			case 1:
				conBookController.consultContact();
				break;
			case 2:
				conBookController.addContact();
				break;
			default:
				end = true;
				break;
			}
		} while (!end);
	}

	

	

}

package org.controllers;

import java.util.Scanner;

import org.models.Contact;
import org.services.ContactBookService;

public class ContactBookController {

	
	public ContactBookService conBook = new ContactBookService();
	
	public void consultContact() {


		Scanner scan = new Scanner(System.in);
		String name = "";

		System.out.println("Type the contact name: ");

		name = scan.next();

		if (conBook.consultContact(name) != null) {
			System.out.println(conBook.consultContact(name));
		}
	
		scan.close();
	}

	public void addContact() {
		Contact contact = new Contact();
		contact.setName(readName());
		contact.setEmail(readEmail());
		contact.setTelephone(readTelephone());
		conBook.addContact(contact);
	}
	
	public static String readName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact name: ");
		String inputName = scan.next();
		scan.close();
		return inputName;
	}

	public static String readTelephone() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact telephone: ");
		String inputTel = scan.next();
		scan.close();
		return inputTel;
	}

	public static String readEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact email: ");
		String inputEmail = scan.next();
		scan.close();
		return inputEmail;
	}

}

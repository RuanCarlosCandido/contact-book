package org.services;

import java.util.ArrayList;
import java.util.List;

import org.models.Contact;
import org.models.customExceptions.ContactDoesNotExistException;
import org.models.customExceptions.FullContactBookException;

public class ContactBookService {

	private List<Contact> contactsList = new ArrayList<Contact>();

	public void addContact(Contact contact) {
		try {
			if (contactsList.isEmpty()) {
				contactsList.add(contact);
				System.out.println("Contact added\n");
			} else {
				throw new FullContactBookException();
			}
		} catch (FullContactBookException e) {
			System.out.println(e.toString() + "\n");
		}

	}

	public Contact consultContact(String name) {
		try {
			if (search(name) != -1) {
				return contactsList.get(search(name));
			} else {
				throw new ContactDoesNotExistException();
			}

		} catch (ContactDoesNotExistException e) {
			System.out.println(e.toString());
		}
		return null;
	}

	public int search(String name) {

		for (int i = 0; i < contactsList.size(); i++) {

			if (name.equalsIgnoreCase(contactsList.get(i).getName())) {
				return i;
			}

		}
		return -1;

	}
}

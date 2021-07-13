package com.bridgelbaz.addressbook;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
	Map<Long, Contact> contactBook = new HashMap<>();

	public void add() {
		Contact contact = new StudentContact();
		contactBook.put(contact.getPhoneNumber(), contact);
		System.out.println("Successfully contact added.");
	}

	public void get(Long phoneNumber) {
		if (contactBook.get(phoneNumber) == null) {
			System.out.println("Contact you are trying is not existed.");
		} else {
			System.out.println(contactBook.get(phoneNumber));
		}
	}

	public void delete(Long phoneNumber) {
		if (contactBook.get(phoneNumber) == null) {
			System.out.println("Contact you are trying is not existed.");
		} else {
			contactBook.remove(phoneNumber);
			System.out.println("Successfully deleted.");
		}
	}

	public void update(Long phoneNumber) {
		System.out.println(contactBook.get(phoneNumber));
		System.out.println("Please enter the updated values: ");
		Contact contact = new StudentContact();
		contactBook.put(phoneNumber, contact);
	}
}

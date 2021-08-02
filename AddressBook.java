package com.bridgelbaz.addressbook;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressBook {
	Map<Long, Contact> contactBook = new HashMap<>();

	public void add(Long phoneNumber) {
		Contact contact = new StudentContact();
		if(contactBook.get(contact.getPhoneNumber()) == null) {
			contactBook.put(contact.getPhoneNumber(), contact);
			System.out.println("Successfully contact added.");
		}
		else {
			if(contactBook.get(contact.getPhoneNumber()) != contactBook.get(phoneNumber)) {
				contactBook.put(contact.getPhoneNumber(), contact);
				System.out.println("Successfully contact added.");
			}
			System.out.println("Already Existed");
		}
	}

	public void get(Long phoneNumber) {
		if (contactBook.get(phoneNumber) == null) {
			System.out.println("Contact you are trying is not existed.");
		} else {
			System.out.println(contactBook.get(phoneNumber));
		}
	}
	
	public void search(String firstName, String city, String state) {
		Set<Entry<Long, Contact>> entry = contactBook.entrySet();
		for (Entry<Long, Contact> entry2 : entry) {
			String x = entry2.getValue().getFirstName();
			if(x.equals(firstName)) {
				System.out.println(entry2.getValue().getCity());
			}
			/*
				 * else { System.out.println("not existed"); }
			*/
//			System.out.println(entry2.getKey()+" "+entry2.getValue());
		}
		
		for (Entry<Long, Contact> entry2 : entry) {
			String x = entry2.getValue().getCity();
			String y = entry2.getValue().getState();
			if(x.equals(city)) {
				System.out.println(entry2.getValue().getFirstName());
			}
			if(y.equals(state)) {
				System.out.println(entry2.getValue().getFirstName());
			}
		}
	}

	public void update(Long phoneNumber) {
		System.out.println(contactBook.get(phoneNumber));
		System.out.println("Please enter the updated values: ");
		Contact contact = new StudentContact();
		contactBook.put(phoneNumber, contact);
	}
	
	public void delete(Long phoneNumber) {
		if (contactBook.get(phoneNumber) == null) {
			System.out.println("Contact you are trying is not existed.");
		} else {
			contactBook.remove(phoneNumber);
			System.out.println("Successfully deleted.");
		}
	}
	
	public void print() {
		Set<Entry<Long, Contact>> entry = contactBook.entrySet();
		for (Entry<Long, Contact> entry2 : entry) {
			System.out.println(entry2.getKey()+" "+entry2.getValue());
		}	
		Map<Long, Contact> result = (Map<Long, Contact>) contactBook.entrySet().stream().sorted();
		System.out.println(result);
	}
}

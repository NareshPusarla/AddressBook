package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class TestAddressBook {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Contact contact1 = new Contact1();
		
		System.out.println("Welcome to Address Book");
		
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add 2.Update 3.Delete");
		int option = sc.nextInt();
		switch(option) {
			case 1: addressBook.add(contact1);
					break;
			case 2: addressBook.update(contact1);
					break;
			default: System.out.println("Enter valid option: ");
		}		
		//addressBook.add(contact1);
		//addressBook.update(contact1);
		addressBook.print();
		
	}
}

package com.bridgelbaz.addressbook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");

		AddressBook addressBook = new AddressBook();
		Scanner sc = ScannerUtil.sc;
		boolean in = true;
		while (in) {
			System.out.println("1.Add 2.Get 3. Search 4.Update 5.Delete 6.Exit");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				addressBook.add(sc.nextLong());
				break;
			case 2:
				System.out.println("Enter the mobile number to check the person's contact: ");
				long phoneNumber = sc.nextLong();
				addressBook.get(phoneNumber);
				break;
			case 3:
				System.out.println("Enter the name to search: ");
				addressBook.search(sc.next());
				break;
			case 4:
				System.out.println("Enter the mobile number to update the person's contact: ");
				long Number = sc.nextLong();
				addressBook.update(Number);
				break;
			case 5:
				System.out.println("Enter the mobile number to delete the person's contact: ");
				long mobileNumber = sc.nextLong();
				addressBook.delete(mobileNumber);
				break;
			case 6:
				in = false;
				System.out.println("Successfully exited.");
				break;
			default:
				System.out.println("Enter valid option: ");
			}
		}
	}

}

package com.bridglabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System!!!");

        AddressBookMain addressBookMain = new AddressBookMain();
        Person person = addressBookMain.createContact();

        System.out.println(person);
    }

    Person createContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter ZipCode");
        int zipCode = scanner.nextInt();
        System.out.println("Enter phoneNumber");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter Email");
        String email = scanner.next();

        System.out.println("Create Contact Successfully");

        Person person = new Person(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        return person;
    }
}

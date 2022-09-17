package com.bridglabz;

import java.util.Scanner;

public class AddressBookMain {
    Person person = new Person();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System!!!");
        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.addContact();

    }

    public void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        person.setFirstName(sc.next());
        System.out.println("Enter last name");
        person.setLastName(sc.next());
        System.out.println("Enter address");
        person.setAddress(sc.next());
        System.out.println("Enter city");
        person.setCity(sc.next());
        System.out.println("Enter state");
        person.setState(sc.next());
        System.out.println("Enter ZipCode");
        person.setZip(sc.nextInt());
        System.out.println("Enter phoneNumber");
        person.setPhoneNumber(sc.nextLong());
        System.out.println("Enter Email");
        person.setEmail(sc.next());

        System.out.println("Add Contact Successfully");
        System.out.println(person);
    }
}

package com.bridglabz;

import java.util.Scanner;

public class AddressBookMain {
    Person person = new Person();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System!!!");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        while (true) {
            AddressBookMain addressBookMain = new AddressBookMain();
            System.out.println("Enter 1 For Add Contact");
            System.out.println("Enter 2 For Edit Contact");
            System.out.println("Enter 3 For Exit");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    addressBookMain.addContact();
                case 2:
                    addressBookMain.editContact();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
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

    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name for Edit");
        String firstName = sc.next();
        if (firstName.equals(person.getFirstName())) {
            System.out.println("Edit Details of Person");
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

            System.out.println(person);

        } else {
            System.out.println("Contact Not Found");
        }
    }
}

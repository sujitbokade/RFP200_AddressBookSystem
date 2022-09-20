package com.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Person> list = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System!!!");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        while (true) {
            AddressBookMain addressBookMain = new AddressBookMain();
            System.out.println("Enter 1 For Add Contact");
            System.out.println("Enter 2 For Edit Contact");
            System.out.println("Enter 3 For Delete Contact");
            System.out.println("Enter 4 For Display Contacts");
            System.out.println("Enter 5 For Exit");
            int input = sc.nextInt();
            String firstName;

            switch (input) {
                case 1:
                    addressBookMain.addContact();
                    break;
                case 2:
                    System.out.println("Enter First Name for Edit");
                    firstName = sc.next();
                    addressBookMain.editContact(firstName);
                    break;
                case 3:
                    System.out.println("Enter First Name For Delete Contact");
                    firstName = sc.next();
                    addressBookMain.deleteContact(firstName);
                    break;
                case 4:
                    addressBookMain.displayContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public void addContact() {
        Person person = new Person();
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

        System.out.println("Contact Add Successfully");
        System.out.println();
        System.out.println(person);
        list.add(person);
        System.out.println();

    }

    public void editContact(String firstName) {
        for (Person person : list) {
            if (firstName.equals(person.getFirstName())) {
                System.out.println("Edit Details of Person " + firstName);
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
                System.out.println();
                System.out.println("Edit Contact Successfully");

                System.out.println(person);
                System.out.println();

            }
        }
    }

    public void deleteContact(String firstName) {
        for (Person person : list) {
            if (firstName.equals(person.getFirstName())) {
                list.remove(person);
                System.out.println("Contact Delete Successfully");
                System.out.println();
                break;
            }
        }
    }

    public void displayContacts() {
        System.out.println(list);
    }
}

package com.bridglabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    Scanner sc = new Scanner(System.in);
     ArrayList<Person> currentAddressBook;
     HashMap<String, ArrayList> AddressBookList = new HashMap<>();
    String currentAddressBookName;

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();

        System.out.println("Welcome to AddressBook System!!!");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        addressBookMain.addNewAddressBook();

        while (true) {
            System.out.println("========================\n" + addressBookMain.AddressBookList.keySet());
            System.out.println("current AddressBook Name: " + addressBookMain.currentAddressBookName);
            System.out.println("Enter 1 For Add Contact");
            System.out.println("Enter 2 For Edit Contact");
            System.out.println("Enter 3 For Delete Contact");
            System.out.println("Enter 4 For Display Contacts");
            System.out.println("Enter 5 For Add New AddressBook");
            System.out.println("Enter 6 For Select AddressBook");
            System.out.println("Enter 7 For Exit");

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
                    addressBookMain.displayContacts(addressBookMain.currentAddressBook);
                    break;
                case 5:
                    addressBookMain.addNewAddressBook();
                    break;
                case 6:
                    addressBookMain.selectAddressBook();
                    break;
                case 7:
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

        boolean isDuplicate = checkDuplicate(person);
        if(isDuplicate){
            System.out.println("Contact Name Already Exist...");
        }else {
            System.out.println("Contact Add Successfully");
            System.out.println();
            System.out.println(person);
            currentAddressBook.add(person);
            System.out.println();
        }

    }

    public void editContact(String firstName) {
        for (Person person : currentAddressBook) {
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
        for (Person person : currentAddressBook) {
            if (firstName.equals(person.getFirstName())) {
                currentAddressBook.remove(person);
                System.out.println("Contact Delete Successfully");
                System.out.println();
                break;
            }
        }
    }

    public void addNewAddressBook() {
        System.out.println("Enter AddressBook Name: ");
        String addressBookName = sc.next();
        ArrayList<Person> AddressBook = new ArrayList();
        AddressBookList.put(addressBookName, AddressBook);
        System.out.println("new AddressBook created");
        currentAddressBook = AddressBookList.get(addressBookName);
        currentAddressBookName = addressBookName;
    }

    void selectAddressBook() {
        System.out.println("enter name of address book");
        String addressBookName = sc.next();

        for (String key : AddressBookList.keySet()) {
            if (key.equalsIgnoreCase(addressBookName)) {
                currentAddressBook = AddressBookList.get(key);
                currentAddressBookName = key;
            }
        }
        System.out.println("current AddressBook is " + currentAddressBookName);

    }

    public void displayContacts(ArrayList addressBook) {
        System.out.println("Contacts: ");
        for (Object p : addressBook) {
            Person person = (Person) p;
            System.out.println(person);
        }
    }

    boolean checkDuplicate(Person newperson){
        return currentAddressBook.stream().anyMatch(person -> person.getFirstName().equals(newperson.getFirstName()));
    }
}

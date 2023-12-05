package prackticLessonList;

import prackticLessonList.service.ContactMetod;
import prackticLessonList.service.PhoneMetod;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact(777784512, "asyl");
        Contact contact2 = new Contact(777857451, "erzat");
        Contact contact3 = new Contact(775896523, "erlan");
        Contact contact5 = new Contact(771457845, "asan");
        Contact contact4 = new Contact(778784512, "yson");
        Contact contact6 = new Contact(778963251, "esen");
        Contact contact7 = new Contact(774457845, "ermek");
        Contact contact8 = new Contact(771415287, "kanysha");
        Contact contact9 = new Contact(774457845, "nurtilek");
        Contact contact10 = new Contact(777458745, "ermek");
        Contact contact11 = new Contact(778542154, "aijan");
        DBAzaContacts.allmassive.add(contact);
        DBAzaContacts.allmassive.add(contact2);
        DBAzaContacts.allmassive.add(contact3);
        DBAzaContacts.allmassive.add(contact4);
        DBAzaContacts.allmassive.add(contact5);
        DBAzaContacts.allmassive.add(contact6);
        DBAzaContacts.allmassive.add(contact7);
        DBAzaContacts.allmassive.add(contact8);
        DBAzaContacts.allmassive.add(contact9);
        DBAzaContacts.allmassive.add(contact10);
        DBAzaContacts.allmassive.add(contact11);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ContactMetod contactMetod = new ContactMetod();
        PhoneMetod phoneMetod = new PhoneMetod();

        LOOP1:
        while (true) {
            try {
                System.out.println("Write 5 for on || 0 for off");
                int number = scanner.nextInt();
                String what = phoneMetod.tornOn(number);
                if (what.equalsIgnoreCase("On")) {
                    LOOP2:
                    while (true) {
                        System.out.println("""
                                1.Call in Name
                                2.Call in Telephone Number
                                3.Update for Name
                                4.Get all contacts
                                0.Exit
                                                             
                                  """);
                        try {
                            int action = scanner.nextInt();
                            switch (action) {
                                case 1 -> {
                                    System.out.println("Write name: ");
                                    Contact contactw = phoneMetod.callinName(scanner2.nextLine());
                                    if (contactw != null) {
                                        System.out.println("Calling... " + contactw.getFullName());
                                    } else System.out.println("Not contact");
                                }
                                case 2 -> {
                                    System.out.println("Write telephone number: ");
                                    long nomer = scanner2.nextLong();
                                    Contact contacte = phoneMetod.callinTNumber(nomer);
                                    if (contacte != null) {
                                        System.out.println("Calling... " + contacte.getPhonenumber());
                                    } else System.out.println("Not contact");
                                }
                                case 3 -> {
                                    System.out.println("Write name: ");
                                    ArrayList<Contact> delte = phoneMetod.update(scanner2.nextLine());
                                    if (delte != null) {
                                        System.out.println("Succes");
                                        DBAzaContacts.allmassive = delte;
                                    } else System.out.println("Not contact");
                                }
                                case 4 -> {
                                    phoneMetod.getall();
                                }case 0->{break LOOP2;}
                            }
                        }catch (InputMismatchException exception) {
                            System.out.println("SAN JAZ");
                            scanner.next();

                        }
                    }
                } else if (what.equalsIgnoreCase("OLDU")) {
                    System.out.println("Phone blok");
                    break LOOP1;
                } else {
                    System.out.println("Phone off");
                    break LOOP1;
                }
            } catch (InputMismatchException exception) {
                System.out.println("SAN JAZ");
                scanner.next();

            }

        }

    }
}

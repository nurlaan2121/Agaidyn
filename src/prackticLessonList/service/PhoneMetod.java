package prackticLessonList.service;

import prackticLessonList.Contact;
import prackticLessonList.DBAzaContacts;
import prackticLessonList.Phone;
import prackticLessonList.service.interfaces.PhoneInterface;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneMetod implements PhoneInterface {
    @Override
    public String tornOn(int num) {
        int counter = 0;
        DBAzaContacts dbAzaContacts = new DBAzaContacts();
        Scanner scanner = new Scanner(System.in);
        if (num != 0) {
            while (true) {
                System.out.println("Write password: ");
                String pass = scanner.nextLine();
                if (counter < 2) {
                    if (pass.equalsIgnoreCase(dbAzaContacts.myphone().getPassword())) {
                        return "On";
                    } else counter++;
                }else break;
            }
        } else {
            return "Off";
        }
        return "OLDU";
    }

    @Override
    public Contact callinTNumber(long num) {
        for (int i = 0; i < DBAzaContacts.allmassive.size(); i++) {
            if (num == DBAzaContacts.allmassive.get(i).getPhonenumber()) {
                return DBAzaContacts.allmassive.get(i);
            }
        }
        return null;
    }

    @Override
    public Contact callinName(String name) {
        for (int i = 0; i <DBAzaContacts.allmassive.size(); i++) {
            if (name.equalsIgnoreCase(DBAzaContacts.allmassive.get(i).getFullName())) {
                return DBAzaContacts.allmassive.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Contact> update(String name) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < DBAzaContacts.allmassive.size(); i++) {
            if (name.equalsIgnoreCase(DBAzaContacts.allmassive.get(i).getFullName())) {
                System.out.println("""
                        Choice command:
                        1.Name
                        2.Telephone number
                        """);
                try {
                    int num = scanner.nextInt();
                    switch (num) {
                        case 1 -> {
                            System.out.println("Write name: ");
                            DBAzaContacts.allmassive.get(i).setFullName(new Scanner(System.in).nextLine());
                            return DBAzaContacts.allmassive;
                        }
                        case 2 -> {
                            System.out.println("Write number: ");
                            DBAzaContacts.allmassive.get(i).setPhonenumber(new Scanner(System.in).nextLong());
                            return DBAzaContacts.allmassive;
                        }
                        default -> System.out.println("Not command");
                    }
                }catch (InputMismatchException exception){
                    System.out.println("San jaz");
                }
            }

        }
        return null;
    }

    @Override
    public void getall() {

        System.out.println(DBAzaContacts.allmassive);
    }
}

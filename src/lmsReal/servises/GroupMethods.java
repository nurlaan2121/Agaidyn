package lmsReal.servises;

import lmsReal.Database;
import lmsReal.GeneratorId;
import lmsReal.servises.Interface.Group;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GroupMethods implements Group {
    @Override
    public lmsReal.Group[] addNewGroup() {
        Scanner scannerSTR = new Scanner(System.in);
        lmsReal.Group group = new lmsReal.Group();
        try {
            while (true) {
                System.out.print("Write name group: ");
                String name = scannerSTR.nextLine();
                if (name.length() > 3 && proverkaunical(name) == 0) {
                    group.setGroupName(name);
                    break;
                }
            }
            while (true) {
                System.out.print("Write description group: ");
                String name = scannerSTR.nextLine();
                if (name.length() > 6) {
                    group.setGroupDescription(name);
                    break;
                }
            }
            while (true) {
                System.out.print("Write lenguage group: ");
                String name = scannerSTR.nextLine();
                if (name.length() > 1) {
                    group.setLenguage(name);
                    break;
                }
            }
            group.setId(GeneratorId.generatorforgroup());
            Database.groups = Arrays.copyOf(Database.groups, Database.groups.length + 1);
            Database.groups[Database.groups.length - 1] = group;
            System.out.println("\n\n\n\n\nSucces added ");
        } catch (InputMismatchException e) {
            System.out.println("KATAN BAR");
        }
        return Database.groups;
    }

    @Override
    public void getGroupbyName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name group: ");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (Database.groups[i].getGroupName().equalsIgnoreCase(name)) {
                System.out.println(Database.groups[i]);
            }
        }
    }

    @Override
    public lmsReal.Group [] updateGroupbyName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name group");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (Database.groups[i].getGroupName().equalsIgnoreCase(name)) {
                System.out.println("If update name (1)|| else update description(2) else update langaege (3)");
                try {
                    int numberee = scanner.nextInt();
                    scanner.nextLine();
                    if (numberee == 1) {
                        while (true) {
                            System.out.println("Write new name group: ");
                            String name2 = scanner.nextLine();
                            if (name2.length() > 3 && proverkaunical(name2) == 0) {
                                Database.groups[i].setGroupName(name2);
                                System.out.println("\n\n\n\n\nSucces updated!");
                                break;

                            }
                        }
                    } else if (numberee == 2) {
                        System.out.println("Write new description group: ");
                        Database.groups[i].setGroupDescription(scanner.nextLine());
                        System.out.println("\n\n\n\n\nSucces updated!");
                    } else if (numberee == 3) {
                        System.out.println("Write new Language: ");
                        Database.groups[i].setLenguage(scanner.nextLine());
                        System.out.println("\n\n\n\n\nSucces updated!");
                    } else System.out.println("Not command! ");
                } catch (InputMismatchException e) {
                    System.out.println("SAN JAZ!");
                }
            }
        }return Database.groups;
    }

    @Override
    public void getAllgroups() {
        System.out.println(Arrays.toString(Database.groups));
    }

    public int proverkaunical(String name) {
        for (int i = 0; i < Database.groups.length; i++) {
            if (name.equalsIgnoreCase(Database.groups[i].getGroupName())) {
                return 1;
            }
        }
        return 0;
    }
}

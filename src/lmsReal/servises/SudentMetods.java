package lmsReal.servises;

import lmsReal.*;
import lmsReal.servises.Interface.Students;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SudentMetods implements Students {
    Student student = new Student();
    String[] allocods = {"500", "501", "502", "503", "504", "505", "506", "507", "508", "509",
            "700", " 701", "702", "703", "704", "705", "706", "707", "708", "709",
            "550", "551", "552", "553", "554", "555", "556", "557", "559",
            "770", "771", "772", "773", "774", "775", "776", "777", "778", "779", "220", "221", "222", "223", "224"};
//    String[] allcodMegacom = {"550", "551", "552", "553", "554", "555", "556", "557", "559"};
//    String[] allcodeBeelineKg = {"770", "771", "772", "773", "774", "775", "776", "777", "778", "779", "220", "221", "222", "223", "224"};

    @Override
    public Group[] addStudentToGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(Database.groups));
        System.out.println("Write group name: ");
        String nam = scanner.nextLine();
        for (int g = 0; g < Database.groups.length; g++) {
            System.out.println(Arrays.toString(Database.groups));
            if (nam.equalsIgnoreCase(Database.groups[g].getGroupName())) {
                Student student1 = new Student();
                while (true) {
                    System.out.println("Write name student: ");
                    String name = scanner.nextLine();
                    if (name.length() > 1) {
                        student1.setName(name);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write last name:");
                    String name = scanner.nextLine();
                    if (name.length() > 3) {
                        student1.setLastName(name);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write gender ( M || F )");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("m")) {
                        student1.setGender(Gender.MALE);
                        break;
                    } else if (name.equalsIgnoreCase("f")) {
                        student1.setGender(Gender.FEMALE);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write age  (18>|age|<65):");
                    try {
                        int name = scanner.nextInt();
                        if (name < 65 && name >= 18) {
                            student1.setAge(name);
                            break;
                        }
                    } catch (InputMismatchException exception) {
                        System.out.println("Write number ");
                        scanner.next();
                    }
                }
                while (true) {
                    System.out.println("Write format learning:");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("online")) {
                        student1.setFormat(true);
                        break;
                    } else if (name.equalsIgnoreCase("offline")) {
                        student1.setFormat(false);
                        break;
                    }
                }
                LOOP3:
                while (true) {
                    System.out.println("Write telephone number example: (777 28 99 66)");
                    String name = scanner.nextLine();
                    for (int i = 0; i < allocods.length; i++) {
                        if (name.length() == 9 && name.startsWith(allocods[i])) {
                            student1.setTelephoneNumber("+996" + name);
                            break LOOP3;
                        }
                    }
//                    for (int i = 0; i < allcodMegacom.length; i++) {
//                        if (name.length() == 9 && name.startsWith(allcodMegacom[i])) {
//                            student1.setTelephoneNumber("+996" + name);
//                            break LOOP3;
//                        }
//                    }
//                    for (int i = 0; i < allcodeBeelineKg.length; i++) {
//                        if (name.length() == 9 && name.startsWith(allcodeBeelineKg[i])) {
//                            student1.setTelephoneNumber("+996" + name);
//                            break LOOP3;
//
//                        }
//                    }
                }
                while (true) {
                    System.out.println("Write emil:");
                    String name = scanner.nextLine();
                    if (proverkaunicalEmal(name) == 1 && name.endsWith("@gmail.com")) {
                        student1.setEmail(name);
                        break;
                    } else if (proverkaunicalEmal(name) == 1 && name.endsWith("@icloud.com")) {
                        student1.setEmail(name);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Write password: ");
                    String name = scanner.nextLine();
                    if (name.length() > 3) {
                        student1.setPassword(name);
                        break;
                    }
                }
                student1.setId(GeneratorId.generatorforstuden());
                System.out.println(Arrays.toString(Database.groups));
                Database.groups[g].setStudents(student1);
                System.out.println("\n\n\n\n\nSuccess added!");
            }
        }
        return Database.groups;
    }

    @Override
    public Group[] updateInfoStudent() {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email student: ");
        String name = sc.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            for (int j = 0; j < Database.groups[i].getStudents().length; j++) {
                if (name.equalsIgnoreCase(Database.groups[i].getStudents()[j].getEmail())) {
                    System.out.println("""
                            Write number
                            1.Name
                            2.Last Name
                            3.Age
                            4.Telephone number
                            5.Email
                            6.Password
                            7.Gender
                            8.Format learning
                            """);
                    try {
                        int number = sc.nextInt();
                        if (number == 1) {
                            while (true) {
                                System.out.println("Write name student: ");
                                String name2 = scanner.nextLine();
                                if (name2.length() > 1) {
                                    Database.groups[i].getStudents()[j].setName(name2);
                                    System.out.println("\n\n\n\n\nSucces updated!");
                                    break;
                                }
                            }
                        } else if (number == 2) {
                            while (true) {
                                System.out.println("Write last name:");
                                String name3 = scanner.nextLine();
                                if (name3.length() > 3) {
                                    Database.groups[i].getStudents()[j].setLastName(name3);
                                    System.out.println("\n\n\n\n\nSucces updated!");
                                    break;
                                }
                            }
                        } else if (number == 3) {
                            LOOP3:
                            while (true) {
                                try {
                                    System.out.println("Write age  (18>|age|<65):");
                                    int name4 = scanner.nextInt();
                                    if (name4 < 65 && name4 >= 18) {
                                        Database.groups[i].getStudents()[j].setAge(name4);
                                        System.out.println("\n\n\n\n\nSucces updated!");
                                        break LOOP3;
                                    }
                                } catch (InputMismatchException exception) {
                                    System.out.println("Write number ");
                                    scanner.next();
                                }
                            }
                        } else if (number == 4) {
                            LOOPfor4:
                            while (true) {
                                System.out.println("Write telephone number example: (777 28 99 66)");
                                String name5 = scanner.nextLine();

                                for (int q = 0; q < Database.groups.length; q++) {
                                    for (int w = 0; w < Database.groups[q].students.length; w++) {
                                        for (String allocod : allocods) {
                                            if (name5.length() == 9 && name5.startsWith(allocod)) {
                                                Database.groups[q].students[w].setTelephoneNumber("+996" + name5);
                                                System.out.println("\n\n\n\n\nSuccess updated!");
                                                break LOOPfor4;
                                            }
                                        }
                                    }
                                }

//                                for (int q = 0; q < Database.groups.length; q++) {
//                                    for (int w = 0; w < Database.groups[q].students.length; w++) {
//                                        for (String string : allcodMegacom) {
//                                            if (name5.length() == 9 && name5.startsWith(string)) {
//                                                Database.groups[q].students[w].setTelephoneNumber("+996" + name5);
//                                                System.out.println("\n\n\n\n\nSuccess updated!");
//                                                break LOOPfor4;
//                                            }
//                                        }
//                                    }
//                                }
//
//                                for (int q = 0; q < Database.groups.length; q++) {
//                                    for (int w = 0; w < Database.groups[q].students.length; w++) {
//                                        for (String string : allcodeBeelineKg) {
//                                            if (name5.length() == 9 && name.startsWith(string)) {
//                                                Database.groups[q].students[w].setTelephoneNumber("+996" + name5);
//                                                System.out.println("\n\n\n\n\nSuccess updated!");
//                                                break LOOPfor4;
//                                            }
//                                        }
//                                    }
//                                }

                            }
                        } else if (number == 5) {
                            while (true) {
                                System.out.println("Write emil:");
                                String name6 = scanner.nextLine();
                                if (proverkaunicalEmal(name6) == 1 && name6.endsWith("@gmail.com")) {
                                    Database.groups[i].getStudents()[j].setEmail(name6);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                } else if (proverkaunicalEmal(name6) == 1 && name6.endsWith("@icloud.com")) {
                                    Database.groups[i].getStudents()[j].setEmail(name6);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                }
                            }

                        } else if (number == 6) {
                            while (true) {
                                System.out.println("Write password: ");
                                String name7 = scanner.nextLine();
                                if (name7.length() > 3) {
                                    Database.groups[i].getStudents()[j].setPassword(name7);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                }
                            }
                        } else if (number == 7) {
                            while (true) {
                                System.out.println("Write gender (M||F) :");
                                String name8 = scanner.nextLine();
                                if (name8.equalsIgnoreCase("m")) {
                                    Database.groups[i].getStudents()[j].setGender(Gender.MALE);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                } else if (name8.equalsIgnoreCase("f")) {
                                    Database.groups[i].getStudents()[j].setGender(Gender.FEMALE);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                }
                            }
                        } else if (number == 8) {
                            while (true) {
                                System.out.println("Write format learning:");
                                String name9 = scanner.nextLine();
                                if (name9.equalsIgnoreCase("online")) {
                                    Database.groups[i].getStudents()[j].setFormat(true);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                } else if (name9.equalsIgnoreCase("offline")) {
                                    Database.groups[i].getStudents()[j].setFormat(false);
                                    System.out.println("\n\n\n\n\nSuccess updated!");
                                    break;
                                }
                            }
                        } else System.out.println("Write number");
                    } catch (InputMismatchException exception) {
                        System.out.println("Write only number: ");
                        sc.next();
                    }
                }
            }
        }
        return Database.groups;
    }

    @Override
    public void getStudentbyFirsName() {
        Scanner scanner = new Scanner(System.in);
        String namestdent = scanner.nextLine();
        System.out.println("Write email: ");
        for (int i = 0; i < Database.groups.length; i++) {
            if (namestdent.equalsIgnoreCase(Database.groups[i].getStudents()[i].getEmail())) {
                System.out.println(Database.groups[i].getStudents()[i]);
            }
        }
    }

    @Override
    public void getAllStudentsbyGruopName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name group: ");
        String namegroup = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (namegroup.equalsIgnoreCase(Database.groups[i].getGroupName())) {
                System.out.println(Arrays.toString(Database.groups[i].getStudents()));
            }
        }
    }

    @Override
    public void getallStudentsLessons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name lesson: ");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            for (int j = 0; j < Database.groups[i].getLessons().length; j++) {
                if (name.equalsIgnoreCase(Database.groups[i].getLessons()[j].getLessonName())) {
                    System.out.println((Arrays.toString(Database.groups[i].getStudents())));
                }
            }

        }
    }

    @Override
    public Group[] deleteStudentbyEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email  for delete");
        String name = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            if (name.equalsIgnoreCase(Database.groups[i].getStudents()[i].getName())) {
                System.out.println("Write password for delete! ");
                String password = scanner.nextLine();
                for (int j = 0; j < Database.groups.length; j++) {
                    if (password.equalsIgnoreCase(Database.groups[i].getStudents()[i].getPassword())) {
                        for (int k = i; k < Database.groups.length - 1; k++) {
                            Student student1 = Database.groups[i].getStudents()[i];
                            Database.groups[i].getStudents()[i] = Database.groups[i].getStudents()[k + 1];
                            Database.groups[k + 1].getStudents()[k + 1] = student1;
                        }
                    }
                }
                Database.groups[i].setStudents111(Arrays.copyOf(Database.groups[i].getStudents(), Database.groups[i].getStudents().length - 1));
            }
        }
        return null;
    }

//    public int proverkaunical(String name) {
//        for (int r = 0; r < Database.groups.length; r++) {
//            for (int i = 0; i < Database.groups[r].getStudents().length; i++) {
//                if (name.equalsIgnoreCase(Database.groups[r].getStudents()[i].getName())) {
//                    return 1;
//                }
//            }
//        }
//        return 0;
//    }

    public int proverkaunicalEmal(String name) {
        for (int r = 0; r < Database.groups.length; r++) {
            for (int i = 0; i < Database.groups[r].getStudents().length; i++) {
                if (name.equalsIgnoreCase(Database.groups[r].getStudents()[i].getEmail())) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

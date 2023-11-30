package lmsReal;

import lmsReal.Role.Admin;
import lmsReal.Role.Proverka;
import lmsReal.Role.Users;
import lmsReal.servises.GroupMethods;
import lmsReal.servises.LessonMethods;
import lmsReal.servises.SudentMetods;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setLogin("nurlan@gmail.com");
        admin.setPassword("nurlan21");
        ZonedDateTime dateTime = ZonedDateTime.now();
        DateTimeFormatter men2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nne = dateTime.format(men2);
        GroupMethods groupMethods = new GroupMethods();
        SudentMetods sudentMetods = new SudentMetods();
        LessonMethods lessonMethods = new LessonMethods();
        if (ZonedDateTime.now().getHour() >= 3 && ZonedDateTime.now().getHour() < 11) {
            System.out.println("\n\n\nСаламатсызбы кутман тан дата: " + nne);
        } else if (ZonedDateTime.now().getHour() >= 11 && ZonedDateTime.now().getHour() < 17) {
            System.out.println("\n\n\nСаламатсызбы кутман кун дата: " + nne);
        } else if (ZonedDateTime.now().getHour() >= 17 && ZonedDateTime.now().getHour() > 3) {
            System.out.println("\n\n\nСаламатсызбы кутман кеч дата: " + nne);
        }
        Scanner scanner = new Scanner(System.in);

        LOOPMAIN:
        while (true) {
            System.out.println("""
                    Choice command
                    1.User
                    2.Admin
                    3.Exit
                             
                    """);
            try {
                switch (scanner.nextInt()) {
                    case 1 -> {
                        Student studentcurrent = Users.checLogin();
                        if ((studentcurrent != null)){
                            LOOPSTUDENT:
                            while (true){
                                System.out.println(STR."""
                                    Welcome: in Peaksoft !
                                    Choice command
                                    1.My lessons
                                    2.My profile
                                    3.Reiting group
                                    4.Change lenguage
                                    0.Exit
                                    """);
                                switch (scanner.nextInt()){
                                    case 1->{
                                        for (int i = 0; i < Database.groups.length; i++) {
                                            for (int k = 0; k < Database.groups[i].getStudents().length; k++) {
                                                if (Database.groups[i].getStudents()[k].getEmail().equalsIgnoreCase(studentcurrent.getEmail())) {
                                                    System.out.println(("My Lesson name: " + Database.groups[i].getLessons()[k].getLessonName()));
                                                    System.out.println(("lesson teacher name : " + Database.groups[i].getLessons()[k].getTecherFullMame()));
                                                    System.out.println(("Lesson mentor name : " + Database.groups[i].getLessons()[k].getMentorsFullMame()));
                                                    System.out.println(("Lesson start date : " + Database.groups[i].getLessons()[k].getDateStartLesson()));
                                                }
                                            }
                                        }
                                    }case 2->{
                                        System.out.println(STR."""
                                                My profile:

                                                My name: \{studentcurrent.getName()}
                                                My Last name :\{studentcurrent.getLastName()}
                                                My old : \{studentcurrent.getAge()}
                                                My telephone number: \{studentcurrent.getTelephoneNumber()}
                                                My email \{studentcurrent.getEmail()}

                                                """);
                                    }
                                    case 0 -> {break LOOPSTUDENT;}
                                    default -> System.out.println("Write number");


                                }
                            }
                        }else System.out.println("Vas eshe ne dobavili!");
                    }
                    case 2 -> {
                        if (Proverka.rolProverka(admin).equalsIgnoreCase("Admin")) {
                            LOOP1:
                            while (true) {
                                System.out.println("""
                                        \n\n\n ******** Write command ********
                                        1.Add new group
                                        2.Get group by name
                                        3.Update group by name
                                        4.Get all groups
                                        5.Add new Student to Group
                                        6.Update student
                                        7.Find studet by email
                                        8.Get all students by group name
                                        9.Get all student in Lesson
                                        10.Deleta sudent by email
                                        11.Add lesson to group
                                        12.Get lesson by name
                                        13.Get all lesson by Group name
                                        14.Delete lesson by ID
                                        15.Delete group by name
                                        16.All lessons Studenta
                                        0.EXIT        
                                        """);
                                try {
                                    int number = scanner.nextInt();
                                    if (number == 1) {
                                        Database.groups = groupMethods.addNewGroup();
                                    } else if (number == 2 && Database.groups.length > 0) {
                                        groupMethods.getGroupbyName();
                                    } else if (number == 3 && Database.groups.length > 0) {
                                        Database.groups = groupMethods.updateGroupbyName();
                                    } else if (number == 4 && Database.groups.length > 0) {
                                        groupMethods.getAllgroups();
                                    } else if (number == 5 && Database.groups.length > 0) {
                                        Database.groups = sudentMetods.addStudentToGroup();
                                    } else if (number == 6 && Database.groups.length > 0) {
                                        sudentMetods.updateInfoStudent();
                                    } else if (number == 7 && Database.groups.length > 0) {
                                        sudentMetods.getStudentbyFirsName();
                                    } else if (number == 8 && Database.groups.length > 0) {
                                        sudentMetods.getAllStudentsbyGruopName();
                                    } else if (number == 9 && Database.groups.length > 0) {
                                        sudentMetods.getallStudentsLessons();
                                    } else if (number == 10 && Database.groups.length > 0) {
                                        Database.groups = sudentMetods.deleteStudentbyEmail();
                                    } else if (number == 11 && Database.groups.length > 0) {
                                        Database.groups = lessonMethods.addLessontoGroup();
                                    } else if (number == 12 && Database.groups.length > 0) {
                                        lessonMethods.getLessonByName();
                                    } else if (number == 13 && Database.groups.length > 0) {
                                        lessonMethods.getAlllessonByGroupName();
                                    } else if (number == 14 && Database.groups.length > 0) {
                                        Database.groups = lessonMethods.deleteLessonByID();
                                    } else if (number == 15 && Database.groups.length > 0) {
                                        Database.groups = lessonMethods.deleteGroupByName();
                                    } else if (number == 16 && Database.groups.length > 0) {
                                        lessonMethods.getAllLessonStudenta();
                                    } else if (number == 0) {
                                        break LOOP1;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Write number!");
                                    scanner.next();
                                }
                            }
                        } else {
                            System.out.println("Esli zabyli parol mijete sbrosit: \n elsi hotite (1) else (0)");
                            switch (scanner.nextInt()){
                                case 1->Proverka.update(admin);
                                default -> System.out.println("OK");

                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Программа зовершена");
                        break LOOPMAIN;
                    }
                    default -> System.out.println("Write number!");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Write number:");
                scanner.next();
            }
        }
    }
}

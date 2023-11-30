package lmsReal.Role;

import carBron.User;
import lmsReal.Database;
import lmsReal.Student;

import java.util.Scanner;

public class Users extends Student {

    //    public static Student addUser(Users [] massivUsers){
//        Users users = new Users();
//        for (int i = 0; i < Database.groups.length; i++) {
//            for (int j = 0; j < Database.groups[i].getStudents().length; j++) {
//                 users.setEmail(Database.groups[i].getStudents()[j].getEmail());
//                 users.setPassword(Database.groups[i].getStudents()[j].getPassword());
//                 users.setName(Database.groups[i].getStudents()[j].getName());
//                 users.setAge(Database.groups[i].getStudents()[j].getAge());
//                 users.setGender(Database.groups[i].getStudents()[j].getGender());
//                 users.setFormat(Database.groups[i].getStudents()[j].isFormat());
//                 users.setLastName(Database.groups[i].getStudents()[j].getLastName());
//            }
//        }
//    }
    public static Student checLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите почту: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String passwo = scanner.nextLine();
        for (int i = 0; i < Database.groups.length; i++) {
            Student[] students = Database.groups[i].getStudents();
            for (int j = 0; j < students.length; j++) {
                if (students[j].getEmail().equalsIgnoreCase(login) && students[j].getPassword().equalsIgnoreCase(passwo)) {
                    return students[j];
                }
            }
        }
        return null;
    }
}

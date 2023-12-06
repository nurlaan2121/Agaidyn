package practiclesson2.Main;

import practiclesson2.Main.Sevice.PostImpl;
import practiclesson2.Main.Sevice.UserImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserImpl usermetod = new UserImpl();
        PostImpl postmetod = new PostImpl();
        LOOP1:
        while (true) {
            System.out.println("""
                    1.Registrasia
                    2.Login
                    0.Exit
                    """);
            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 1 -> {
                        String name;
                        String email;
                        String pssword;
                        GenderPrackticLesson ud;
                        while (true) {
                            System.out.println("Write full name: ");
                            String name1 = new Scanner(System.in).nextLine();
                            if (name1.length() > 3) {
                                name = name1;
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("Write email: ");
                            String email1 = new Scanner(System.in).nextLine();
                            if (unicalemail(email1) && email1.endsWith("@gmail.com")) {
                                email = email1;
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("Write password: ");
                            String name1 = new Scanner(System.in).nextLine();
                            if (name1.length() > 4) {
                                pssword = name1;
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("Write gender: ");
                            String name1 = new Scanner(System.in).nextLine();
                            if (name1.equalsIgnoreCase("M")) {
                                ud = GenderPrackticLesson.MALE;
                                break;
                            } else if (name1.equalsIgnoreCase("F")) {
                                ud = GenderPrackticLesson.FEMALE;
                                break;
                            }
                        }
                        usermetod.registr(email, pssword, ud, name);

                    }
                    case 2 -> {
                        String email;
                        String pass;
                        while (true) {
                            System.out.println("Write email: ");
                            String ud = new Scanner(System.in).nextLine();
                            if (ud.length() > 1) {
                                email = ud;
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("Write password: ");
                            String udPas = new Scanner(System.in).nextLine();
                            if (udPas.length() > 4) {
                                pass = udPas;
                                break;
                            }
                        }
                        UserPolePracktic currentUser = usermetod.loginPrackticLesson(email, pass);
                        if (currentUser != null) {
                            System.out.println("Success");
                            System.out.println("Welcome " + currentUser.getFullName());
                            LOOP2:
                            while (true) {
                                System.out.println("""
                                        Choice command:
                                        1.Get user by Email
                                        2.Get all users
                                        3.Add post
                                        4.Delete post by ID
                                        5.Get all posts by USer ID
                                        0.Exit
                                        """);
                                try {
                                    int commanf = scanner.nextInt();
                                    switch (commanf) {
                                        case 1 -> {
                                            System.out.println("Write email user: ");
                                            UserPolePracktic delete = usermetod.getUserByEmail(new Scanner(System.in).nextLine());
                                            if (delete != null) {
                                                System.out.println(delete);
                                            } else System.out.println("Not takoi user");
                                        }
                                        case 2 -> {
                                            usermetod.getallusers();
                                        }
                                        case 3 -> {
                                            System.out.println("Write url post");
                                            String url = new Scanner(System.in).nextLine();
                                            System.out.println("Write deckriptin: ");
                                            currentUser = postmetod.addPostToUser(currentUser, new Scanner(System.in).nextLine(), url);
                                            System.out.println("Success");
                                        }
                                        case 4 -> {
                                            System.out.println("Write id post :");
                                            UserPolePracktic fdelete2 = postmetod.deletePostById(currentUser, new Scanner(System.in).nextLong());
                                            if (fdelete2 != null) {
                                                System.out.println("Success");
                                            } else {
                                                System.out.println("Not takoi post");
                                            }
                                        }
                                        case 5 -> {
                                            ArrayList<PostPolePractic> postPolePractic   = postmetod.getpostsByUserId(scanner.nextLong());
                                            if (postPolePractic != null){
                                                System.out.println(postPolePractic);
                                            }else System.out.println("Not takoi post! ");
                                        }
                                        case 0 -> {
                                            break LOOP2;
                                        }
                                    }
                                } catch (InputMismatchException exception) {
                                    System.out.println("Write number");
                                    scanner.next();
                                }
                            }
                        } else {
                            System.out.println("Invalid Email or Password!");

                        }
                    }
                    case 0 -> {
                        break LOOP1;
                    }
                }
            } catch (InputMismatchException exception) {
                System.out.println("San Jaz!");
                scanner.next();
            }
        }
    }

    public static boolean unicalemail(String email) {
        for (int i = 0; i < BdPracticTask2.arrayListUsers.size(); i++) {
            if (BdPracticTask2.arrayListUsers.get(i).getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }
}

package RealInstagram.ServiseInstagram.Allinterfaces;

import Chat.User;
import RealInstagram.DataBazaInstagram;
import RealInstagram.ServiseInstagram.Allinterfaces.Interfaces.InterUser;
import RealInstagram.ServiseInstagram.UserPole;
import lmsReal.Database;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UserMethod implements InterUser {
    @Override
    public UserPole[] addnewUser() {
        UserPole userPole = new UserPole();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write name: ");
            String name = scanner.nextLine();
            if (name.length() > 2) {
                userPole.setName(name);
                break;
            }
        }
        while (true) {
            System.out.println("Write login: ");
            String name2 = scanner.nextLine();
            if (name2.length() > 2 && proverkaUnical(name2)) {
                userPole.setLogin(name2);
                break;
            }
        }
        while (true) {
            System.out.println("Weite pasword");
            String pass = scanner.nextLine();
            if (pass.length() > 4) {
                userPole.setPassword(pass);
                break;
            }
        }
        userPole.setDateTime(ZonedDateTime.now());
        userPole.setDosiliNeDos(false);
        userPole.setPodpischikiOriginal(userPole.getPodpischiki());
        userPole.setPodpiskaoriginal(userPole.getPodpiska());
        DataBazaInstagram.user = Arrays.copyOf(DataBazaInstagram.user, DataBazaInstagram.user.length + 1);
        DataBazaInstagram.user[DataBazaInstagram.user.length - 1] = userPole;
        return DataBazaInstagram.user;
    }

    @Override
    public UserPole loginproverka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write login");
        String name = scanner.nextLine();
        System.out.println("Write password");
        String password = scanner.nextLine();
        for (int i = 0; i < DataBazaInstagram.user.length; i++) {
            if (name.equalsIgnoreCase(DataBazaInstagram.user[i].getLogin()) && password.equalsIgnoreCase(DataBazaInstagram.user[i].getPassword())) {
                System.out.println("Welcome " + DataBazaInstagram.user[i].getName());
                return DataBazaInstagram.user[i];

            }
        }
        return null;
    }

    @Override
    public UserPole createInfo(UserPole userPole) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write command update:
                1.Name
                2.Login
                3.Password
                4.Biogravia
                5.Gender
                 """);
        switch (scanner.nextInt()) {
            case 1 -> {
                while (true) {
                    System.out.println("Write name: ");
                    String name = scanner.nextLine();
                    if (name.length() > 2) {
                        userPole.setName(scanner.nextLine());
                        break;
                    }
                }
            }
            case 2 -> {
                while (true) {
                    System.out.println("Write Login");
                    String name = scanner.nextLine();
                    if (name.length() > 2 && proverkaUnical(name)) {
                        userPole.setLogin(name);
                        break;
                    }
                }
            }
            case 3 -> {
                while (true) {
                    System.out.println("Write password: ");
                    String pass = scanner.nextLine();
                    if (pass.length() > 4) {
                        userPole.setPassword(scanner.nextLine());
                        break;
                    }
                }
            }
            case 4 -> {
                while (true) {
                    System.out.println("Write biogravia: ");
                    String bio = scanner.nextLine();
                    if (bio.length() > 3) {
                        userPole.setBiogravia(scanner.nextLine());
                        break;
                    }
                }
            }
        }
        return userPole;
    }

    @Override
    public UserPole[] deleteMyaccaunt(UserPole userPole) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("ESLI HOTITE UDALIT ACCAUNT write 1");
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Write password for delete! ");
                String passswprd = scanner2.nextLine();
                for (int i = 0; i < DataBazaInstagram.user.length; i++) {
                    if (userPole.getPassword().equalsIgnoreCase(passswprd)) {
                        for (int j = 0; j < DataBazaInstagram.user.length; j++) {
                            if (DataBazaInstagram.user[j].getLogin().equalsIgnoreCase(userPole.getLogin())) {
                                for (int l = j; l < Database.groups.length - 1; l++) {
                                    DataBazaInstagram.user[l] = DataBazaInstagram.user[l + 1];
                                    System.out.println("Deleted accaunt succes!");
                                }
                            }
                        }
                        return DataBazaInstagram.user = Arrays.copyOf(DataBazaInstagram.user, DataBazaInstagram.user.length - 1);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void seemyProfile(UserPole userPole) {
        System.out.println("My profile:");
        System.out.println(STR. """
                1)My name: \{ userPole.getLogin() }
                2)My posts: \{ userPole.getPosts().length }
                3)My podoischiki \{ userPole.getPodpischiki().length }
                4)My podpiski \{ userPole.getPodpiska().length }
                5)My posts\{ Arrays.toString(userPole.getPosts()) }
                """ );
    }

    @Override
    public void seeAllPostsInbaza(UserPole userPole) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        if (userPole.getPodpiska().length > 0) {
            LOOPSEEALLPOST1:
            while (true) {
                System.out.println("""
                         Write number
                        2 down
                        8 up
                        0 break
                                              
                         """);
                int action = sc.nextInt();
                switch (action) {
                    case 2, 8 -> {
                        int allUserinBAza = 0;
                        int allPostsUSer = 0;
                        allUserinBAza += userPole.getPodpiska().length;
                        while (true) {
                            int ran = random.nextInt(allUserinBAza);
                            if (userPole.getPodpiska()[ran].getPosts().length > 0) {
                                allPostsUSer += DataBazaInstagram.user[ran].getPosts().length;
                                int randompos = random.nextInt(allPostsUSer);
                                System.out.println("Login: " + DataBazaInstagram.user[ran].getLogin());
                                System.out.println("Post: " + DataBazaInstagram.user[ran].getPosts()[randompos]);
                                break;
                            }
                        }

                    }

                    case 0 -> {
                        break LOOPSEEALLPOST1;
                    }
                }
            }
        }
    }

    @Override
    public UserPole searchAccaunt(UserPole userPole) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write login");
        String login = scanner.nextLine();
        for (int i = 0; i < DataBazaInstagram.user.length; i++) {
            if (login.equalsIgnoreCase(DataBazaInstagram.user[i].getLogin())) {
                System.out.println("Login: " + DataBazaInstagram.user[i].getLogin());
                System.out.println("Name : " + DataBazaInstagram.user[i].getName());
                System.out.println("Biogravia" + DataBazaInstagram.user[i].getBiogravia());
                System.out.println("POSTS:" + Arrays.toString(DataBazaInstagram.user[i].getPosts()));
                System.out.println("PODPISCHIKI: " + DataBazaInstagram.user[i].getPodpischiki().length);
                System.out.println("PODPISKA: " + DataBazaInstagram.user[i].getPodpiska().length);
                if (proverka(userPole)) {
                    System.out.println("ESLI HOTITE PODPISAT: write 1");
                    try {
                        int num = scanner.nextInt();
                        if (num == 1 && proverka(userPole)) {
                            DataBazaInstagram.user[i].setPodpischiki(userPole);
                            userPole.setPodpiska(DataBazaInstagram.user[i]);
                            System.out.println("Success");
                        } else if (num == 0) {
                            System.out.println("OK");
                        }
                        System.out.println("Vy uje podpisana!");
                    } catch (InputMismatchException exception) {
                        System.out.println("Write number");
                        scanner.next();
                    }
                    return DataBazaInstagram.user[i];
                }
                return DataBazaInstagram.user[i];

            }
        }
        return null;
    }

    public boolean proverka(UserPole userPole2) {
        for (int i = 0; i < DataBazaInstagram.user.length; i++) {
            for (int j = 0; j < DataBazaInstagram.user[i].getPodpischiki().length; j++) {
                if (userPole2.getLogin().equalsIgnoreCase(DataBazaInstagram.user[i].getPodpischiki()[j].getLogin())) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean proverkaUnical(String name) {
        for (int i = 0; i < DataBazaInstagram.user.length; i++) {
            if (name.equalsIgnoreCase(DataBazaInstagram.user[i].getLogin())) {
                return false;
            }
        }
        return true;
    }
}
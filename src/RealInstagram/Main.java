package RealInstagram;

import RealInstagram.ServiseInstagram.Allinterfaces.*;
import RealInstagram.ServiseInstagram.ChatPole;
import RealInstagram.ServiseInstagram.UserPole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserPole correntUser = new UserPole();
        UserMethod userMethod = new UserMethod();
        PostMethod postMethod = new PostMethod();
        CommentMethod commentMethod = new CommentMethod();
        LikeMetods likeMetods = new LikeMetods();
        MAINLOOP:
        while (true) {
            try {

                System.out.println("""
                        1.REgistr
                        2.Login
                        0.EXIT
                                           
                        """);
                switch (scanner.nextInt()) {
                    case 1 -> {
                        DataBazaInstagram.user = userMethod.addnewUser();
                    }
                    case 2 -> {
                        correntUser = userMethod.loginproverka();
                        if (correntUser == null) {
                            System.out.println("No this accaiunt create accaunt");
                        } else {
                            MOOIN2LOOP:
                            while (true) {
                                System.out.println("""
                                        1.Home
                                        2.Search
                                        3.Add new post
                                        4.Recomentation
                                        5.My profile
                                        6.Delete my accaaunt
                                        7.Chat
                                        0.Exit
                                        """);
                                try {
                                    switch (scanner.nextInt()) {
                                        case 1 -> {
                                            System.out.println("HOME");
                                            userMethod.seeAllPostsInbaza(correntUser);
                                        }
                                        case 2 -> {
                                            System.out.println("Serach");
                                            UserPole userPole22 = userMethod.searchAccaunt(correntUser);
                                            if (userPole22 == null) {
                                                System.out.println("NOT TAKOI USER");
                                            }
                                        }
                                        case 3 -> {
                                            correntUser = postMethod.addnewPost(correntUser, correntUser.getPosts());
                                        }
                                        case 4 -> {
                                                System.out.println("RECOMENDATION");
//                                            postMethod.recamendation();
                                                postMethod.randomPOST(correntUser);
                                        }
                                        case 5 -> {
                                            System.out.println("My profile");
                                            postMethod.seeAllPostMyPost(correntUser, correntUser.getPosts());
                                            userMethod.seemyProfile(correntUser);
                                            MAINMYPROFILE:
                                            while (true) {
                                                System.out.println("For craete profile write 1");
                                                try {
                                                    switch (scanner.nextInt()) {
                                                        case 1 -> userMethod.createInfo(correntUser);
                                                        case 0 -> {
                                                            break MAINMYPROFILE;
                                                        }
                                                    }
                                                } catch (InputMismatchException exception) {
                                                    System.out.println("Write SAN");
                                                }
                                            }
                                        }
                                        case 6 -> {
                                            UserPole[] userPoles = userMethod.deleteMyaccaunt(correntUser);
                                            if (userPoles != null) {
                                                System.out.println("Success");
                                                break MOOIN2LOOP;
                                            } else System.out.println("POVTORITE POPYTKU ");
                                        }
                                        case 7->{ChatPole chatPole =new ChatPole();
                                            ChatMethod chatMethod = new ChatMethod();
                                            correntUser = chatMethod.addnewChat(correntUser,correntUser.getChatPolesketken());
                                        }
                                        case 0 -> {
                                            break MOOIN2LOOP;
                                        }
                                        default -> System.out.println("NOT COMMANT");
                                    }
                                } catch (InputMismatchException exception) {
                                    System.out.println("SAN JAZ!");
                                    scanner.next();
                                }
                            }
                        }
                    }
                    case 0 -> {
                        break MAINLOOP;
                    }
                }
            } catch (InputMismatchException exception) {
                System.out.println("WRITE NOMBER");
                scanner.next();
            }
        }

    }
}

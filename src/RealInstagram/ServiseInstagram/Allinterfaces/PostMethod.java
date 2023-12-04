package RealInstagram.ServiseInstagram.Allinterfaces;

import RealInstagram.DataBazaInstagram;
import RealInstagram.ServiseInstagram.Allinterfaces.Interfaces.InterPost;
import RealInstagram.ServiseInstagram.CommentPole;
import RealInstagram.ServiseInstagram.LikePole;
import RealInstagram.ServiseInstagram.PostPole;
import RealInstagram.ServiseInstagram.UserPole;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PostMethod implements InterPost {
    @Override
    public UserPole addnewPost(UserPole userPole, PostPole[] postPoles) {
        PostPole postPole = new PostPole();
        LikePole likePole = new LikePole();
        CommentPole commentPole = new CommentPole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write post");
        postPole.setDicription(scanner.nextLine());
        postPole.setDateTime(ZonedDateTime.now());
        postPoles = Arrays.copyOf(postPoles, postPoles.length + 1);
        postPoles[postPoles.length - 1] = postPole;
        userPole.setPosts(postPoles);
        System.out.println("Succes!");
        return userPole;
    }

    @Override
    public PostPole createPost(PostPole postPole) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write dickriptoin");
        postPole.setDicription(scanner.nextLine());
        return postPole;
    }

    @Override
    public PostPole[] deletePost(PostPole[] postPoles, PostPole postPole) {
        for (int i = 0; i < postPoles.length; i++) {
        }
        return null;
    }

    @Override
    public void seeAllPostMyPost(UserPole userPole, PostPole[] postPoles) {
        System.out.println(Arrays.toString(postPoles));
    }

    @Override
    public void recamendation() {
        for (int i = 0; i < DataBazaInstagram.user.length; i++) {
            for (int j = 0; j < DataBazaInstagram.user[i].getPosts().length - 1; j++) {
                if (DataBazaInstagram.user[i].getPosts()[j].getLikes().length > DataBazaInstagram.user[i].getPosts()[j + 1].getLikes().length) {
                    DataBazaInstagram.user[i].getPosts()[j].setLikes(DataBazaInstagram.user[i].getPosts()[j + 1].getLikes());
                }
            }
        }
    }

    @Override
    public void randomPOST(UserPole currentUSer) {
        Scanner scanner = new Scanner(System.in);
        LikeMetods likeMetods = new LikeMetods();

        Random random = new Random();
        int allUserinBAza = 0;
        int allPostsUSer = 0;
        allUserinBAza += DataBazaInstagram.user.length;
        while (true) {
            int ran = random.nextInt(allUserinBAza);
            if (DataBazaInstagram.user[ran].getPosts().length > 0) {
                allPostsUSer += DataBazaInstagram.user[ran].getPosts().length;
                int randompos = random.nextInt(allPostsUSer);
                System.out.println("Login: " + DataBazaInstagram.user[ran].getLogin());
                System.out.println("Post: " + DataBazaInstagram.user[ran].getPosts()[randompos]);
                System.out.println("\n\n\n Esli hotite postavit like (55) esli net (0)");
                System.out.println("\n\n\n Esli hotite postavit comment (123) esli net (0)");
                try {
                    int num = scanner.nextInt();
                    if (num == 55) {
                        if (proverkalike(currentUSer,ran,randompos)) {
                            likeMetods.addlikeIkPost(DataBazaInstagram.user[ran].getPosts()[randompos], currentUSer, DataBazaInstagram.user[ran].getPosts()[randompos].getLikes());
                            System.out.println("VY POSTAVILI LIKE");
                            break;
                        } else System.out.println("UJE EST LIKE"); break;

                    } else if (num == 0) {
                        break;
                    }else if (num == 123) {
                        CommentMethod commentMethod = new CommentMethod();
                        commentMethod.addcommentToPost(currentUSer,DataBazaInstagram.user[ran].getPosts()[randompos],DataBazaInstagram.user[ran].getPosts()[randompos].getComments());
                        System.out.println("Success");
                        break;
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("SAN JAZZ");
                    scanner.next();
                }
            }
        }
    }
    public boolean proverkalike(UserPole userPole2, int num1, int num2) {
        for (int i = 0; i < DataBazaInstagram.user[num1].getPosts()[num2].getLikes().length ;  i++) {
            if (userPole2.getLogin().equalsIgnoreCase(DataBazaInstagram.user[num1].getPosts()[num2].getLikes()[i].getUser().getLogin())){
                return false;
            }
        }

        return true;
    }
}

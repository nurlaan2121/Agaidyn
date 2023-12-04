package RealInstagram.ServiseInstagram.Allinterfaces;

import RealInstagram.ServiseInstagram.Allinterfaces.Interfaces.InterComment;
import RealInstagram.ServiseInstagram.CommentPole;
import RealInstagram.ServiseInstagram.PostPole;
import RealInstagram.ServiseInstagram.UserPole;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class CommentMethod implements InterComment {

    @Override
    public PostPole addcommentToPost(UserPole userPole,PostPole postPole,CommentPole [] commentPoles) {
        Scanner scanner = new Scanner(System.in);
        CommentPole commentPole = new CommentPole();
        System.out.println("Write comment");
        commentPole.setComment(scanner.nextLine());
        commentPole.setUser(userPole);
        commentPole.setLike(0);
        commentPole.setDateTime(ZonedDateTime.now());
        commentPoles = Arrays.copyOf(commentPoles,commentPoles.length+1);
        commentPoles [commentPoles.length-1] = commentPole;
        postPole.setComments(commentPoles);
        return postPole;
    }

    @Override
    public PostPole createcomment(CommentPole commentPole,PostPole postPole) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write coment");
        commentPole.setComment(scanner.nextLine());
        return postPole;
    }
}

package RealInstagram.ServiseInstagram;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;

public class PostPole {
    private String dicription;
    private CommentPole [] comments = new CommentPole[0];
    private LikePole [] likes = new LikePole[0];
    private ZonedDateTime dateTime;

    public PostPole() {
    }

    public PostPole(String dicription, CommentPole[] comments, LikePole[] likes, ZonedDateTime dateTime) {
        this.dicription = dicription;
        this.comments = comments;
        this.likes = likes;
        this.dateTime = dateTime;
    }

    public String getDicription() {
        return dicription;
    }

    public void setDicription(String dicription) {
        this.dicription = dicription;
    }

    public CommentPole[] getComments() {
        return comments;
    }

    public void setComments(CommentPole[] comments) {
        this.comments = comments;
    }

    public LikePole[] getLikes() {
        return likes;
    }

    public void setLikes(LikePole[] likes) {
        this.likes = likes;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        return "PostPole{" +
                "description='" + dicription + '\'' +
                ", comments=" + comments.length +
                ", likes=" + likes.length +
                ", dateTime=" + formattedDateTime +
                '}';
    }

}

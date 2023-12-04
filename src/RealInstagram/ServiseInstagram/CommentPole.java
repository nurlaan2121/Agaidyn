package RealInstagram.ServiseInstagram;

import java.time.ZonedDateTime;

public class CommentPole {
    private String comment;
    private UserPole user;
    private ZonedDateTime dateTime;
    private long like;

    public CommentPole() {
    }

    public CommentPole(String comment, UserPole user, ZonedDateTime dateTime,long like) {
        this.comment = comment;
        this.user = user;
        this.dateTime = dateTime;
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserPole getUser() {
        return user;
    }

    public void setUser(UserPole user) {
        this.user = user;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "comment='" + comment + '\'' +
                '}';
    }
}

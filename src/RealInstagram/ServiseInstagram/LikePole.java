package RealInstagram.ServiseInstagram;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class LikePole {
    private long likes = 0;
    private UserPole user;
    private ZonedDateTime dateTime;

    public LikePole() {
    }

    public LikePole(long likes, UserPole user, ZonedDateTime dateTime) {
        this.likes = likes;
        this.user = user;
        this.dateTime = dateTime;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likess) {
        this.likes = likess;
        likes++;
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

    @Override
    public String toString() {
        return "liketar=" + likes +
                '}';
    }
}

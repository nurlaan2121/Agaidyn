package RealInstagram.ServiseInstagram;

import lmsReal.Database;
import lmsReal.Gender;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class UserPole {
    private String name;
    private boolean DosiliNeDos;
    private UserPole [] podpiska = new UserPole[0];
    private UserPole [] podpischiki = new UserPole[0];
    private String Login;
    private String biogravia;
    private String password;
    private Gender gender;
    private ZonedDateTime dateTime;
    private PostPole[] posts = new PostPole[0];
    private ChatPole [] chatPoleskelgen = new ChatPole[0];
    private ChatPole [] chatPolesketken = new ChatPole[0];

    public UserPole() {
    }

    public UserPole(String name, boolean dosiliNeDos, UserPole[] podpiska, UserPole[] podpischiki, String login, String biogravia, String password, Gender gender, ZonedDateTime dateTime, PostPole[] posts) {
        this.name = name;
        DosiliNeDos = dosiliNeDos;
        this.podpiska = podpiska;
        this.podpischiki = podpischiki;
        Login = login;
        this.biogravia = biogravia;
        this.password = password;
        this.gender = gender;
        this.dateTime = dateTime;
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDosiliNeDos() {
        return DosiliNeDos;
    }

    public void setDosiliNeDos(boolean dosiliNeDos) {
        DosiliNeDos = dosiliNeDos;
    }

    public UserPole[] getPodpiska() {
        return podpiska;
    }

    public void setPodpiska(UserPole podpiskaaa) {
        podpiska = Arrays.copyOf(podpiska,podpiska.length+1);
        podpiska[podpiska.length-1] = podpiskaaa;

    }public void setPodpiskaoriginal(UserPole [] podpiskaaa) {
        this.podpiska = podpiskaaa;
    }
    public UserPole[] getPodpischiki() {
        return podpischiki;
    }

    public void setPodpischiki(UserPole podpischik) {
        podpischiki = Arrays.copyOf(podpischiki,podpischiki.length+1);
        podpischiki[podpischiki.length-1] = podpischik;

    }public void setPodpischikiOriginal(UserPole [] podpischik) {
        this.podpischiki = podpischik;

    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getBiogravia() {
        return biogravia;
    }

    public void setBiogravia(String biogravia) {
        this.biogravia = biogravia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public PostPole[] getPosts() {
        return posts;
    }

    public void setPosts(PostPole[] posts) {
        this.posts = posts;
    }

    public ChatPole[] getChatPoleskelgen() {
        return chatPoleskelgen;
    }

    public void setChatPoleskelgen(ChatPole[] chatPoleskelgen) {
        this.chatPoleskelgen = chatPoleskelgen;
    }

    public ChatPole[] getChatPolesketken() {
        return chatPolesketken;
    }

    public void setChatPolesketken(ChatPole[] chatPolesketken) {
        this.chatPolesketken = chatPolesketken;
    }

    @Override
    public String toString() {
        return ", posts=" + posts.length +
                '}';
    }

}

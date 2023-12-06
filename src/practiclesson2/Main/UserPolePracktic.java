package practiclesson2.Main;

import RealInstagram.ServiseInstagram.PostPole;

import java.util.ArrayList;

public class UserPolePracktic {
    private  Long idUser;
    private String email;
    private String password;
    private String fullName;
    private GenderPrackticLesson gender;
    private ArrayList<PostPolePractic> posts = new ArrayList<>();

    public UserPolePracktic() {
    }

    public UserPolePracktic(Long idUser, String email, String password, String fullName, GenderPrackticLesson gender) {
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GenderPrackticLesson getGender() {
        return gender;
    }

    public void setGender(GenderPrackticLesson gender) {
        this.gender = gender;
    }

    public ArrayList<PostPolePractic> getPosts() {
        return posts;
    }

    public void setPosts(PostPolePractic postss) {
        posts.add(postss);
    }

    @Override
    public String toString() {
        return "UserPolePracktic{" +
                "idUser=" + idUser +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

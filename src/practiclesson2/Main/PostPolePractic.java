package practiclesson2.Main;

public class PostPolePractic {
    private Long idPost;
    private String dickrpiption;
    private String urlImage;

    public PostPolePractic() {
    }

    public PostPolePractic(Long idPost, String dickrpiption, String urlImage) {
        this.idPost = idPost;
        this.dickrpiption = dickrpiption;
        this.urlImage = urlImage;
    }

    public Long getIdPost() {
        return idPost;
    }

    public void setIdPost(Long idPost) {
        this.idPost = idPost;
    }

    public String getDickrpiption() {
        return dickrpiption;
    }

    public void setDickrpiption(String dickrpiption) {
        this.dickrpiption = dickrpiption;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "PostPolePractic{" +
                "idPost=" + idPost +
                ", dickrpiption='" + dickrpiption + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}

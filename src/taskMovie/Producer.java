package taskMovie;

public class Producer {
    private Long id;
    private String fersName;
    private String lastName;

    public Producer() {
    }

    public Producer(Long id, String fersName, String lastName) {
        this.id = id;
        this.fersName = fersName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFersName() {
        return fersName;
    }

    public void setFersName(String fersName) {
        this.fersName = fersName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "ID=" + id +
                "| fersName='" + fersName + '\'' +
                "| lastName='" + lastName + '\'' + "\n" +
                '}';
    }
}

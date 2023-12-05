package prackticLessonList;

public class Contact {
    private long phonenumber;
    private String fullName;

    public Contact() {
    }

    public Contact(long phonenumber, String fullName) {
        this.phonenumber = phonenumber;
        this.fullName = fullName;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                ", fullName='" + fullName + '\'' +
                "phonenumber=" + phonenumber +
                '}';
    }
}

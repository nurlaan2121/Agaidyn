package prackticLessonList;

import java.util.ArrayList;

public class Phone {
    private String name;
    private String brandName;
    private String password;
    private ArrayList<Contact> contacts;

    public Phone() {
    }

    public Phone(String name, String brandName, String password, ArrayList<Contact> contacts) {
        this.name = name;
        this.brandName = brandName;
        this.password = password;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
}

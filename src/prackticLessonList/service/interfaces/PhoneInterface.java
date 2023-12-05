package prackticLessonList.service.interfaces;

import prackticLessonList.Contact;
import prackticLessonList.Phone;

import java.util.ArrayList;

public interface PhoneInterface {
    String tornOn(int num);
    Contact callinTNumber(long num);
    Contact callinName(String name);
    ArrayList<Contact> update(String name);
    void getall();

}

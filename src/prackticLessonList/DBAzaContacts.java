package prackticLessonList;

import java.util.ArrayList;

public class DBAzaContacts {

        public static ArrayList<Contact> allmassive = new ArrayList<>();

    public Phone myphone() {
        Phone phone = new Phone();
        phone.setName("Nokia");
        phone.setContacts(DBAzaContacts.allmassive);
        phone.setBrandName("3310");
        phone.setPassword("1234");
        return phone;
    }
}

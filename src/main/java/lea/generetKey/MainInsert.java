package lea.generetKey;

import a_stamp.Contact;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.Date;
import java.util.GregorianCalendar;

/**
 * Created by john on 01.02.17.
 */
public class MainInsert {
    public static void main(String[] args) {
        GenericXmlApplicationContext gec = new GenericXmlApplicationContext();
        gec.load("classpath:resInsert/spInsert.xml");
        gec.refresh();

        ContactDao contactDao = gec.getBean("jdbcContact", JdbcContactDao.class);
        Contact contact = new Contact();
        contact.setFirst_name("Tiko");
        contact.setLast_name("Mouse");
        contact.setBirth_date(new Date( ( new GregorianCalendar(2001, 10, 1) ).getTime().getTime() ) );

        contactDao.insert(contact);
    }
}

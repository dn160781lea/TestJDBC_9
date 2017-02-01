package lea.selectSearch.JdbcDaoGetDate;

import a_stamp.Adress;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by User on 01.02.2017.
 */
public class MainJdbc {
    public static void main(String[] args) {
        GenericXmlApplicationContext gec = new GenericXmlApplicationContext();
        gec.load("classpath:selectSearchSP/sp-conf-select.xml");
        gec.refresh();

        JdbcDaoGetDate jDao = gec.getBean("jdbcDaoGetDate", JdbcDaoGetDate.class);
        List<Adress> listAdress=jDao.findByFirstName("John");

        for (Adress a:listAdress) {
            System.out.println(a.toString());
        }

    }
}

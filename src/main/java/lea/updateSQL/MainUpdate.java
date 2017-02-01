package lea.updateSQL;

import a_stamp.Adress;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by User on 01.02.2017.
 */
public class MainUpdate {
    public static void main(String[] args) {
        GenericXmlApplicationContext gec = new GenericXmlApplicationContext();
        gec.load("classpath:resourcesUpdate/conf-sp.xml");
        gec.refresh();

        GetDateUpdate getDateUpdate = gec.getBean("jdbcAdressDaoSqlUpdate", GetDateUpdate.class);

        Adress adress = new Adress();
        adress.setFirst_name("Marry");
        adress.setSecond_name("Kis");
        adress.setTelephon(5555555);
        adress.setTown("Manhaten");

        getDateUpdate.update(adress, "Dick");



    }
}

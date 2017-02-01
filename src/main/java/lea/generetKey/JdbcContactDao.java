package lea.generetKey;

import a_stamp.Contact;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 01.02.17.
 */
public class JdbcContactDao implements ContactDao {
    private static final Log LOG = LogFactory.getLog(JdbcContactDao.class);

    private DataSource dataSource;
    private InsertContact insertContact;

    @Override
    public void insert(Contact contact) {
        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("first_name", contact.getFirst_name());
        paramMap.put("last_name", contact.getLast_name());
        paramMap.put("birth_date", contact.getBirth_date());

        KeyHolder keyHolder = new GeneratedKeyHolder();
        insertContact.updateByNamedParam(paramMap, keyHolder);

        contact.setId (keyHolder.getKey().intValue());

        System.out.println("#########################   contact.getId() : "+contact.getId());
        LOG.info("new contact insert with id: "+contact.getId()+ " -------------------------------");

    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        insertContact = new InsertContact(dataSource);
    }
}

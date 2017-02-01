package lea.selectSearch.JdbcDaoGetDate;

import a_stamp.Adress;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by john on 31.01.17.
 */
public class JdbcDaoGetDate implements GetDate {

    private DataSource dataSource;
    private SelectContactByFirstName selectContactByFirstName;

    public List<Adress> findByFirstName(String first_name) {
        Map<String, Object> paremetrNameMap = new HashMap<String, Object>();
        paremetrNameMap.put ("first_name", first_name);

        return selectContactByFirstName.executeByNamedParam(paremetrNameMap);
    }


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.selectContactByFirstName = new SelectContactByFirstName(dataSource);
        if (dataSource == null) {
            System.out.println("----------------not connection----------");
        }
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}

package lea.updateSQL;

import a_stamp.Adress;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 01.02.2017.
 */
public class JdbcAdressDaoSqlUpdate implements GetDateUpdate {
    private DataSource dataSource;
    private UpdateTabAdress updateTabAdress;


    public void update(Adress adress, String second_nameWhere) {
        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("first_name", adress.getFirst_name());
        paramMap.put("second_name", adress.getSecond_name());
        paramMap.put("telephon", adress.getTelephon());
        paramMap.put("town", adress.getTown());
        paramMap.put("second_nameWhere", second_nameWhere);

        updateTabAdress.updateByNamedParam(paramMap);


    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.updateTabAdress = new UpdateTabAdress(dataSource);
    }
}

package lea.selectSearch.JdbcDaoGetDate;

import a_stamp.Adress;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by john on 31.01.17.
 */
public class SelectContactByFirstName extends MappingSqlQuery <Adress>{

    private static final String SQL_FIRST_NAME =
             "select first_name, second_name, telephon, town\n"+
             "from adress\n"+
             "where first_name = :first_name";


    public SelectContactByFirstName (DataSource dataSource) {
        super(dataSource, SQL_FIRST_NAME);
        super.declareParameter(new SqlParameter("first_name", Types.VARCHAR));
    }


    protected Adress mapRow (ResultSet resultSet, int rowNum) throws SQLException {
        Adress adress = new Adress();
        adress.setFirst_name(resultSet.getString("first_name"));
        adress.setSecond_name(resultSet.getString("second_name"));
        adress.setTelephon(resultSet.getInt("telephon"));
        adress.setTown(resultSet.getString("town"));
        return adress;

    }


}

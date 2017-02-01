package lea.updateSQL;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * Created by User on 01.02.2017.
 */
public class UpdateTabAdress extends SqlUpdate{

//    second_name=:second_name,

    private static final String SQL_UPDATE_CONTACT=
            "update adress set first_name=:first_name, second_name=:second_name, " +
                    "telephon=:telephon, town=:town\n "+
            "where second_name=:second_nameWhere";


    public UpdateTabAdress (DataSource dataSource) {
        super(dataSource, SQL_UPDATE_CONTACT);

        super.declareParameter(new SqlParameter("first_name", Types.VARCHAR));
        super.declareParameter(new SqlParameter("second_name", Types.VARCHAR));
        super.declareParameter(new SqlParameter("telephon", Types.INTEGER));
        super.declareParameter(new SqlParameter("town", Types.VARCHAR));
        super.declareParameter(new SqlParameter("second_nameWhere", Types.VARCHAR));

        System.out.println("**********************************************************************");
        System.out.println(SQL_UPDATE_CONTACT);
        System.out.println("**********************************************************************");
    }


}

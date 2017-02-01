package lea.selectSearch.JdbcDaoGetDate;

import a_stamp.Adress;

import java.util.List;

/**
 * Created by john on 31.01.17.
 */
public interface GetDate {
    List<Adress> findByFirstName (String first_name);
}

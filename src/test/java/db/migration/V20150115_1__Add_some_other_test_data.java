package db.migration;


import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 * Created by Kevin.De.Man on 3-4-14.
 */
public class V20150115_1__Add_some_other_test_data implements JdbcMigration {

    private final static String INSERT_STATEMENT =  "INSERT INTO employees(emp_hours_per_day, emp_last_name, emp_name, emp_vacation_rights) VALUES ( ?, ?, ?, ?);\n";

    @Override
    public void migrate(Connection connection) throws Exception {

        PreparedStatement insertEmployee;
        System.out.println("In Java file ...");
        for(int i=0; i<10; i++) {

            insertEmployee = connection.prepareStatement(INSERT_STATEMENT);
            insertEmployee.setDouble(1, 8.0);
            insertEmployee.setString(2, "Person " + i);
            insertEmployee.setString(3, "Some");
            insertEmployee.setDouble(4, 240.0);

            insertEmployee.execute();
            connection.commit();
        }



    }
}
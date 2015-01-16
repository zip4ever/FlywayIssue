package com.realdolmen.personal.timereg.flyway;

import org.flywaydb.core.api.resolver.MigrationExecutor;
import org.flywaydb.core.internal.dbsupport.DbSupport;
import org.flywaydb.core.internal.dbsupport.JdbcTemplate;
import org.flywaydb.core.internal.dbsupport.SqlScript;
import org.flywaydb.core.internal.util.PlaceholderReplacer;
import org.flywaydb.core.internal.util.scanner.Resource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by KDAAU95 on 14/01/2015.
 */
public class CsvMigrationExecutor implements MigrationExecutor {
    private final DbSupport dbSupport;
    private final PlaceholderReplacer placeholderReplacer;
    private final Resource sqlScriptResource;
    private final String encoding;

    public CsvMigrationExecutor(DbSupport dbSupport, PlaceholderReplacer placeholderReplacer, Resource sqlScriptResource, String encoding) {
        this.dbSupport = dbSupport;
        this.placeholderReplacer = placeholderReplacer;
        this.sqlScriptResource = sqlScriptResource;
        this.encoding = encoding;
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        SqlScript sqlScript = new SqlScript(dbSupport, sqlScriptResource, placeholderReplacer, encoding);
        sqlScript.execute(new JdbcTemplate(connection, 0));
    }

    @Override
    public boolean executeInTransaction() {
        return true;
    }
}

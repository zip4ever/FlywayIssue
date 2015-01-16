package com.realdolmen.personal.timereg.flyway;

import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.callback.FlywayCallback;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.logging.Level;

/**
 * Created by KDAAU95 on 14/01/2015.
 */
public class MyFlywayCallbackImpl implements FlywayCallback {

    @Override
    public void beforeClean(Connection connection) {
    }

    @Override
    public void afterClean(Connection connection) {
    }

    @Override
    public void beforeMigrate(Connection connection) {

    }

    @Override
    public void afterMigrate(Connection connection) {

    }

    @Override
    public void beforeEachMigrate(Connection connection, MigrationInfo migrationInfo) {
        String version = migrationInfo.getVersion().toString();
        String descritption = migrationInfo.getDescription();
        System.out.println(String.format("afterEachMigrate: Version %s: %s", version, descritption));
    }

    @Override
    public void afterEachMigrate(Connection connection, MigrationInfo migrationInfo) {

    }

    @Override
    public void beforeValidate(Connection connection) {

    }

    @Override
    public void afterValidate(Connection connection) {

    }

    @Override
    public void beforeBaseline(Connection connection) {

    }

    @Override
    public void afterBaseline(Connection connection) {

    }

    @Override
    public void beforeInit(Connection connection) {

    }

    @Override
    public void afterInit(Connection connection) {

    }

    @Override
    public void beforeRepair(Connection connection) {

    }

    @Override
    public void afterRepair(Connection connection) {

    }

    @Override
    public void beforeInfo(Connection connection) {

    }

    @Override
    public void afterInfo(Connection connection) {

    }
}

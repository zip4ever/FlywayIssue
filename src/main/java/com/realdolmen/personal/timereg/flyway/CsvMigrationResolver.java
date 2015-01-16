package com.realdolmen.personal.timereg.flyway;

import org.flywaydb.core.api.resolver.MigrationResolver;
import org.flywaydb.core.api.resolver.ResolvedMigration;

import java.util.Collection;

/**
 * Created by KDAAU95 on 14/01/2015.
 */
public class CsvMigrationResolver implements MigrationResolver {
    @Override
    public Collection<ResolvedMigration> resolveMigrations() {
        return null;
    }
}

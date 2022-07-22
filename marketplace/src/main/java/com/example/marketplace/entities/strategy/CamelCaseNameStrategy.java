package com.example.marketplace.entities.strategy;

import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CamelCaseNameStrategy extends CamelCaseToUnderscoresNamingStrategy {
        @Override
        protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
            return new Identifier(name.replace("_",""),true);
        }

}


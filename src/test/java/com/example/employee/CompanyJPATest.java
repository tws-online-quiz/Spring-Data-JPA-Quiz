package com.example.employee;

import org.flywaydb.core.Flyway;
import org.junit.Before;

public class CompanyJPATest {
    @Before
    public void setUp() throws Exception {
        Flyway flyway = new Flyway();
        flyway.migrate();
    }
}

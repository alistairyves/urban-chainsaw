package com.alistairyves.simple-java-rest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class simple-java-restApplication extends Application<simple-java-restConfiguration> {

    public static void main(final String[] args) throws Exception {
        new simple-java-restApplication().run(args);
    }

    @Override
    public String getName() {
        return "simple-java-rest";
    }

    @Override
    public void initialize(final Bootstrap<simple-java-restConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final simple-java-restConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

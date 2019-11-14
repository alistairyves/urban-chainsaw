package com.alistairyves.simplejavarest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SimpleJavaRestApplication extends Application<SimpleJavaRestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SimpleJavaRestApplication().run(args);
    }

    @Override
    public String getName() {
        return "simple-java-rest";
    }

    @Override
    public void initialize(final Bootstrap<SimpleJavaRestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SimpleJavaRestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

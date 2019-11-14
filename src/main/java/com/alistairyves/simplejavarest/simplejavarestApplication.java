package com.alistairyves.simplejavarest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class simplejavarestApplication extends Application<simplejavarestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new simplejavarestApplication().run(args);
    }

    @Override
    public String getName() {
        return "simple-java-rest";
    }

    @Override
    public void initialize(final Bootstrap<simplejavarestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final simplejavarestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.rxjava3.core.Completable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/test")
public class TestController {
    private final static Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Get
    public Completable testCompletable() {
        return Completable.error(new RuntimeException("Test"))
                .doOnError(error -> LOG.error(error.getMessage(), error));
    }
}

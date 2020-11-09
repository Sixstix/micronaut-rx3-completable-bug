package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.rxjava3.core.Completable;

@Controller("/test")
public class TestController {
    @Get
    public Completable testCompletable() {
        return Completable.error(new RuntimeException("Test"));
    }
}

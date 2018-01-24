package io.muic.ooc.design;

import org.apache.commons.lang.RandomStringUtils;

public class UserFactory {

    private String hello;

    public static String createUsername() {
        return RandomStringUtils.randomAlphabetic(5);
    }
    public String createUsername2() {
        return RandomStringUtils.randomAlphabetic(5);
    }
}

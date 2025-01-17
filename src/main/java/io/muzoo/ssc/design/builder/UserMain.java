package io.muzoo.ssc.design.builder;

public class UserMain {

    public static void main(String[] args) {

        User user = User.builder("gigadot", "gigadot@gmail.com")
                .firstName("Weerapong")
                .lastName("Phadungsukanan")
                .build();
    }
}

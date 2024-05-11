package io.muic.ooc.design.builder;

public class User {

    // required
    private String username;

    // required
    private String email;

    // optional
    private String firstName;

    // optional
    private String lastName;

    private User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static UserBuilder builder(String username, String email) {
        return new UserBuilder(username, email);
    }

    public static class UserBuilder {
        // required
        private String username;

        // required
        private String email;

        // optional
        private String firstName;

        // optional
        private String lastName;

        private UserBuilder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public UserBuilder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public UserBuilder lastName(String value) {
            this.lastName = value;
            return this;
        }

        public User build() {
            User user = new User(username, email);
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            return user;
        }
    }



}

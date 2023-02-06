package ru.nishpal.ithub.builder;

import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String password;
    private String aboutMe;

    public User(UUID id, String username, String password, String aboutMe) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.aboutMe = aboutMe;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private UUID id;
        private String username;
        private String password;
        private String aboutMe;

        private Builder() {

        }

        public Builder setUUID(UUID id) {
            this.id = id;
            System.out.println(this);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAboutMe(String aboutMe) {
            this.aboutMe = aboutMe;
            return this;
        }

        public User build() {
            return new User(id, username, password, aboutMe);
        }
    }
}

//        User user = User.newBuilder()
//                .setUsername("Danya")
//                .setPassword("1234qwerty")
//                .setUUID(UUID.randomUUID())
//                .setAboutMe(null).build();
//        System.out.println(user);

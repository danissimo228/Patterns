package ru.nishpal.ithub.builder;

import java.util.UUID;

public class SecondUser {
    private UUID id;
    private String username;
    private String password;
    private String aboutMe;

    private SecondUser() {

    }

    @Override
    public String toString() {
        return "SecondUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                '}';
    }

    public static SecondBuilder newSecondBuilder() {
        return new SecondUser().new SecondBuilder();
    }

    public class SecondBuilder {

        private SecondBuilder() {

        }

        public SecondBuilder setId(UUID id) {
            SecondUser.this.id = id;
            return this;
        }

        public SecondBuilder setUsername(String username) {
            SecondUser.this.username = username;
            return this;
        }

        public SecondBuilder setPassword(String password) {
            SecondUser.this.password = password;
            return this;
        }

        public SecondBuilder setAboutMe(String aboutMe) {
            SecondUser.this.aboutMe = aboutMe;
            return this;
        }

        public SecondUser build() {
            return SecondUser.this;
        }
    }
}


//        SecondUser secondUser = SecondUser.newSecondBuilder()
//                .setUsername("Danya")
//                .setPassword("1234qwerty")
//                .setId(UUID.randomUUID())
//                .setAboutMe(null).build();
//        System.out.println(secondUser);

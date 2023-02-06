package ru.nishpal.ithub.task;

public class User {
    private Role role;
    private String name;
    private String password;

    private User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "role=" + role +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static Builder newBuilder() {
        return new User().new Builder();
    }

    public class Builder {
        private Builder() {

        }

        public Builder setRole(Role role) {
            User.this.role = role;
            return this;
        }

        public Builder setName(String name) {
            User.this.name = name;
            return this;
        }

        public Builder setRole(String password) {
            User.this.password = password;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}

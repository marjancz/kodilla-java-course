package com.kodilla.good.patterns.challenges.Allegro;

public class User {
    private String name;
    private String surname;
    private String eMail;
    private String mobile;

    public User(final String name, final String surname, final String eMail, final String mobile) {
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return eMail;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", eMail='" + eMail + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

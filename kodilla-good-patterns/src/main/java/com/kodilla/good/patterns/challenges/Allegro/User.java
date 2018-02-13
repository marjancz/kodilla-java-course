package com.kodilla.good.patterns.challenges.Allegro;

public class User {
    private final String name;
    private final String surname;
    private final String eMail;
    private final String mobile;

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
        return "User: " +
                "\n name: '" + name + '\'' +
                "\n surname: '" + surname + '\'' +
                "\n eMail: '" + eMail + '\'' +
                "\n mobile: '" + mobile + '\'';
    }
}

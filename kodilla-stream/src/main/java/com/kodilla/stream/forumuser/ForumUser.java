package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int personalId;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int postCount;

    public ForumUser(int personalId, String name, char sex, LocalDate birthDate,
                     int postCount) {
        this.personalId = personalId;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthDate() {
        return birthDate.getYear();
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "personalId=" + personalId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}

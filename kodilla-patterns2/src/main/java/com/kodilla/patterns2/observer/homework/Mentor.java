package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorname;
    private int updateCount;

    public Mentor(String mentorname) {
        this.mentorname = mentorname;
    }

    @Override
    public void update(Homework homework) {

        System.out.println(mentorname + ": New work in queue to verify from " + homework.getStudent() + "\n" +
                "Link: " + homework.getHomeworks().peekLast() + "\n" +
                " (total: " + homework.getHomeworks().size() + " works)");
        updateCount++;
    }

    public String getMentorname() {
        return mentorname;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
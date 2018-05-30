package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Homework implements Observable {
    private Observer observer;
    private final Deque<String> homeworks;
    private final String student;

    public Homework(String student) {
        homeworks = new ArrayDeque<>();
        this.student = student;
    }

    public void addWork(String work) {
        homeworks.offer(work);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObservers() {
        observer.update(this);
    }

    //@Override
    //public void removeObserver(Observer observer) {
    //	observers.remove(observer);
    //}

    public Deque<String> getHomeworks() {
        return homeworks;
    }

    public String getStudent() {
        return student;
    }
}

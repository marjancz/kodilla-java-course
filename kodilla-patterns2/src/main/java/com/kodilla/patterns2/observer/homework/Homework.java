package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Homework implements Observable {
    private final List<Observer> observers;
    private final Deque<String> homeworks;
    private final String student;

    public Homework(String student) {
        homeworks = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.student = student;
    }

    public void addWork(String work) {
        homeworks.offer(work);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getHomeworks() {
        return homeworks;
    }

    public String getStudent() {
        return student;
    }
}

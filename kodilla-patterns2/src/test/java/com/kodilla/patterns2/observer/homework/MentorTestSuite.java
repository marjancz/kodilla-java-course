package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework student1 = new Student1();
        Homework student2 = new Student2();
        Mentor erwinMuzyczuk = new Mentor("Erwin Muzyczuk");
        Mentor mentor2 = new Mentor("Mentor 2");
        student1.registerObserver(erwinMuzyczuk);
        //student2.registerObserver(erwinMuzyczuk);
        student2.registerObserver(mentor2);

        //When
        student1.addWork("https://github.com/marjancz/work1");
        student2.addWork("https://github.com/student2/work1");
        student1.addWork("https://github.com/marjancz/work2");
        student1.addWork("https://github.com/marjancz/work3");
        student2.addWork("https://github.com/student/work2");

        //Then
        assertEquals(3, erwinMuzyczuk.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
package com.marjancz.module_01;

interface Quest {
    void process();
}

class DeadIslandQuest implements Quest {

    boolean statusDeadIslandQuest;
    public DeadIslandQuest(boolean statusDeadIslandQuest) {
        this.statusDeadIslandQuest = statusDeadIslandQuest;
    }

    public void process() {
        if(statusDeadIslandQuest == true) {
            System.out.println("Well done!!! You've killed a dragon. Your Dead Island quest has been successful accomplished");
        } else {
            System.out.println("Damn it!!! Your Dead Island quest has been a failure accomplished. You've been killed by the dragon.");
        }
    }
}

class EliteKnightQuest implements Quest {

    boolean statusEliteKnightQuest;
    public EliteKnightQuest(boolean statusEliteKnightQuest) {
        this.statusEliteKnightQuest = statusEliteKnightQuest;
    }

    public void process() {
        if (statusEliteKnightQuest) {
            System.out.println("Well done!!! You've killed a three-headed dragon. Your Elite Knight quest has been successful accomplished");
        } else {
            System.out.println("Damn it!!! Your Elite Knight quest has been a failure accomplished. You've been killed by the three-headed dragon.");
        }
    }
}

class Knight {
    public Quest quest;
    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void mission() {
        System.out.println("You're starting a dangerous quest...");
        quest.process();
        System.out.println("The 'Brave Knight' program has ended.");
    }
}

class App13 {
    public static void main (String[] args) throws java.lang.Exception {

        Knight knight = new Knight(new EliteKnightQuest(false));
        knight.mission();
    }
}

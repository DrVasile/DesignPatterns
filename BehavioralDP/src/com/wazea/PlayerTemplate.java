package com.wazea;

abstract class PlayerTemplate {

    abstract void train();
    abstract void rest();
    abstract void play();

    final void trainTillCompetition(int cnt) {
        for (int i = 0; i <= cnt; i++) {
            System.out.println("Day " + i + "!");
            train();
            rest();
        }
        play();
    }
}

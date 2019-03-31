package com.wazea;

class BasketballPlayer extends PlayerTemplate {
    @Override
    void train() {
        System.out.println("Basketball training.");
    }

    @Override
    void rest() {
        System.out.println("Rest time.");
    }

    @Override
    void play() {
        System.out.println("Basketball match");
    }
}

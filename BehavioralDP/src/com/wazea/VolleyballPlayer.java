package com.wazea;

public class VolleyballPlayer extends PlayerTemplate {
    @Override
    void train() {
        System.out.println("Volleyball training.");
    }

    @Override
    void rest() {
        System.out.println("Rest time.");
    }

    @Override
    void play() {
        System.out.println("Volleyball match");
    }
}

package ru.sokolova.state.model.entity;

public class State {
    private static State INSTANCE;
    private State() {
    }
    public static State getInstance() {
        if (INSTANCE == null) {
            synchronized (State.class) {
                if (INSTANCE == null) {
                    INSTANCE = new State();
                }
            }
        }
        return INSTANCE;
    }
    private Region region;
    private District district;
    private City city;
}

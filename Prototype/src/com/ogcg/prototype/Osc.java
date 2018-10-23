package com.ogcg.prototype;

public class Osc implements Person {
    private final String NAME = "Osc";

    @Override
    public Person clone() {
        return new Osc();
    }

    @Override
    public String toString() {
        return NAME + " es el mejor";
    }
}

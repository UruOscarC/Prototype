package com.ogcg.prototype;

public class Boris implements Person {
	private final String NAME = "Boris";

    @Override
    public Person clone() {
        return new Boris();
    }

    @Override
    public String toString() {
        return NAME + " es pana";
    }
}

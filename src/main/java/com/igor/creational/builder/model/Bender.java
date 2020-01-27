package com.igor.creational.builder.model;

public class Bender {
    private Nation nation;
    private String name;
    private boolean airbending;
    private boolean waterbending;
    private boolean earthbending;
    private boolean firebending;

    public Bender(Nation nation, String name) {
        this.nation = nation;
        this.name = name;
    }

    public void setAirbending(boolean airbending) {
        this.airbending = airbending;
    }

    public void setWaterbending(boolean waterbending) {
        this.waterbending = waterbending;
    }

    public void setEarthbending(boolean earthbending) {
        this.earthbending = earthbending;
    }

    public void setFirebending(boolean firebending) {
        this.firebending = firebending;
    }

    public Nation getNation() {
        return nation;
    }

    public String getName() {
        return name;
    }

    public boolean isAvatar() {
        return airbending && earthbending && waterbending && firebending;
    }

    public boolean isBender() {
        return airbending || earthbending || waterbending || firebending;
    }

    @Override
    public String toString() {
        return "Bender{" +
                "nation='" + nation + '\'' +
                ", name='" + name + '\'' +
                ", airbending=" + airbending +
                ", waterbending=" + waterbending +
                ", earthbending=" + earthbending +
                ", firebending=" + firebending +
                '}';
    }
}

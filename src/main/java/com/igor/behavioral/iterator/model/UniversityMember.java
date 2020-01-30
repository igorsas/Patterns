package com.igor.behavioral.iterator.model;

public class UniversityMember {
    protected String name;
    protected int age;
    protected MemberType type;

    public UniversityMember(String name, int age, MemberType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public MemberType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "UniversityMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}

package com.igor.structural.flyweight.model;

import java.util.Objects;

public class Transformer {
    private String name;
    private TransformerType transformerType;

    public Transformer(String name, TransformerType transformerType) {
        this.name = name;
        this.transformerType = transformerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transformer that = (Transformer) o;
        return Objects.equals(name, that.name) &&
                transformerType == that.transformerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transformerType);
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "name='" + name + '\'' +
                ", transformerType=" + transformerType +
                '}';
    }
}

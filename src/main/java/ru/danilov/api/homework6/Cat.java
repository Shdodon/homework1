package ru.danilov.api.homework6;

import java.util.Objects;

public class Cat {
   private int age;
    private String color;
    private String name;

    private int weight;

    public Cat(int age, String color, String name, int weight) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight=weight;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && weight == cat.weight && Objects.equals(color, cat.color) && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name, weight);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d", age, color, name, weight);
    }
}

package io.github.itlab1024.scala.chapter01;

/**
 * 饮料类
 */
public class Drink {
    private static final String MAJOR = "水";
    /**
     * 水果成分
     */
    private String fruits;

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public void show() {
        System.out.println("MAJOR=" + Drink.MAJOR + ", Fruits=" + this.fruits);
    }
}

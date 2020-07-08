package oop.basics;

import java.util.Random;

public class Cat {

    public String name;
    public int age;

    public void sleep(int hours, int minutes) {
        System.out.println(name + " sleeps " + hours + ":" + minutes);
    }

    public void eat(String what) {
        System.out.println(name + " eats " + what);
    }

    public Mouse catchMouse() {
        Mouse mouse = new Mouse();
        return mouse;
    }

    public int getAge() {
        return age;
    }

    public boolean isOld() {
        if (age < 8) {
            return false;
        } else {
            return true;
        }
    }

    public void performAction() {
        int r = new Random().nextInt(2);
        if (r == 0) {
            sleep(1, 30);
        } else {
            eat("my hand");
        }
    }


}

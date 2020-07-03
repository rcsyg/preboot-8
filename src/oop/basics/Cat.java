package oop.basics;

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


}

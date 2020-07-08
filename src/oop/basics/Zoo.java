package oop.basics;

public class Zoo {

    public static void main(String[] args) {
        //int simple = 5;
        Cat prince = new Cat();
        Cat murish = new Cat();

        System.out.println("name (before): " + prince.name);

        prince.name = "Prince";
        prince.age = 10;
        System.out.println("name (after): " + prince.name);
        System.out.println("age (after): " + prince.age);

        murish.name = "Murinsh";
        murish.age = 7;
        System.out.println("name (second): " + murish.name);
        System.out.println("age (second): " + murish.age);

        prince.sleep(3, 15);
        murish.sleep(1, 45);

        prince.eat("youghurt");

        Mouse caughtMouse = prince.catchMouse();
        System.out.println("caughtMouse = " + caughtMouse);

        int age = prince.getAge();
        boolean isOld = prince.isOld();
        System.out.println("age = " + age);
        System.out.println("isOld = " + isOld);

        Dog reksis = new Dog();
        reksis.nickname = "Reksis";
        reksis.breed = "Shepherd";
        reksis.chaseCar("LV-728");
        Cat caughtCat = reksis.catchCat();
        System.out.println("Caught cat name : " + caughtCat.name);
        System.out.println("Caught cat age : " + caughtCat.age);
        Mouse caughtCatCaughtMouse = caughtCat.catchMouse();
        caughtCat.sleep(8, 0);

        Snake kaa = new Snake("Kaa", 100);
        System.out.println("kaa.name = " + kaa.name);

        prince.performAction();
    }

}

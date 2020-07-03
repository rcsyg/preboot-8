package oop.basics;

public class Dog {

    // nickname, breed
    public String nickname;
    public String breed;

    // chaseCar | String stateNumber (AB - 1234)
    // catchCat

    public void chaseCar(String stateNumber) {
        System.out.println(breed + " " + nickname + " is chasing car " + stateNumber);
    }

    public Cat catchCat() {
        Cat lucky = new Cat();
        lucky.name = "Lucky";
        lucky.age = 3;
        return lucky;
    }
}

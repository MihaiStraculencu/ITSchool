package Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

//        System.out.println(dog.lives);
//        System.out.println(cat.lives);

        dog.bark();
        cat.meow();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesis();
    }
}

package lsp;

public class Vulture extends Bird implements Fly {
    public Vulture(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
package lsp;

public class Penguin extends Bird {
    public Penguin(String name) {
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

}
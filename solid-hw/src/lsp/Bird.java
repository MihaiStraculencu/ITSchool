package lsp;

public abstract class Bird {
    protected String name;

    protected Bird(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void sleep();

    public String getName() {
        return name;
    }

    public boolean canFly() {
        return false;
    }
}
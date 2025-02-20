package lsp;

/**
 * Refactor the code to ensure it adheres to LSP.
 */

public class Main {
    public static void main(String[] args) {
        Bird penguin = new Penguin("Penguin");
        Bird vulture = new Vulture("Vulture");

        //polymorphism
        penguin.eat();
        penguin.sleep();

        vulture.eat();
        vulture.sleep();

        if (vulture.canFly()) {
            ((Fly) vulture).fly();
        }
    }
}
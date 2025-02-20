import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        String currency = "RON";
        double total;

        System.out.print("Item: ");
        item = scanner.nextLine();

        System.out.print("Price: ");
        price = scanner.nextDouble();

        System.out.print("Quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Total: " + total + " " + currency);


        scanner.close();
        }
    }

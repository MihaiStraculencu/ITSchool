import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;


        System.out.print("Your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true or false): ");
        isStudent = scanner.nextBoolean();
        
        //name
        if (name.isEmpty()) {
            System.out.println("You have not entered your name");
        } else {
            System.out.println("Hello " + name);

        }

        //age
        if (age < 18 && age > 0) {
            System.out.println("You are a kid");
        } else if (age < 0) {
            System.out.println("You are not born yet");
        } else if (age > 100) {
            System.out.println("You are too old and maybe dead");
        } else if (age > 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are worthy");
        }


        //isStudent
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }
    }
}

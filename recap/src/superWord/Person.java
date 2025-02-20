package superWord;

public class Person {

    String first;
    String last;

    public Person(String firstName, String lastName) {
        this.first = firstName;
        this.last = lastName;
    }

    void showName() {
        System.out.println(first + " " + last);
    }

}

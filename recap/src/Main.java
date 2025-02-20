public class Main {
    public static void main(String[] args) {
//       Student student1 = new Student( "John", 20, 3.8, true);
//       Student student2 = new Student( "Jane", 21, 3.9, false);
//       Student student3 = new Student( "Jack", 22, 3.7, true);
//
//        System.out.println(student1.name + " | " + student1.age + " | " + student1.gpa + " | " + student1.isEnrolled);
//        System.out.println(student2.name + " | " + student2.age + " | " + student2.gpa + " | " + student2.isEnrolled);
//        System.out.println(student3.name + " | " + student3.age + " | " + student3.gpa + " | " + student3.isEnrolled);
//
//        student1.study();
//        student2.study();
//        student3.study();


        // overload constructor
//        User user1 = new User("Mihai");
//        User user2 = new User("Andrei", "hM8t1@example.com");
//        User user3 = new User("Mihai", "hM8t1@example.com", 20);
//        User user4 = new User();
//
//        System.out.println(user1.name + " | " + user1.email + " | " + user1.age);
//        System.out.println(user2.name + " | " + user2.email + " | " + user2.age);
//        System.out.println(user3.name + " | " + user3.email + " | " + user3.age);
//        System.out.println(user4.name + " | " + user4.email + " | " + user4.age);


        Car car1 = new Car("Tesla", "red");
        Car car2 = new Car("Ford", "yellow");
        Car car3 = new Car("Mercedes", "blue");

        Car[] cars = {car1, car2, car3};

        for (Car value : cars) {
            value.drive();
        }

    }
}

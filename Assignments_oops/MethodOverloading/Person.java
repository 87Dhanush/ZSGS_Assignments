public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Dhanush");
        Person person2 = new Person("surya", 25);
        Person person3 = new Person("appu", 30, "123 r.k Street");

        person1.displayDetails();
        System.out.println();
        person2.displayDetails();
        System.out.println();
        person3.displayDetails();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        if (age != 0) {
            System.out.println("Age: " + age);
        }
        if (address != null) {
            System.out.println("Address: " + address);
        }
    }

}

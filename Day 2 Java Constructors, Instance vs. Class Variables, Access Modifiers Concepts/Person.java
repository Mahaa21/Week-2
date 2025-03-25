public class Person {

    String name;
    int age;
    String gender;

    Person() {
        name = "Alex Park";
        age = 45;
        gender = "Male";
    }

    Person(Person copy) {
        this.name = copy.name;
        this.age = copy.age;
        this.gender = copy.gender;
    }

    void display () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main (String[] args){
        Person p1 = new Person();
        System.out.println("Default Constructor:");
        p1.display();

        Person p2 = new Person(p1);
        System.out.println("Copy Constructor: ");
        p2.display();
    }
}

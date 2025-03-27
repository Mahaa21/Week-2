class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals in the kitchen.");
    }
}
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to the customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101);
        Waiter waiter = new Waiter("John Doe", 102);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}

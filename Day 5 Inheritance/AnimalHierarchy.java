public class AnimalHierarchy {
    static class Animal {
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Dog subclass
    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the Dog says: Woof! Woof!");
        }
    }

    // Cat subclass
    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the Cat says: Meow!");
        }
    }

    // Bird subclass
    static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the Bird says: Tweet!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 4);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Tweety", 2);

        System.out.println("Animal Sounds:");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

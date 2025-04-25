public class Main {
    public static void main(String[] args) {
        Lion dog = new Lion();
        dog.eat();   // Inherited from Animal
        dog.roar();  // Method of Dog class

        Cat cat = new Cat();
        cat.eat();   // Inherited from Animal
        cat.meow();  // Method of Cat class
    }
}

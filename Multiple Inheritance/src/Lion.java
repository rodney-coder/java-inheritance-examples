// A class implementing both interfaces
class Lion implements Animal, Pet {
    public void eat() {
        System.out.println("The Lion eats food.");
    }

    public void play() {
        System.out.println("The lion plays with humans.");
    }
}
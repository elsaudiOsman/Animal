public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("flying", 2, "trees");
        Dog    dog    = new Dog("mummel", 4, "Home Animal");
        Bird   bird   = new Bird("flying",2, "trees",2 );

        System.out.println("This is animal type: " + animal.getType());
        System.out.println("This is dog type: " + dog.getType());
        System.out.println("This is bird type: " + bird.getType());

        animal.makeSound();
        dog.makeSound();
        dog.makeDogSound();
        bird.makeSound();
    }
}

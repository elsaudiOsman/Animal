public class Bird extends Animal {
    private  int numberOfWings;

    public Bird(String type, int numberOfLegs, String lifeEnvironment, int numberOfWings) {
        super(type, numberOfLegs, lifeEnvironment);
        this.numberOfWings = numberOfWings;
    }

    public int getNumberOfWings() {return this.numberOfWings;}

    public void setNumberOfWings(int numberOfWings) {this.numberOfWings = numberOfWings;}

    public void makeBirdSound(){System.out.println("Tweet Tweet");}


    @Override
    public void makeSound(){
        //super.makeSound();    // Animal("Baaaaaaaaaaa");
        System.out.println("Tweet Tweet");
    }

}

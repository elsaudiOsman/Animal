
public class Dog extends Animal{

    public Dog(String type, int numberOfLegs, String lifeEnvironment){
        super(type, numberOfLegs, lifeEnvironment);
    }

    @Override
    public void makeSound(){
        //super.makeSound();     // Animal("Baaaaaaaaaaa");
        System.out.println("Waff Waff");
    }

    public void makeDogSound(){
        System.out.println("DWaff DWaff");
    }
}

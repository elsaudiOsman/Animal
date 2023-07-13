public class Animal {

    private String type;
    private int numberOfLegs;
    private String lifeEnvironment;

    public Animal(String type, int numberOfLegs, String lifeEnvironment) {
        this.type = type;
        this.numberOfLegs = numberOfLegs;
        this.lifeEnvironment = lifeEnvironment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getLifeEnvironment() {
        return lifeEnvironment;
    }

    public void setLifeEnvironment(String lifeEnvironment) {
        this.lifeEnvironment = lifeEnvironment;
    }


    public void makeSound(){
        System.out.println("Baaaaaaaaaaa");
    }
}

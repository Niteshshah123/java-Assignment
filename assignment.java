class Animaljava {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

class Dogjava extends Animaljava {
    private String owner;

    public String getOwner() {

        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void eat() {
        System.out.println("Eating...");
    }


    public void bark() {
        System.out.println("Barking...");
    }
 
}
class Lionjava extends Animaljava {
    private String jungle;

    public String getJungle() {
        return jungle;
    }

    public void setJungle(String jungle) {
        this.jungle = jungle;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void roar() {
        System.out.println("Roaring...");
    }
}

public class assignment {
    public static void main(String[] args) {
        // Creating a Dog
        Dogjava myDog = new Dogjava();
        myDog.setColor("Brown");
        myDog.setOwner("John");

        // Creating a Lion
        Lionjava myLion = new Lionjava();
        myLion.setColor("Golden");
        myLion.setJungle("Savannah");

        // Printing information about the Dog
        System.out.println("Dog Information:");
        System.out.println("Color: " + myDog.getColor());
        System.out.println("Owner: " + myDog.getOwner());
        myDog.eat();
        myDog.bark();

        System.out.println();

        // Printing information about the Lion
        System.out.println("Lion Information:");
        System.out.println("Color: " + myLion.getColor());
        System.out.println("Jungle: " + myLion.getJungle());
        myLion.eat();
        myLion.roar();
    }
}

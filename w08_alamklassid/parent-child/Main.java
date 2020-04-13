
public class Main {

    public static void main(String[] args) {

    Child child = new Child("Gugu", "Going to work");

    System.out.println(
        child.armSlots + " " +
        child.legSlots
    );

    child.speak();

    System.out.println(child.name + " " + child.job);

    child.speak();

        
    }
}

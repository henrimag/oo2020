public class Toy implements Battery {

    private String name;
    
    public Toy(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello there");
    }

    @Override
    public void showBattery() {
        System.out.println("Toy " + name + " has a battery.");

    }

    @Override
    public void noBattery() {
        System.out.println("Toy " + name + " does not have a battery.");

    }

}
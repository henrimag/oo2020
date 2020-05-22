/**
 * Machine
 */
public class Machine implements Battery {

    public String name;
    private int id = 7;

    public void start() {
        System.out.println("Machine started.");
    }

    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }

    @Override
    public void showBattery() {
    }

    @Override
    public void noBattery() {

    }
}
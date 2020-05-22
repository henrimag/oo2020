/**
 * Car
 */

public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("Starting car.");

    }

    @Override
    public void work() {
        System.out.println("Car is working");

    }

    @Override
    public void shutdown() {
        System.out.println("Car has been turned off");

    }
    
}
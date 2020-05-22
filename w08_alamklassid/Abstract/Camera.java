/**
 * Camera
 */

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Starting camera");

    }

    @Override
    public void work() {
        System.out.println("Camera is working");

    }

    @Override
    public void shutdown() {
        System.out.println("Camera is shutting down");

    }

    
}
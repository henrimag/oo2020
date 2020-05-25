import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Warehouse ruum = new Warehouse();

        Fridge fridge_1 = new Fridge(Fridgename.white, Fridgetype.UUS, 300);
        Fridge fridge_2 = new Fridge(Fridgename.smart, Fridgetype.SMART, 450);
        Fridge fridge_3 = new Fridge(Fridgename.oldschool, Fridgetype.VANA, 400);
        
        ruum.addFridges(fridge_1);
        ruum.addFridges(fridge_2);
        ruum.addFridges(fridge_3);
        
        System.out.println("Külmappides on kokku järgi " + ruum.getRoom() + " liitrit ruumi.");

    }
}
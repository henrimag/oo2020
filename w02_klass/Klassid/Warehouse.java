/**
 * Warehouse
 */
import java.util.List;
import java.util.ArrayList;

public class Warehouse {
    public List<Fridge> list = new ArrayList<>();
    int fridgeSpace = 3000; // liitrit
    
    public void addFridges(Fridge fridge){
        list.add(fridge);
        long total = list.stream().distinct().count(); 
    }

    public List<Fridge> getList() {
        return list;
    }
    public int getRoom(){
        int fridgeKokku = 0;
        for (Fridge fridge : list){
            fridgeKokku += fridge.size;   
         }
         fridgeKokku = fridgeSpace-fridgeKokku;
         return fridgeKokku;
    }
    
    
    
    
        
      
    
}
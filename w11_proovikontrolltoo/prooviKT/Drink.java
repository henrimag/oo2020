public class Drink{

    public String name; 
    public double lCost;
    public int weight; 
    public DrinkType drinkType;
    
    public Drink(String name, double lCost, int weight, DrinkType drinkType){

        this.name = name;
        this.lCost = lCost;
        this.weight = weight;
        this.drinkType = drinkType;
    }  
    @Override
    public String toString(){
        return "Jook on " + name +": \n" + "See maksab: " + lCost + " € liiter" + "\n" + "See kaalub "
         + weight + " g/l" + "\n" + "See jook on: " + drinkType + ".";
    }
}
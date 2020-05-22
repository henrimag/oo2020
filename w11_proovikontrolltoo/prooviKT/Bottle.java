public class Bottle {

    BottleType bottleType;
    double bottleCost;
    double bottleMass;
    static double maxVolume;
    static double currentVolume;
    Drink Drink;

    public Bottle(BottleType bottleType, double bottleCost, double bottleMass, double maxVolume, double currentVolume, Drink Drink){
        this.bottleType = bottleType;
        this.bottleCost = bottleCost;
        this.bottleMass = bottleMass;
        Bottle.maxVolume = maxVolume;
        Bottle.currentVolume = currentVolume;
        this.Drink = Drink;
    }

    @Override
    public String toString(){
        return "See on " + bottleType + " anum" + ":\n" +  "See maksab: " + bottleCost + " € \n" + "Pudel kaalub "
         + bottleMass + " g\n" + "Pudeli maht on: " + maxVolume + " liitrit\n" + "Hetkel on selles " + currentVolume +  " liitrit " + Drink.name + "t.";
    }

}
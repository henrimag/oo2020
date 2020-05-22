public class Barrel {

    public Drink drink; 
    public static double maxVolume;
    public static double currentVolume;

    public Barrel(Drink beverage, double maxVolume, double currentVolume) {

        this.drink = drink;
        Barrel.maxVolume = maxVolume;
        Barrel.currentVolume = currentVolume;
    }
    
    public void fillUp(){
        if (Barrel.currentVolume >= (Bottle.maxVolume - Bottle.currentVolume)){
            Barrel.maxVolume = Barrel.maxVolume - (Bottle.maxVolume - Bottle.currentVolume);
            Bottle.currentVolume = Bottle.maxVolume;
        } else{
            System.out.println("Vaadis ei ole piisavalt jooki..");
        }

        
    }
}
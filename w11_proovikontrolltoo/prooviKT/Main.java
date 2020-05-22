enum DrinkType {
    limonaad, õlu, viski, viin
}

enum BottleType {
    PLASTIK, KLAAS, METALL
}

public class Main {

    public static void main(String[] args) {
        
        Drink Drink_1 = new Drink("Fanta", 50, 5, DrinkType.limonaad);
        Drink Drink_2 = new Drink("Coca-cola", 50, 5, DrinkType.limonaad);
        Drink Drink_3 = new Drink("Heineken", 90, 5, DrinkType.õlu);
        Drink Drink_4 = new Drink("Saku", 70, 5, DrinkType.õlu);
        Drink Drink_5 = new Drink("Jack Daniels", 70, 5, DrinkType.viski);
        
        Bottle klaasBottle = new Bottle(BottleType.KLAAS, 0.2, 100, 0.5, 0.6, Drink_1);
        Barrel woodenBarrel1 = new Barrel(Drink_1, 100, 50);
        Bottle plastikBottle = new Bottle(BottleType.PLASTIK, 0.15, 100, 0.8, 0.6, Drink_2);
        Barrel woodenBarrel2 = new Barrel(Drink_2, 70, 60);
        woodenBarrel1.fillUp();
        woodenBarrel2.fillUp();

        System.out.println(Drink_1);
        System.out.println("");
        System.out.println(klaasBottle);
        System.out.println("");
        System.out.println(Drink_2);
        System.out.println("");
        System.out.println(plastikBottle);
        System.out.println("");
    }
}
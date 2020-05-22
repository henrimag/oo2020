public class Main {
    public static void main(String[] args) {
        
        Machine mach1 = new Machine();
        mach1.start();

        Toy toy1 = new Toy("Spider-man");
        Toy toy2 = new Toy("Firetruck");
        Toy toy3 = new Toy("Optimus Prime");
        Toy toy4 = new Toy("Sipsik");

        Machine mach2 = new Machine();
        mach2.showBattery();
       
        //Battery info1 = new Machine();
        /*toy1.showBattery(); */

        Battery toy5 = toy4;
        toy2.showBattery();

        System.out.println();

        outputBattery(mach1);
        outputBattery(toy2);
        outputBattery(toy3);
        noBattery(toy1);
        noBattery(toy5);
    }

    private static void outputBattery(Battery toy) {
        toy.showBattery();
    }

    private static void noBattery(Battery toy) {
        toy.noBattery();
    }
}
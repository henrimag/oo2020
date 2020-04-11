import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algarvud {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.println("Kontrollime kas sisestatud arv on algarv ja kas jagub 2, 3, 5 või 7-ga.");
System.out.print("Sisesta arv: ");
Scanner input = new Scanner(System.in);
int num;
num = input.nextInt();

kasJagub(num);
lisaNumbrid();
algarvRuut();
algarvL6pp();

if (onAlg(num)) {
    System.out.println(num + " on algarv.");
} else {
    System.out.println(num + " ei ole algarv.");
    }
}
public static boolean onAlg(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i < Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
public static void kasJagub(int num) {
        if (num % 2 == 0) {
            System.out.println("Sisestatud arv jagub kahega.");
        if (num % 3 == 0)
            System.out.println("Sisestatud arv jagub kolmega.");
        if (num % 5 == 0)
            System.out.println("Sisestatud arv jagub viiega.");
        if (num % 7 == 0)
            System.out.println("Sisestatud arv jagub seitsmega.");
        } else {
            System.out.println("Sisestatud arv ei jagu 2, 3, 5 või 7-ga.");
    }
}
public static List<Integer> numberlist = new ArrayList<>();
public static List<Integer> lisaNumbrid() {
    int num = 0;
    for (int i = 1; numberlist.size() != 1000; i++) {
        int counter = 0;
        for (num = i; num >= 1; num--) {
            if (i % num == 0) {
                counter = counter + 1;
            }
        }
        if (counter == 2) {
            numberlist.add(i);
        }
    }
    return numberlist;
}
public static List<Integer> alguslist = new ArrayList<>();
public static List<Integer> algarvRuut() {
    for (int i = 0; i < 10; i++) {
        int value = numberlist.get(i);
        alguslist.add(value);
    }
    System.out.println("10 algarvu, mille ruudud on väiksemad, kui tuhandeda algarvu ruut: " + alguslist);
    return alguslist;
}
public static List<Integer> l6pplist = new ArrayList<>();
public static List<Integer> algarvL6pp() {
        int length = numberlist.size();
        int algus = length -10;
        for(int i = algus; i < length; i++){
            int value= numberlist.get(i);
            l6pplist.add(value);
        }
        System.out.println("Kümme suurimat algarvu: " + l6pplist);
        return l6pplist;
    }
}
    

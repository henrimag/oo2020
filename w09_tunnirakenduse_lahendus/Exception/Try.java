import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {

    public static void main(String[] args) {

        System.out.println("Sisesta vanus: ");

        try {

            Scanner sc = new Scanner(System.in);
            short age = sc.nextShort();

            if (age <= 0 || age > 100) {

            throw new IllegalArgumentException("Vanus on ebakorrektselt sisestatud");
            }

            System.out.format("Sinu vanus on: %d %n", age);

        } catch (IllegalArgumentException | InputMismatchException e) {

            /* Logger.getLogger(Try.class.getName()).log(Level.SEVERE,
                    e.getMessage(), e); */
        }
    }
}
import java.util.Scanner;
class Ring
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Sisesta raadius: ");
      double radius = sc.nextDouble();
      double area = Math.PI * (radius * radius);
      System.out.println("Ringi pindala on: " + area);
      
      double circumference= Math.PI * 2*radius;
      System.out.println( "Ringi ymberm66t on: "+circumference) ;
   }
}
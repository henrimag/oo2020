public class Try2 {

        static int anyFunction (int x, int y ){
            try {
                int a = x/y;
                return a;
            } 
            catch (ArithmeticException e) {
                System.out.println ( "Nulliga ei ole võimalik jagada" );
            }
            return 0;
        }
    
        public static void main (String args[]) {
            int a,b, result;
                a = 10;
                b = 0;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.print("a ja b väärtused =  "+a+"  "+b);

        }catch(Exception e){}
            result  = anyFunction (a, b); 
            System.out.println ( "\nTulemus : " + result);
        }
    }
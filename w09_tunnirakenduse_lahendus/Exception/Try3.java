class Demonstration_108   {

    public static int j; 
    public static void main (String args[ ] ) {
	for (int i = 0; i < 4; i++ ) {
         try {
			switch (i) {
				case 0 : 
					int zero = 0; 
					j = 10 / zero; // Jaga nulliga
					break;
				case 1: 
					int b [ ] = null; 
					j = b [0] ; // Null pointer error   
					break;
				case 2: 
					int c[] = new int [2] ;
					j = c[3]; // Array index out-of-bound 
					break; 
				case 3: 
					char ch = "Javastuff".charAt(9) ;// String index is out-of-bound 
					break;
			} 
        } catch (Exception e) {   
             System.out.println("Test juhtum#"+i+ "\n");
			 
             System.out.println (e.getMessage() );           
	  }
    }		 
  }
}  
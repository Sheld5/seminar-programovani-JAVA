public class TrojuhelnikMetody {
   public static void opakujZnak(char znak, int pocet) {
      while (pocet > 0) {
       System.out.printf("%c", znak);
       pocet--;
      }
   } 
   public static void main(String[] args) {
      int vyska = Integer.parseInt(args[0]); 
      for (int radek = 1; radek <= vyska; radek++) {
    	opakujZnak(' ', vyska - radek);
    	opakujZnak('X', radek);
    	System.out.println();
	  }
   }
}
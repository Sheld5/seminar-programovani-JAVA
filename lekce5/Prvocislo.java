public class Prvocislo {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      int o = 0;
      for (int i = 2; i != x; i++) {
      	if (x % i == 0) {
      		System.out.print(x + " neni prvocislo");
      		o++;
      		break;
      	}
      }
      if (o == 0) {
      	System.out.print(x + " je prvocislo");
      }
   }
}
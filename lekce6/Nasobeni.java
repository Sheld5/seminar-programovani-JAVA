public class Nasobeni {
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);
      int z = x * y;
      int x2 = x;
      int delkax = 1;
      while (x2 > 10) {
      	x2 /= 10;
      	delkax++;
      }
      int y2 = y;
      int delkay = 1;
      while (y2 > 10) {
      	y2 /= 10;
      	delkay++;
      }
      int z2 = z;
      int delkaz = 1;
      while (z2 > 10) {
      	z2 /= 10;
      	delkaz++;
      }
      for (int ia = 0; ia != delkaz - delkax; ia++) {
      	System.out.printf(" ");
      }
      System.out.printf("%d\n", x);
      for (int ib = 1; ib != delkaz - delkay; ib++) {
      	System.out.printf(" ");
      }
      System.out.printf("*");
      System.out.printf("%d\n", y);
      for (int ic = 0; ic != delkaz; ic++) {
      	System.out.printf("-");
      }
      System.out.printf("\n");
      int i = 0;
      while (y > 0) {
      	int q = (y % 10) * x;
      	int q2 = q;
        int delkaq = 1;
        while (q2 > 10) {
      	  q2 /= 10;
      	  delkaq++;
        }
      	for (int id = 0; id < delkaz - delkaq - i; id++) {
      	System.out.printf(" ");
        }
      	System.out.printf("%d\n", q);
      	y /= 10;
      	i++;
      }
      for (int ie = 0; ie != delkaz; ie++) {
      	System.out.printf("-");
      }
      System.out.printf("\n");
      System.out.printf("%d", z);
   }
}
import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

public class HtmlPrinter implements QuadraticEquationPrinter {
<<<<<<< HEAD
	public void printEquation(int a, int b, int c, int x1, int x2) {
		if (a < 0) {
			System.out.printf("\t\t- %dx² ", -a);
		} else {
			System.out.printf("\t\t  %dx² ", a);
=======
	public void begin() {
		System.out.printf("<html>\n\t<head></head>\n\t<body>\n\t\t");
	}
	public void end() {
		System.out.printf("\n\t</body>\n</html>\n");
	}
	public void printEquation(int a, int b, int c, int x1, int x2) {
		if (a < 0) {
			System.out.printf("- %dx² ", -a);
		} else {
			System.out.printf("  %dx² ", a);
>>>>>>> 3505904efa345c0f59d27228170d8947ea341a8f
		}
		if (b < 0) {
			System.out.printf("- %dx ", -b);
		} else {
			System.out.printf("+ %dx ", b);
		}
		if (c < 0) {
<<<<<<< HEAD
			System.out.printf("- %d = \n", -c);
		} else {
			System.out.printf("+ %d = \n", c);
		}
=======
			System.out.printf("- %d = ", -c);
		} else {
			System.out.printf("+ %d = ", c);
		}
		System.out.printf("\n");
>>>>>>> 3505904efa345c0f59d27228170d8947ea341a8f
	}
}
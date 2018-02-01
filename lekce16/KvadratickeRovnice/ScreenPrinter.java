import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

public class ScreenPrinter implements QuadraticEquationPrinter {
	public void printEquation(int a, int b, int c, int x1, int x2) {
		if (a < 0) {
			System.out.printf("- %dx² ", -a);
		} else {
			System.out.printf("  %dx² ", a);
		}
		if (b < 0) {
			System.out.printf("- %dx ", -b);
		} else {
			System.out.printf("+ %dx ", b);
		}
		if (c < 0) {
			System.out.printf("- %d = \n", -c);
		} else {
			System.out.printf("+ %d = \n", c);
		}
	}
}
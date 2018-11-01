import java.util.*;
public class Main {
	public static void main(String[] args) {
		PrimeNumberCalculator calcurator = new PrimeNumberCalculator();
	  printNumbers(calcurator.calcTo(100));
	}
	private static void printNumbers(List<Integer> numbers) {
		for (int number: numbers) {
        System.out.println(number);
		}
	}
}


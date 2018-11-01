import java.util.*;

public class Main {
  public static void main(String[] args) {
		printNumbers(PrimeNumberCalculator2.calcTo(100));
		System.out.println("loop");
		System.out.println(PrimeNumberCalculator2.c);
  }


	private static void printNumbers(List<Integer> numbers) {
    for (int  number: numbers) {
			System.out.println(number);
		}	
  }
}


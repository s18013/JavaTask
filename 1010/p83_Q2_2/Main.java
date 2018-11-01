//package jp.co.example.java15;

import java.util.*;

public class Main {
  public static void main(String[] args) {
		printNumbers(PrimeNumberCalculator.calcTo(100));
		System.out.println("loop");
		System.out.println(PrimeNumberCalculator.c);
  }


	private static void printNumbers(List<Integer> numbers) {
    for (int  number: numbers) {
			System.out.println(number);
		}	
  }
}


public class En2_1 {
 public static void main(String[] args) {
	 int a = 1;
	 for(int i = 1; i <= 100; i++){
		 if(a % 15 == 0) { 
			 System.out.println("FizzBuzz");
		 } else if (a % 3 == 0) {
			 System.out.println("Fizz");
     } else if (a % 5 == 0) {
			 System.out.println("Buzz");
		 } else {
			 System.out.println(a);
		 }
		 a++;
	 }
 }
}


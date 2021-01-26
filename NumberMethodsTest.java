package practice;

public class NumberMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 20; i++){
			System.out.println(i + " " + NumberMethods.isPrime(i));
		}
		for(int i = 0; i < 20; i++){
			System.out.println(i + " " + NumberMethods.divisorSum(i));
		}
		for(int i = 0; i < 20; i++){
			System.out.println(i + " " + NumberMethods.isStrong(i));
		}
		for(int i = 0; i < 20; i++){
			System.out.print(i + " ");
			NumberMethods.printDivisors(i);
			
		}
		NumberMethods.printPrimes(30);
		NumberMethods.printComposites(30);
		NumberMethods.printStrong(30);
		NumberMethods.printWeak(30);
		
	}
}
package exercicios;
import java.util.Scanner;


public class soma {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int number1; 
		int number2;
		int sum;
		
		System.out.print("Digite o primeiro número:  ");
		number1 = input.nextInt();
		
		System.out.print(" Digite o segundo número: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.print("O resultado é %s/n" +sum);
	

	}

}

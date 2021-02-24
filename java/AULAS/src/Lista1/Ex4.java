package Lista1;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		//calcule a seguinte expressão:
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		double r, s, d;
		
		System.out.println("Escreva o primeiro número:");
		a = ler.nextInt();
		System.out.println("Escreva o segundo número:");
		b = ler.nextInt();
		System.out.println("Escreva o terceiro número:");
		c = ler.nextInt();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		d = (r + s) / 2;
		
		System.out.println("O valor de R = "+ r +", o valor de S = "+ s);
		System.out.println("E o valor de D = "+ d );
	}

}

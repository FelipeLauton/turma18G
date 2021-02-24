package Lista1;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.
		
		Scanner ler = new Scanner(System.in);
		int dias, anos, meses;
		
		System.out.println("Escreva a sua idade expressa em dias:");
		dias = ler.nextInt();
		
		meses = dias / 30;
		anos = dias /365;
		
		System.out.println("Sua idade expressa em anos: "+ anos);
		System.out.println("Sua idade expressa em meses: "+ meses);
		System.out.println("E sua idade expressa em dias: "+ dias);
		
	}

}

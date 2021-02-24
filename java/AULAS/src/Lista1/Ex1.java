package Lista1;
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, total; 
		
		System.out.println("Digite a idade da pessoa expressa em anos:");
		anos = ler.nextInt();
		System.out.println("Digite a idade da pessoa expressa em meses:");
		meses = ler.nextInt();
		System.out.println("Digite a idade da pessoa expressa em dias:");
		dias = ler.nextInt();
		
		
		total = anos * 365;
		
		System.out.println("Sua idade expressa em dias é aproximadamente: "+ total);
		
		
		
	}

}

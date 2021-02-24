package Lista1;
import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		Scanner ler = new Scanner(System.in);
		int segundos, horas, minutos, tempoDuracao;	
		
		System.out.println("Escreva o tempo de duração do evento em segundos:");
		tempoDuracao = ler.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600) / 60;
	    segundos = (tempoDuracao % 3600) % 60;
	    
	    System.out.println("Hora[s]:"+ horas);
	    System.out.println("Minuto[s]:"+ minutos);
	    System.out.println("Segundos[s]:"+ segundos);
	}

}

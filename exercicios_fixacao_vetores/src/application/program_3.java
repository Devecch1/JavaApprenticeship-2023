package application;

import java.util.Locale;
import java.util.Scanner;

import entities.vector_3;

public class program_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		
		int N = sc.nextInt();
		
		vector_3 vect[] = new vector_3[N];
		 
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da primeira pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new vector_3(nome,idade,altura);
		}
		
		double sum = 0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getAltura();
		}
		
		double avg = 0;
		avg = sum / vect.length;
		
		System.out.printf("Altura média: %.2f%n", avg);
		
		sum = 0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getIdade();
		}
		
		
		double percentage = N / 100;
		if(vect[i].getIdade() <= 16) {
			sum += (vect[i].getIdade());
			sum += 
		}
		
		System.out.println("Pessoas com menos de 16 anos: %.2f%n");
		
		
		
		sc.close();
	}

}

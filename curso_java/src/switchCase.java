import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String dia;

		x = sc.nextInt();

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Quinta";
			break;
		case 7:
			dia = "Sexta";
			break;
		case 8:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("O dia da semana é " + dia);

		sc.close();
	}

}

import java.util.Scanner;

public class estruturaRepetitivaWhile_exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

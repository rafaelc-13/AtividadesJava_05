package Java_POO;
import java.util.Scanner;

public class UsoSomarMetodos {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor_01 = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		int valor_02 = entrada.nextInt();
		
		SomarMetodos valor01 = new SomarMetodos();
		int soma_primeiros = valor01.somar(valor_01,valor_02,13);
	}

}

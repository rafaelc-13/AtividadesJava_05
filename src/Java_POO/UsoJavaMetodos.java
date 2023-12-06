package Java_POO;

public class UsoJavaMetodos {
	public static void main(String[] args) {
	JavaMetodos pessoa = new JavaMetodos();
	String nome = pessoa.nome();
	int idade = pessoa.idade();
	Double pagamento = pessoa.valor();
	System.out.printf("A pessoa %s, tem %d anos \n",nome,idade);
	System.out.printf("%s recebe %f por hora no seu novo emprego",nome,pagamento);
	
	}
}

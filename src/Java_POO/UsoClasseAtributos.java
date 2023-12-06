package Java_POO;

public class UsoClasseAtributos {
	public static void main(String[] args) {
		AtributosClasse cliente01 = new AtributosClasse();
		System.out.println(cliente01.nome_ele);
		System.out.println(cliente01.nome_ela);
		System.out.printf("O aluno %s, e a aluna %s, tem %d anos",cliente01.nome_ele,cliente01.nome_ela,cliente01.idade);
	}

}

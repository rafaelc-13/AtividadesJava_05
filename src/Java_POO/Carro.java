package Java_POO;

public class Carro {
	private String cor;
	private double preco;
	private String modelo;
	
	/*construtor padrão*/
	public Carro() {
	}
	/*construtor com 2 parametros*/
	public Carro(String modelo, double preco) {
		//Se for escolhido o construtor sem a COR do veículo
		//Definimos a cor padrão como PRETA
	this.cor = "PRETA";
	this.modelo = modelo;
	this.preco = preco;
	}
	/*construtor com 3 parametros*/
	public Carro(String cor ,String modelo ,double preco) {
	this.cor = cor;
	this.modelo = modelo;
	this.preco = preco;
	}
	
	

	
	
	
	}
	
}

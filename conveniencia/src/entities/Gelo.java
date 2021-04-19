package entities;

public class Gelo extends Produto {
	
	// Atributo
	private double peso;
	
	// Construtores
	public Gelo(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
	}
	
	public Gelo(String descricao, String codigo, double valorUnitario, int quantEstoque, double peso) {
		super(descricao, codigo, valorUnitario);
		this.peso = peso;
	}

	// Encapsulamento - getters & setters
	public double getPeso() {
		return peso;
	}
	/*
	public void setPeso(double peso) {
		this.peso = peso;
	}
	*/
}
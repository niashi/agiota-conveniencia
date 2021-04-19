package entities;

public class Bebida extends Produto {
	
	// Atributo
	private String fabricante;
	
	// Construtor
	public Bebida(String descricao, String codigo, double valorUnitario, int quantEstoque, String fabricante) {
		super(descricao, codigo, valorUnitario, quantEstoque);
		this.fabricante = fabricante;	
	}
	
	// Encapsulamento - getters & setters
	public String getFabricante() {
		return fabricante;
	}
	/*
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	*/
}

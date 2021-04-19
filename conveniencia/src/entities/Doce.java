package entities;

public class Doce extends Produto {
	
	// Atributo
	private String fabricante;
	
	// Construtor
	public Doce(String descricao, String codigo, double valorUnitario, int quantEstoque, String fabricante) {
		super(descricao, codigo, valorUnitario);
		this.fabricante = fabricante;
		
	}

	// Encapsulamento - Getters & setters
	public String getFabricante() {
		return fabricante;
	}
	/*
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	*/
}
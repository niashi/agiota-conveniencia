package entities;

public class Salgadinho extends Produto {
	
	// Atributo
	private String sabor;
	
	// Construtores
	public Salgadinho(String descricao, String codigo) {
		super(descricao, codigo);
		
	}
	
	public Salgadinho(String descricao, String codigo, double valorUnitario, int quantEstoque, String sabor) {
		super(descricao, codigo, valorUnitario);
		this.sabor = sabor;
	}

	// Encapsulamento - getters & setters
	public String getSabor() {
		return sabor;
	}
	/*
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	*/
}

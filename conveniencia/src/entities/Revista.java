package entities;

public class Revista extends Produto {
	
	// Atributo
	private String editora;
	
	// Construtores
	public Revista(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
		
	}
	
	public Revista(String descricao, String codigo, double valorUnitario, int quantEstoque, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}

	// Encapsulamento - Getters and setters
	public String getEditora() {
		return editora;
	}
	/*
	public void setEditora(String editora) {
		this.editora = editora;
	}
	*/
}
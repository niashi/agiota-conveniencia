package entities;

public abstract class Produto {
	
	// Atributos
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int quantEstoque = 10;
	
	// Construtores
	public Produto(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo; 
		this.valorUnitario = valorUnitario;
	}
	
	public Produto(String descricao, String codigo, double valorUnitario, int quantEstoque) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.quantEstoque = quantEstoque;
	}
	
	public Produto(String descricao, String codigo) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
	}

	// Encapsulamento - getters & setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	/*
	 public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	*/

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	/*
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	
	*/
	
	// Métodos
	public void incluirEstoque(int valorInserido) {
		this.quantEstoque += valorInserido;
		
	}
	
	public void retirarEstoque(int valorInserido) {
		
		if (quantEstoque >= valorInserido) {
			this.quantEstoque -= valorInserido;
		}
		else if (quantEstoque < valorInserido) {
			System.out.println("Infelizmente o estoque deste produto acabou...");
		}
	}
}
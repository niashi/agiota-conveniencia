package entities;

import java.util.List;

public class Loja extends Produto {
	
	// Atributos
	private String cnpj = "63.403.623/0001-25";
	private String nomeEmpresa = " » Agiota Conveniência « ";
	private double total = 0;
	private double juros10 = 0;
	private double juros20 = 0;
	private double desconto = 0;
	double resultado = 0;
	double parcela = 0;
	int opcaoVezes;
	boolean aVista = false;
	
	// Construtor
	public Loja(String descricao, String codigo) {
		super(descricao, codigo);
	}


	// Encapsulamento - getters & setters
	public String getCnpj() {
		return cnpj;
	}
	
	/*
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	*/
	public String getNome() {
		return nomeEmpresa;
	}	
	/*
	public void setNome(String nome) {
		this.nome = nome;
	}
	*/
	
	// Métodos	
	public void emissaoNota(double total, List<Produto> lista) {

		System.out.println("                             ╔\n                             ║               " + nomeEmpresa + "\n                             ║");
		System.out.println("                             ║                 " + "CNPJ: " + cnpj);
		System.out.println("                             ║                 NFe: 15615616565" + "\n                             ║");
		
		for (Produto x: lista) {
			if (x.getQuantEstoque() != 10) {
				System.out.printf("                             ║     %d × %s = %.2f [Valor unitário: %.2f]\n" , (10 - x.getQuantEstoque()) , x.getDescricao() , ((10 - x.getQuantEstoque()) * x.getValorUnitario()) , x.getValorUnitario());
			}
		}
		
		System.out.printf("                             ║\n                             ║              Valor dos produtos: R$%.2f.\n", total);
		System.out.printf("                             ║              Valor dos tributos: R$%.2f." , (this.total * 0.09));
		if (aVista == true) {
			System.out.printf("\n                             ║              Valor do desconto à vista: R$%.2f" , (this.total * 0.1));
			System.out.printf("\n                             ║              Valor total: R$%.2f." , resultado);
		}
		System.out.println("");
		if (opcaoVezes == 1) {
			System.out.printf("                             ║              Juros totais: R$%.2f.\n", this.juros10);	
			System.out.printf("                             ║              Valor total: R$%.2f.\n" , resultado);
		} else if (opcaoVezes == 2) {
			System.out.printf("                             ║              Juros totais: R$%.2f.\n", this.juros20);
			System.out.printf("                             ║              Valor por parcela: R$%.2f.\n" , parcela);
			System.out.printf("                             ║              Valor total: R$%.2f.\n" , resultado);
		} 
		
		System.out.println("                             ║\n                             ║          Servimos bem para servir sempre!\n                             ╚");	
	}
	
	public void pagamento (int opcaoPagamento, int vezes, double total) {
		this.total = total;
		if (opcaoPagamento == 1) {
			System.out.print("\n» Você selecionou crédito.");
			if (vezes == 1) {
				opcaoVezes = 1;
				resultado = total + (total * 0.1);
				this.juros10 = total * 0.1;
				System.out.print(" O total é R$" + resultado + ".");
			} else if (vezes == 2) {
				opcaoVezes = 2;
				resultado = total + (total * 0.2);
				parcela = resultado / 2; 
				this.juros20 = total * 0.2;
				System.out.print(" O total é R$" + resultado + ".");
			}
		} else if (opcaoPagamento == 2) {
			System.out.print("\n» Você selecionou débito.");
			System.out.print(" O total é R$" + total + ".");
		} else if (opcaoPagamento == 3) {
			aVista = true;
			System.out.print("\n» Você selecionou pagamento em dinheiro.");			
			resultado = total - (total * 0.1);
			this.desconto = total * 0.1;
			System.out.printf(" O total é R$ %.2f." , resultado);
		}
	}
}
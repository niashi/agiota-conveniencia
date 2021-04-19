package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Bebida;
import entities.Doce;
import entities.Gelo;
import entities.Loja;
import entities.Produto;
import entities.Revista;
import entities.Salgadinho;

public abstract class cadVendas  { 
	
	public static void main(String[] args) throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		double total = 0;
		double totalSalgadinho = 0;
		double totalBebida = 0;
		double totalDoces = 0;
		double totalGelo = 0;
		double totalRevista = 0;
		int vezes = 0;
		
		List<Produto> lista = new ArrayList<>();
		
		Revista marvel = new Revista("Revista Marvel", "6985", 50, 10, "Panini");
		lista.add(marvel);
		Salgadinho queijo = new Salgadinho("Salgadinho de queijo", "5652", 13, 10, "Pringles");
		lista.add(queijo);
		Doce doce = new Doce("Chocolate", "1582", 7, 10, "Nestlé");
		lista.add(doce);
		Gelo gelo = new Gelo("Gelo", "6523", 12, 10, 12);
		lista.add(gelo);
		Bebida coca = new Bebida("Coca-Cola", "7852", 8, 10, "Coca-cola");
		lista.add(coca);
		
		System.out.println("          ╔                             ╗");
		System.out.print("          ║   Agiota Conveniência G7®️   ║\n");
		System.out.print("	  ╚                             ╝\n");
		System.out.print("──────────────────────────────────────────────────");
		System.out.println("\n       Venha nos conhecer! E traga dinheiro...");
		Thread.sleep(100);
		System.out.print("                    ( ಠ ʖ̯ ಠ )\n");
		System.out.println();
		System.out.println();
			
		Thread.sleep(20);
		
		System.out.print("               Carregando sistema");

		String reticencias = "";
		
		for (int x = 0; x < 3; x++) {			
			for (int y = 0; y < 1; y++) {
				reticencias = ".";
				System.out.print(reticencias);
				reticencias += ".";
				Thread.sleep(2000);			
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("               [Sistema carregado]");
		Thread.sleep(2000);
		
		
		
		limpaTela();
		
		int tipoProduto;
		boolean compraEfetuada = false;
		
		do {
			System.out.print("╔                   ╗\n║ • 1 - Bebidas     ║\n║ • 2 - Salgadinhos ║\n║ • 3 - Doces       ║\n║ • 4 - Gelo        ║\n║ • 5 - Revistas    ║\n║                   ║\n║ • 6 - Sair"
					+ "        ║\n╚                   ╝");
			System.out.print("\n» Selecione uma opção: ");
			tipoProduto = leia.nextInt();
			System.out.println();
			
			if (tipoProduto < 1 || tipoProduto > 6) {
				System.out.println("\n» Por favor, insira uma opção válida.\n");
				
			} else if (tipoProduto == 1) { // Início Bebida
				
				while(coca.getQuantEstoque() == 10) {
					System.out.printf("╔                          ╗\n║ Estoque: %d Coca-Colas.  ║\n" , coca.getQuantEstoque());
					System.out.printf("║ Preço unitário: R$%.2f.  ║\n╚                          ╝" , coca.getValorUnitario());
					System.out.print("\nQuantas você deseja comprar? ");
					int quantidadeBebida = leia.nextInt();
					
					if (quantidadeBebida < 1) {
						System.out.println("\n» Por favor, insira um valor de 1 a 10.\n");
					} else {
						compraEfetuada = true;
						
						for (int x = 0; x < lista.size(); x++) {
							if (lista.get(x).getDescricao().contains("Coca-Cola") == true) {
								if (quantidadeBebida <= lista.get(x).getQuantEstoque()) {
									lista.get(x).retirarEstoque(quantidadeBebida);
									
									totalBebida = quantidadeBebida;
									totalBebida *= coca.getValorUnitario();
									System.out.print("\n» Você terminou sua compra. Por favor, escolha outro produto para comprar ou realize o pagamento.\n\n");
								}
								else {
									System.out.println("\n» Não temos essa quantidade no estoque...");
								}
							}
						}						
					}
				}				
			} else if (tipoProduto == 2) { // Início Salgadinho
				
				while(queijo.getQuantEstoque() == 10) {
					System.out.printf("╔                                             ╗\n║ Estoque: %d salgadinhos de queijo Pringles. ║\n" , queijo.getQuantEstoque());
					System.out.printf("║ Preço unitário: R$%.2f.                    ║\n╚                                             ╝" , queijo.getValorUnitario());
					System.out.print("\nQuantos você deseja comprar? ");
					int quantidadeSalgadinho = leia.nextInt();
					
					if (quantidadeSalgadinho < 1) {
						System.out.println("\n» Por favor, insira um valor de 1 a 10.\n");
					} else {
						compraEfetuada = true;
						
						for (int x = 0; x < lista.size(); x++) {
							if (lista.get(x).getDescricao().contains("Salgadinho de queijo") == true) {
								if (quantidadeSalgadinho <= lista.get(x).getQuantEstoque()) {
									lista.get(x).retirarEstoque(quantidadeSalgadinho);
									
									totalSalgadinho = quantidadeSalgadinho;
									totalSalgadinho *= queijo.getValorUnitario();
									System.out.print("\n» Você terminou sua compra. Por favor, escolha outro produto para comprar ou realize o pagamento.\n\n");
								} else {
									System.out.println("\n» Não temos essa quantidade no estoque...");
								}
							}
						}					
					}
				}				
			} else if (tipoProduto == 3) { // Início Doce
				
				while (doce.getQuantEstoque() == 10) {				
					System.out.printf("╔                                ╗\n║ Estoque: %d chocolates Nestlé. ║\n", doce.getQuantEstoque());
					System.out.printf("║ Preço unitário: R$%.2f.        ║\n╚                                ╝" , doce.getValorUnitario());
					System.out.print("\nQuantos você deseja comprar? ");
					int quantidadeDoces = leia.nextInt();
					
					if (quantidadeDoces < 1) {
						System.out.println("\n» Por favor, insira um valor de 1 a 10.\n");
					} else {
						compraEfetuada = true;
						
						for (int x = 0; x < lista.size(); x++) {
							if (lista.get(x).getDescricao().contains("Chocolate") == true) {
								if (quantidadeDoces <= lista.get(x).getQuantEstoque()) {
									lista.get(x).retirarEstoque(quantidadeDoces);
									
									totalDoces = quantidadeDoces;
									totalDoces *= doce.getValorUnitario();
									System.out.print("\n» Você terminou sua compra. Por favor, escolha outro produto para comprar ou realize o pagamento.\n\n");
								}
								else {
									System.out.println("\n» Não temos essa quantidade no estoque...");
								}
							}
						}					
					}
				}				
			} else if (tipoProduto == 4) { // Início Gelo
				
				while (gelo.getQuantEstoque() == 10) {					
					System.out.printf("╔                                          ╗\n║ Estoque: %d pacotes de gelo de %.2f kg. ║\n", gelo.getQuantEstoque() , gelo.getPeso());
					System.out.printf("║ Preço unitário: R$%.2f.                 ║\n╚                                          ╝" , gelo.getValorUnitario());
					System.out.print("\nQuantos pacotoes você deseja comprar? ");
					int quantidadeGelo = leia.nextInt();
					
					if (quantidadeGelo < 1) {
						System.out.println("\n» Por favor, insira um valor de 1 a 10.\n");
					} else {
						compraEfetuada = true;
						
						for (int x = 0; x < lista.size(); x++) {
							if (lista.get(x).getDescricao().contains("Gelo") == true) {
								if (quantidadeGelo <= lista.get(x).getQuantEstoque()) {
									lista.get(x).retirarEstoque(quantidadeGelo);
									
									totalGelo = quantidadeGelo;
									totalGelo *= gelo.getValorUnitario();
									
									System.out.print("\n» Você terminou sua compra. Por favor, escolha outro produto para comprar ou realize o pagamento.\n\n");
								} else {
									System.out.println("\n» Não temos essa quantidade no estoque...");
								}
							}
						}					
					}
				}
			} else if (tipoProduto == 5) { // Início Revista
				
				while (marvel.getQuantEstoque() == 10) {
					System.out.printf("╔                              ╗\n║ Estoque: %d revistas Marvel. ║\n", marvel.getQuantEstoque());
					System.out.printf("║ Preço unitário: R$%.2f.     ║\n╚                              ╝" , marvel.getValorUnitario());
					System.out.print("\nQuantas você deseja comprar? ");
					int quantidadeRevista = leia.nextInt();
					
					if (quantidadeRevista < 1) {
						System.out.println("\n» Por favor, insira um valor de 1 a 10.\n");
					} else {
						compraEfetuada = true;
						
						for (int x = 0; x < lista.size(); x++) {
							if (lista.get(x).getDescricao().contains("Revista Marvel") == true) {
								if (quantidadeRevista <= lista.get(x).getQuantEstoque()) {
									lista.get(x).retirarEstoque(quantidadeRevista);
									
									totalRevista = quantidadeRevista;
									totalRevista *= marvel.getValorUnitario();
									System.out.print("\n» Você terminou sua compra. Por favor, escolha outro produto para comprar ou realize o pagamento.\n\n");
								} else {
									System.out.println("\n» Não temos essa quantidade no estoque...");
								}
							}
						}			
					}
				}
			}
		} while (tipoProduto != 6);
		
		if (compraEfetuada == true) {
			total = totalBebida + totalSalgadinho + totalDoces + totalRevista + totalGelo;
			
			Loja loja = new Loja("515115", "1ksks");
			
			System.out.print("╔                ╗\n║ • 1 - Crédito  ║\n║ • 2 - Débito   ║\n║ • 3 - Dinheiro ║\n╚                ╝");
			System.out.print("\n» Selecione a forma de pagamento: ");
			int opcaoPagamento = leia.nextInt();
			
			while (opcaoPagamento <= 0 || opcaoPagamento > 3) {
				System.out.println("» Por favor, insira uma opção válida.");
				opcaoPagamento = leia.nextInt();
			} 
			
			if (opcaoPagamento == 1) {
				System.out.print("\n» Informe o número de parcelas: [Máx: 2] ");
				vezes = leia.nextInt();
				while (vezes <= 0 || vezes > 2) {
					System.out.print("\n» Informe um número válido de parcelas: ");
					vezes = leia.nextInt();
				}
			}
			
			loja.pagamento(opcaoPagamento, vezes, total);
			
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.print("               Imprimindo Nota Fiscal");
			
			String reticencias1 = "";
			
			for (int x = 0; x < 3; x++) {			
				for (int y = 0; y < 1; y++) {
					reticencias1 = ".";
					System.out.print(reticencias1);
					reticencias1 += ".";
					Thread.sleep(2000);			
				}
			}
			
			limpaTela();
			
			loja.emissaoNota(total, lista);
			
			System.out.println();
		} else {
			System.out.println("» Dando só uma olhadinha, né? Obrigado e volte sempre!... (Com dinheiro...)");
		}
	}

	public static void limpaTela() { 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
	}
		
}
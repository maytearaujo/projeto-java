package eComerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produto.controller.ProdutoController;
//import produto.model.Produto;
import produto.model.EquipamentoEsportivo;
import produto.model.VestuarioEsportivo;

public class Menu {

	public static void main(String[] args) {
		// E-commerce Produtos Esportivos
		
		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao, codigo, categoria, opConsulta;
		float preco;
		String nome, marca, peso, material, cor, tamanho, tecido, indicado_para;

		System.out.println("\ncriar Contas\n");
		
		EquipamentoEsportivo eqEsport1 = new EquipamentoEsportivo(produtos.gerarNumero(),"Bola de Pilates", 56.99f, 1, "Acte", "300 KG", "PVC","Rosa");
		produtos.cadastrar(eqEsport1);
		
		EquipamentoEsportivo eqEsport2 = new EquipamentoEsportivo(produtos.gerarNumero(), "Mini Jump", 237.99f, 1, "HDFitness", "150 KG", "Aço galvanizado ","Preto");
		produtos.cadastrar(eqEsport2);
		
		VestuarioEsportivo vestEsport1 = new VestuarioEsportivo(produtos.gerarNumero(), "Short de corrida", 2999f, 2, "Nike", "G", "Poliéster", "Corrida");
		produtos.cadastrar(vestEsport1);

		VestuarioEsportivo vestEsport2 = new VestuarioEsportivo(produtos.gerarNumero(), "Jaqueta", 499.99f, 2, "Adidas", "M", "100% poliéster (reciclado)", "Corrida");
		produtos.cadastrar(vestEsport2);
		
		produtos.listarProdutos();
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                E-commerce Sports Brasil             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto                       ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextInt();
				opcao = 0;
			};
			
			if (opcao == 6) {
				System.out.println("\nAgradecemos por utilizar o nosso programa !");
				sobre();
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Produto\n\n");
			 
			//		System.out.println("Digite o código do produto: ");
				//	codigo = leia.nextInt();
					
					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nome=leia.nextLine();
					
					System.out.println("Digite o preço produto: ");
					preco = leia.nextFloat();
					
					System.out.println("Digite a marca produto: ");
					leia.skip("\\R?");
					marca = leia.nextLine();
					
					do {
						System.out.println("Digite a categoria do produto: 1 - Equipamento Esportivo | 2 - Vestuário Esportivo");
						categoria = leia.nextInt();
					} while (categoria < 1 && categoria > 2);

					switch (categoria) {
					case 1 -> {
						//"Equipamento Esportivo";
						leia.nextLine();
						System.out.println("Digite o peso suportado pelo do produto: ");
						peso = leia.nextLine();
						
						System.out.println("Digite material do produto: ");
						material = leia.nextLine();
						
						System.out.println("Digite a cor do produto: ");
						cor = leia.nextLine();
						
						produtos.cadastrar(new EquipamentoEsportivo(produtos.gerarNumero(), nome, preco, categoria, marca, peso, material, cor));						
					}
					case 2 -> {
						//"Vestuário Esportivo";
						leia.nextLine();
						System.out.println("Digite o tamanho do produto: ");
						tamanho = leia.nextLine();
						
						System.out.println("Digite o tecido do produto: ");
						tecido = leia.nextLine();
						
						System.out.println("Digite a indicação do produto: ");
						indicado_para = leia.nextLine();
						
						produtos.cadastrar(new VestuarioEsportivo(produtos.gerarNumero(), nome, preco, categoria, marca, tamanho, tecido, indicado_para));
					}
					default ->{
						System.out.println("Categoria de produto inválida!");
					}
					}
					
					keyPress();
					break;
				
				case 2:
					System.out.println("Listar todos os Produtos\n\n");
					produtos.listarProdutos();
					keyPress();
					break;
				
				case 3:
					System.out.println("Consultar Produto: 1 - Código | 2 - Nome\n\n");
					opConsulta = leia.nextInt();
					
					switch (opConsulta) {
						case 1:
							System.out.println("Digite o código do produto: ");
							codigo = leia.nextInt();
							
							produtos.procurarPorNumero(codigo);
							break;
							
						case 2:
							System.out.println("Digite o nome do produto: ");
							nome = leia.nextLine();
							
							produtos.procurarPorNome(nome);
							break;
							
							default:
								System.out.println("Verifique o número digitado: ");
								break;
					}					
					
					keyPress();
					break;
				
				case 4:
					System.out.println("Atualizar Produto\n\n");

					System.out.println("Digite o código do produto: ");
					codigo = leia.nextInt();
					
					var buscaConta = produtos.buscarNaCollectionNumero(codigo);

					if (buscaConta != null) {
						
						System.out.println("Digite o nome do produto: ");
						leia.skip("\\R?");
						nome=leia.nextLine();
						
						System.out.println("Digite o preço produto: ");
						preco = leia.nextFloat();
						
						System.out.println("Digite a marca produto: ");
						leia.skip("\\R?");
						marca = leia.nextLine();
						
						System.out.println("Digite a marca produto: ");
						leia.skip("\\R?");
						marca = leia.nextLine();
						
						do {
							System.out.println("Digite a categoria do produto: 1 - Equipamento Esportivo | 2 - Vestuário Esportivo");
							categoria = leia.nextInt();
						} while (categoria < 1 && categoria > 2);

						switch (categoria) {
						case 1 -> {
							//"Equipamento Esportivo";
							leia.nextLine();
							System.out.println("Digite o peso suportado pelo do produto: ");
							peso = leia.nextLine();
							
							System.out.println("Digite material do produto: ");
							material = leia.nextLine();
							
							System.out.println("Digite a cor do produto: ");
							cor = leia.nextLine();
							
							produtos.cadastrar(new EquipamentoEsportivo(produtos.gerarNumero(), nome, preco, categoria, marca, peso, material, cor));						
						}
						case 2 -> {
							//"Vestuário Esportivo";
							leia.nextLine();
							System.out.println("Digite o tamanho do produto: ");
							tamanho = leia.nextLine();
							
							System.out.println("Digite o tecido do produto: ");
							tecido = leia.nextLine();
							
							System.out.println("Digite a indicação do produto: ");
							indicado_para = leia.nextLine();
							
							produtos.cadastrar(new VestuarioEsportivo(produtos.gerarNumero(), nome, preco, categoria, marca, tamanho, tecido, indicado_para));
						}
						default ->{
							System.out.println("Categoria de produto inválida!");
						}
						}
						
						
					}else
						System.out.println("\nProduto não encontrado!");
					keyPress();
					break;
				
				case 5:
					System.out.println("Apagar Produto\n\n");
					System.out.println("Digite o código do produto: ");
					codigo = leia.nextInt();
						
					produtos.deletar(codigo);
					keyPress();
					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
					
					keyPress();
					break;
			}
		}
	}
    		
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: ");
			System.out.println("Maytê Araujo - maytearaujo@yahoo.com.br");
			System.out.println("https://github.com/maytearaujo");
			System.out.println("*********************************************************");
		}
		
		public static void keyPress() {
			try {

				System.out.println("\n\nPressione Enter para Continuar...");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");

			}

		}

}

package eComerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// E-commerce Produtos Esportivos

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                E-commerce Sports Brasil             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			if (opcao == 6) {
				System.out.println("\nAgradecemos por utilizar o nosso programa !");
				sobre();
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Produto\n\n");

					break;
				
				case 2:
					System.out.println("Listar todos os Produtos\n\n");

					break;
				
				case 3:
					System.out.println("Consultar Produto - código de barra\n\n");

					break;
				
				case 4:
					System.out.println("Atualizar Produto\n\n");

					break;
				
				case 5:
					System.out.println("Apagar Produto\n\n");

					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
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

}

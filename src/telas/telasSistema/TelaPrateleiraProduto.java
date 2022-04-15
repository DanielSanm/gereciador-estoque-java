package telas.telasSistema;

import java.util.Scanner;

import telas.TelaInicial;

public class TelaPrateleiraProduto {
	
	public static void iniciarTelaPratProd() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====================\n");
		System.out.println("1. Prateleiras");
		System.out.println("2. Produtos");
		System.out.println("3. Voltar");

		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			TelaPrateleiras.iniciarTelaPrateleiras();
		case 2:
			TelaProdutos.iniciarTelaProdutos();
		case 3:
			TelaEstoque.iniciarSistema();
		default:
			System.out.println("\n*** Opção inválida, digite um opção válida! ***\n");
		}
		
	}
}

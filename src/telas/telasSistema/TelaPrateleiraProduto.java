package telas.telasSistema;

import java.util.Scanner;

public class TelaPrateleiraProduto {
	
	public static void iniciar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====================\n");
		System.out.println("\\nO que deseja gerenciar?");
		System.out.println("1. Prateleiras");
		System.out.println("2. Produtos");
		System.out.println("3. Voltar");

		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			TelaPrateleiras.iniciar();
		case 2:
			TelaProdutos.iniciar();
		case 3:
			TelaEstoque.iniciar();
		default:
			System.out.println("\n*** Opção inválida, digite um opção válida! ***\n");
		}
		
		sc.close();
	}
}

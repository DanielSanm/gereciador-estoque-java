package telas.telasSistema;

import java.util.Scanner;

import estoque.Prateleira;

public class TelaProdutos {
	
	public static void iniciar() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====================\n");
		System.out.println("\nProdutos:");
		System.out.println("1. Ver todos");
		System.out.println("2. Buscar");
		System.out.println("3. Adicionar");
		System.out.println("4. Editar");
		System.out.println("5. Apagar");
		
		
		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			Prateleira.verTodosProdutos();
		case 2:
			
		case 3:
			
		case 4:
			
		default:
			System.out.println("\n*** Opção inválida, digite um opção válida! ***\n");
		}
		sc.close();
	}
}

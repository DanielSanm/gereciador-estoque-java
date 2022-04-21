package telas.telasSistema;

import java.util.Scanner;

public class TelaPrateleiras {
	
	public static void iniciar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====================\n");
		System.out.println("\nPrateleiras:");
		System.out.println("1. Ver");
		System.out.println("2. Adicionar");
		System.out.println("3. Editar");
		System.out.println("4. Apagar");

		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		default:
			System.out.println("\n*** Opção inválida, digite um opção válida! ***\n");
		}
		
		sc.close();
	}
}

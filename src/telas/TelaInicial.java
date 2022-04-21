package telas;

import java.util.Scanner;

public class TelaInicial {
	
	public static void iniciar() {
		
		Scanner sc = new Scanner(System.in);
		boolean opcaoValida = false;
		
		System.out.println(""
				+ " ________       ________ \n"
				+ "|  ______|     |  ______|\n"
				+ "| |  ____      | |______ \n"
				+ "| | |__  |     |  ______|\n"
				+ "| |____| |  _  | |______ \n"
				+ "|________| (_) |________|  (v1.0)\n"
				+ "\n=========================\n"
				+ " \nGerenciador de Estoque\n");
		System.out.println("Seja bem vindo!\n");
		do {
			System.out.println("1. Login");
			System.out.println("2. Cadastro");
			System.out.println("3. Encerrar Sistema");
			
			System.out.print("\nEscolha uma opção: ");
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				TelaLogin.iniciar();
				opcaoValida = true;
				break;
			case 2:
				TelaCadastro.iniciar();
				opcaoValida = true;
				break;
			case 3:
				System.out.println("\n*** Sistema encerrado pelo usuário ***");
				opcaoValida = true;
				break;
			default:
				System.out.println("\n*** Opção inválida, digite um opção válida! ***\n");
			} 
		} while(!opcaoValida);
		
		sc.close();
		
	}
}

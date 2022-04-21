package telas.telasSistema;

import java.util.Scanner;

import telas.TelaInicial;

public class TelaEstoque {

	public static void iniciar() {
//		for(Usuario usuarios: Usuario.listaUsuarios) {
//			System.out.println(usuarios);
//		}
		
//		Usuario.listaUsuarios.forEach(System.out::println);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====================\n");
		System.out.println("Bem vindo ao Sistema de Gerenciamento! \n");
		System.out.println("1. Ver Estoque");
		System.out.println("2. Gerenciar Estoque");
		System.out.println("3. Sair");

		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			
		case 2:
			TelaPrateleiraProduto.iniciar();
		case 3:
			TelaInicial.iniciar();
		default:
			System.out.println("\n*** Opção inválida, digite um opção válida! ***\n");
		}
		
		sc.close();
	}
}

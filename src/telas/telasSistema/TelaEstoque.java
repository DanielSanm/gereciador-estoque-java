package telas.telasSistema;

import java.util.Scanner;

import telas.TelaInicial;

public class TelaEstoque {

	public static void iniciarSistema() {
//		for(Usuario usuarios: Usuario.listaUsuarios) {
//			System.out.println(usuarios);
//		}
		
//		Usuario.listaUsuarios.forEach(System.out::println);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Ver Estoque");
		System.out.println("2. Gerenciar Estoque");
		System.out.println("3. Sair");

		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			
		case 2:
			
		case 3:
			TelaInicial.iniciar();
		}
	}
}
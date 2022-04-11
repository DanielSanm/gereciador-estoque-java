package telas;

import java.util.Scanner;

import usuarios.Admin;
import usuarios.Funcionario;
import usuarios.Usuario;

public class TelaCadastro {

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);
		Usuario funcionario = new Funcionario();
		Usuario admin = new Admin();

		System.out.println("\n=====================\n");
		System.out.println("Cadastro: \n");
		System.out.println("Qual o seu tipo de usuário: ");
		System.out.println("1. Funcionário");
		System.out.println("2. Administrador");
		System.out.println("3. Voltar");
		
		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			funcionario.cadastrar();
		case 2:
			admin.cadastrar();
		case 3:
			TelaInicial.iniciar();
		}
		
		sc.close();
	}
}

package telas;

import java.util.Scanner;

import pessoa.Admin;
import pessoa.Funcionario;

public class TelaCadastro {

	static boolean cadastroOk = false;

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n=====================\n");
		System.out.println("Cadastro: \n");
		System.out.print("Nome: ");

		System.out.print("Sobrenome: ");
		String sobrenome = sc.nextLine();

		System.out.print("Id: ");
		int id = sc.nextInt();

		System.out.print("CPF (somente números): ");
		int cpf = sc.nextInt();
		
		do {
			System.out.print("Senha: ");
			String senha = sc.nextLine();

			System.out.print("Confirme a senha: ");
			String confirmSenha = sc.nextLine();

			validaSenhas(senha, confirmSenha);

		} while (!cadastroOk);
		
		
		
		sc.close();

	}

	static void validaSenhas(String senha1, String senha2) {
		if (senha1.equals(senha2)) {
			cadastroOk = true;
		} else {
			System.out.println("\n*** As senhas não coicidem ***\n");
		}

	}

}

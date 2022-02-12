package usuarios;

import java.util.Scanner;

import telas.TelaSistema;

public class Funcionario extends Usuario {

	static boolean cadastroOk = false;
	
	public Funcionario() {}
	public Funcionario(String nome, String sobrenome,
			int id, String senha, String cpf) {
		super(nome, sobrenome, id, senha, cpf);
	}
	
	@Override
	public void cadastrar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n=====================\n");
		System.out.println("Cadastro: \n");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Sobrenome: ");
		String sobrenome = sc.nextLine();

		System.out.print("Id: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("CPF (somente números): ");
		String cpf = sc.nextLine();
		
		String senha;
		
		do {
			System.out.print("Senha: ");
			senha = sc.nextLine();

			System.out.print("Confirme a senha: ");
			String confirmSenha = sc.nextLine();

			validaSenhas(senha, confirmSenha);

		} while (!cadastroOk);
		
		listaUsuarios.add(new Funcionario(nome, sobrenome, id, senha, cpf));
		TelaSistema.mostrarSistema();
		
		sc.close();

	}

	@Override
	public void logar() {
		// TODO Auto-generated method stub
		
	}
	
	static void validaSenhas(String senha1, String senha2) {
		if (senha1.equals(senha2)) {
			cadastroOk = true;
		} else {
			System.out.println("\n*** As senhas não coicidem ***\n");
		}

	}

}

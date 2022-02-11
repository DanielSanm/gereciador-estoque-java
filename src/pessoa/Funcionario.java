package pessoa;

public class Funcionario extends Usuario {

	
	public Funcionario() {}
	public Funcionario(String nome, String sobrenome,
			int id, String senha, int cpf) {
		super(nome, sobrenome, id, senha, cpf);
	}
	
	@Override
	public void cadastrar() {
		
	}

	@Override
	public void logar() {
		// TODO Auto-generated method stub
		
	}

}

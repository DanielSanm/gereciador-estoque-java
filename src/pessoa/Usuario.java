package pessoa;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

	public Usuario() {}
	public Usuario(String nome, String sobrenome, int id, String senha, int cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.id = id;
		this.senha = senha;
		this.cpf = cpf;
		
	}
	
	private String nome;
	private String sobrenome;
	private int id;
	private String senha;
	private int cpf;
	List<Usuario> listaUsuarios = new ArrayList<>();
	
	public abstract void cadastrar();
	public abstract void logar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}

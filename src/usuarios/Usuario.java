package usuarios;

import java.util.ArrayList;
import java.util.List;

import estoque.Estoque;

public abstract class Usuario {

	public Usuario() {}
	public Usuario(String nome, String sobrenome, int id, String senha, String cpf) {
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
	private String cpf;
	public static List<Usuario> listaUsuarios = new ArrayList<>();
	public List<Estoque> estoques = new ArrayList<>();
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "[nome: " + nome + ", sobrenome: " + sobrenome + ", Id: " +
	id + ", senha: " + senha + ", cpf: " + cpf + "]";
	}

}

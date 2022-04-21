package estoque;

import java.util.Objects;

public class Produto {

	private String nome;
	private int qtd;
	private String dimensoes;
	private String peso;
	private int codigo;
	private String posicao;
	private Prateleira prateleira;
	
	public Produto(
			String nome, int qtd, String dimensoes,
			String peso, int codigo, String posicao, Prateleira prateleira) {
		this.nome = nome;
		this.qtd = qtd;
		this.dimensoes = dimensoes;
		this.peso = peso;
		this.codigo = codigo;
		this.posicao = posicao;
		this.prateleira = prateleira;
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Prateleira getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(Prateleira prateleira) {
		this.prateleira = prateleira;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nome, posicao, prateleira);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo && Objects.equals(nome, other.nome) && Objects.equals(posicao, other.posicao)
				&& Objects.equals(prateleira, other.prateleira);
	}
	
	

}

package estoque;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {

	private String id;
	private Estoque estoque;
	public List<Produto> produtos = new ArrayList<>();

	public Prateleira(String id) {
		this.id = id;
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		produto.setPrateleira(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public String toString() {
		return "[Id: " + this.id + ", Produtos(" + this.produtos.size() + ")]";
	}
}

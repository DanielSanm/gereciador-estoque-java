package estoque;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
	
	private String id;
	private Estoque estoque;
	public static List<Produto> produtos = new ArrayList<>();

	public Prateleira(String id) {
		this.id = id;
	}

	public static void verTodosProdutos() {
		produtos.stream().forEach(System.out::println);
	}
	
	public static void buscarProduto(String nome) {
		produtos.stream()
		.filter(p -> p.getNome().equalsIgnoreCase(nome))
		.forEach(System.out::println);
	}
	
	public static void buscarProduto(int codigo) {
		produtos.stream()
		.filter(p -> p.getCodigo() == codigo)
		.forEach(System.out::println);
	}
	
	public static void buscarProduto(Prateleira prateleira) {
		produtos.stream()
		.filter(p -> p.getPrateleira().id.equals(prateleira.id))
		.forEach(System.out::println);
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
		return "[Id: " + this.id + ", Produtos(" + produtos.size() + ")]";
	}
}

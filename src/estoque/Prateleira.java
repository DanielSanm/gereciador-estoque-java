package estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Prateleira {
	
	private String id;
	private Estoque estoque;
	public static List<Produto> produtos = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public Prateleira(String id) {
		this.id = id;
	}

	public static void verTodosProdutos() {
		produtos.stream().forEach(System.out::println);
	}
	
	public static BiFunction<String, Produto, Boolean> buscar = (s, p) -> {
		if(s.equalsIgnoreCase(p.getNome()) 
				|| Integer.parseInt(s) == p.getCodigo() 
				|| s.equalsIgnoreCase(p.getPosicao()) 
				|| s.equalsIgnoreCase(p.getPrateleira().id)) {
			 return true;
		}
		return false;
	};
	
	public void adicionarProduto() {
		
		System.out.println("\n=====================\n");
		System.out.println("Adicionar Produto: \n");
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Quantidade: ");
		int qtd = sc.nextInt();
		
		System.out.println("Dimensões: ");
		String dimensoes = sc.nextLine();
		
		System.out.println("Peso: ");
		String peso = sc.nextLine();
		
		System.out.println("Código");
		int codigo = sc.nextInt();
		
		System.out.println("Posição");
		String posicao = sc.nextLine();
		
		produtos.add(new Produto(nome, qtd, dimensoes, peso, codigo, posicao, null));
		//produto.setPrateleira(this);
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

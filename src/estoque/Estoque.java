package estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import usuarios.Usuario;

public class Estoque {

	private String id;
	public static List<Prateleira> prateleiras = new ArrayList<>();
	public List<Usuario> usuarios = new ArrayList<>();
	
	public void adicionarPrateleira(Prateleira prateleira) {
		prateleiras.add(prateleira);
		prateleira.setEstoque(this);
	}
	
	public static BiFunction<Produto, Prateleira, String> mostrarEstoque = 
			(prod, prat) -> {
				prateleiras.stream()
				.map(p -> prateleiras.indexOf(p) + ". " + p.toString())
				.forEach(System.out::println);
				return "";
			};

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

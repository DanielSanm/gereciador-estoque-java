package estoque;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {

	private String id;
	public List<Produto> produtos = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return "[Id: " + this.id + ", Produtos(" + this.produtos.size() + ")]"; 
	}
}

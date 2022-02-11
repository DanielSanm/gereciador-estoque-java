package pessoa;

public class Admin extends Usuario {
	
	private int keyAuth;

	@Override
	public void cadastrar(Usuario usuario) {
		
	}
	
	@Override
	public void logar() {
		
	}

	public int getKeyAuth() {
		return keyAuth;
	}

	public void setKeyAuth(int keyAuth) {
		this.keyAuth = keyAuth;
	}
	
	
}

package usuarios;

public class Admin extends Usuario {
	
	private int keyAuth;

	@Override
	public void cadastrar() {
		
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

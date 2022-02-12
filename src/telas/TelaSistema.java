package telas;

import usuarios.Usuario;

public class TelaSistema {

	public static void mostrarSistema() {
		for(Usuario usuarios: Usuario.listaUsuarios) {
			System.out.println(usuarios);
		}
		TelaInicial.iniciar();
	}

}

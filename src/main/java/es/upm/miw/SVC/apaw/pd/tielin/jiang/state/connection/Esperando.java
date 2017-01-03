package es.upm.miw.SVC.apaw.pd.tielin.jiang.state.connection;

public class Esperando extends State {

	public Esperando() {
		super(Estado.ESPERANDO);
	}

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		if (respuesta == Link.ACK) {
			conexion.setEstado(new Preparado());
		} else {
			conexion.setEstado(new Cerrado());
		}
	}

}

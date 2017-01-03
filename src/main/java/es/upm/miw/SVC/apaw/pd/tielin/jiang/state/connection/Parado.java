package es.upm.miw.SVC.apaw.pd.tielin.jiang.state.connection;

public class Parado extends State {

	public Parado() {
		super(Estado.PARADO);
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
		//
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

}

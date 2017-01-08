package es.upm.miw.SVC.apaw.pd.tielin.jiang.state.connection;

public class Cerrado extends State {

	public Cerrado() {
		super(Estado.CERRADO);
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}

	@Override
	public void cerrar(Conexion conexion) {
		//
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
		throw new UnsupportedOperationException("Error action");
	}

}

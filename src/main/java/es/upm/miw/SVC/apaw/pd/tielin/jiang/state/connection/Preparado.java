package es.upm.miw.SVC.apaw.pd.tielin.jiang.state.connection;

public class Preparado extends State {

	public Preparado() {
		super(Estado.PREPARADO);
	}

	@Override
	public void abrir(Conexion conexion) {
		//
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		//
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new Esperando());
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Error action");
	}

}

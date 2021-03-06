package es.upm.miw.SVC.apaw.pd.tielin.jiang.state.connection;

public abstract class State {

	protected Estado estado;
	
	public State(Estado estado) {
        this.estado = estado;
    }

	public Estado getEstado() {
		return this.estado;
	};

	public abstract void abrir(Conexion conexion);

	public abstract void cerrar(Conexion conexion);

	public abstract void parar(Conexion conexion);

	public abstract void iniciar(Conexion conexion);

	public abstract void enviar(String msg, Conexion conexion);

	public abstract void recibir(int respuesta, Conexion conexion);

}
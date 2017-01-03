package es.upm.miw.SVC.apaw.pd.tielin.jiang.state.connection;

public class Conexion {

	private State state;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.setEstado(new Cerrado());
	}

	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return this.state.getEstado();
	}

	public void setEstado(State estado) {
		this.state = estado;
	}

	public void abrir() {
		state.abrir(this);
	}

	public void cerrar() {
		state.cerrar(this);
	}

	public void parar() {
		state.parar(this);
	}

	public void iniciar() {
		state.iniciar(this);
	}

	public void enviar(String msg) {
		state.enviar(msg, this);
	}

	public void recibir(int respuesta) {
		state.recibir(respuesta, this);
	}

}

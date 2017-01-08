package es.upm.miw.SVC.apaw.pd.tielin.jiang.composite.expression;

public class Numero implements Expresion {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int operar() {
		return this.numero;
	}

	public String toString() {
		return "" + this.numero;
	}

}

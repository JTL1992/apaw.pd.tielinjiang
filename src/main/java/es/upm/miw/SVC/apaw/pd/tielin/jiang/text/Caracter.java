package es.upm.miw.SVC.apaw.pd.tielin.jiang.text;

public class Caracter extends Componente {
	private char letter;

	public Caracter(char letter) {
		super();
		this.letter = letter;
	}

	@Override
	public void add(Componente componente) {
	}

	@Override
	public void remove(Componente componente) {
	}

	@Override
	public String dibujar(boolean mayuscula) {
		if (mayuscula) {
			return (String.valueOf(this.letter)).toUpperCase();
		} else {
			return (String.valueOf(this.letter));
		}
	}

	@Override
	public boolean isComposite() {
		return false;
	}

}

package es.upm.miw.SVC.apaw.pd.tielin.jiang.text;

import java.util.ArrayList;

public abstract class Composite extends Componente {

	protected ArrayList<Componente> componentes;

	public Composite() {
		this.componentes = new ArrayList<>();
	}

	@Override
	public String dibujar(boolean isUppercase) {

		String content = "";

		for (Componente componente : componentes) {
			content += componente.dibujar(isUppercase);
		}

		return content;
	}

	@Override
	public boolean isComposite() {
		return true;
	}
}

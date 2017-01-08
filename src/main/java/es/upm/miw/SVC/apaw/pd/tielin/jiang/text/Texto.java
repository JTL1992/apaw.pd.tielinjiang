package es.upm.miw.SVC.apaw.pd.tielin.jiang.text;

public class Texto extends Composite {

	@Override
	public void remove(Componente componente) {
		if (componente.isComposite()) {
			componentes.remove(componente);
		}
	}

	@Override
	public void add(Componente componente) {
		if (componente.isComposite()) {
			componentes.add(componente);
		} else {
			throw new UnsupportedOperationException("Unsupported Operation");
		}
	}

	@Override
	public String dibujar(boolean isUpperCase) {
		return super.dibujar(isUpperCase) + "---o---\n";
	}

}

package es.upm.miw.SVC.apaw.pd.tielin.jiang.text;

public abstract class Componente {

	public abstract void remove(Componente componente);

	public abstract void add(Componente componente);

	public abstract boolean isComposite();

	public abstract String dibujar(boolean isUpperCase);

}

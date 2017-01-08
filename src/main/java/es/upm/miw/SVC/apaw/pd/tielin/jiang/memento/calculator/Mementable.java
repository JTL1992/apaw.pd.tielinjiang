package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;

public interface Mementable<T> {

	T createMemento();

	void restoreMemento(T memento);

}

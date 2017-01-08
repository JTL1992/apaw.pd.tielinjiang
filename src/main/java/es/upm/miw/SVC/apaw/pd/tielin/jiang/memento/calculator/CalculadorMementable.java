package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;

import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.Calculator;

public class CalculadorMementable extends Calculator implements Mementable<Memento> {

	@Override
	public Memento createMemento() {
		return new Memento(this.getTotal());
	}

	@Override
	public void restoreMemento(Memento memento) {
		this.setTotal(memento.getValor());
	}

}

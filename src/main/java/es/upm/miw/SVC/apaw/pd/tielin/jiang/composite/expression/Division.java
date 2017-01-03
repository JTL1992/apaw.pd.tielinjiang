package es.upm.miw.SVC.apaw.pd.tielin.jiang.composite.expression;

public class Division extends Operator {

	public Division(Expresion ex1, Expresion ex2) {
		super(ex1, ex2 ,'/');
	}
	
	public int operar() {
		return this.ex1.operar() / this.ex2.operar();
	}
}

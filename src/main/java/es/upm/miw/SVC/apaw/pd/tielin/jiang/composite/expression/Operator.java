package es.upm.miw.SVC.apaw.pd.tielin.jiang.composite.expression;

public abstract class Operator implements Expresion {
	protected Expresion ex1;
	protected Expresion ex2;
	protected char operator;

	public Operator(Expresion ex1, Expresion ex2, char operator) {
		this.ex1 = ex1;
		this.ex2 = ex2;
		this.operator = operator;
	}

	public String toString() {
		return "(" + ex1 + operator + ex2 + ")";
	}
}

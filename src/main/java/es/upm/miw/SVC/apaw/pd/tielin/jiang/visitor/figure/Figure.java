package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public interface Figure {
    
	public abstract void aceptar(Visitor visitor);
	
	public abstract double getArea();
	
	public abstract double getSides();

}

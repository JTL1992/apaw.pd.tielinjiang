package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public class Circle implements Figure {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitCircle(this);

	}

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getSides() {
        return Double.POSITIVE_INFINITY;
    }

}

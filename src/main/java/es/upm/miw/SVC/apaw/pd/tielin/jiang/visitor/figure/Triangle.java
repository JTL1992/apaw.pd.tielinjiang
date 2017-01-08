package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public class Triangle implements Figure {
    
	private double baseSide;

	private double height;

	public Triangle(double baseSide, double height) {
		this.baseSide = baseSide;
		this.height = height;
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitTriangle(this);
	}

    @Override
    public double getArea() {
        return 0.5 * height * baseSide;
    }

    @Override
    public double getSides() {
        return 3;
    }

}

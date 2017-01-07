package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public class Square implements Figure {

	private double side;

	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitSquare(this);
	}

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getSides() {
        return 4;
    }

}

package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public class VisitorArea implements Visitor {

	private double totalArea;

	public double getTotalArea() {
		return this.totalArea;
	}

	public void visitTriangle(Triangle triangle) {
		totalArea += triangle.getArea();
	}

	public void visitSquare(Square square) {
		totalArea += square.getArea();
	}

	public void visitCircle(Circle circle) {
		totalArea += circle.getArea();
	}

}

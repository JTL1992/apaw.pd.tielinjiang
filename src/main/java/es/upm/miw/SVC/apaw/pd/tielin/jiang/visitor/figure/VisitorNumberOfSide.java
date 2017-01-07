package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public class VisitorNumberOfSide implements Visitor {

	private double totalSides;

	public double getTotalSides() {
		return this.totalSides;
	}

	public void visitTriangle(Triangle triangle) {
		totalSides += triangle.getSides();
	}

	public void visitSquare(Square square) {
		totalSides += square.getSides();
	}

	public void visitCircle(Circle circle) {
		totalSides += circle.getSides();
	}

}

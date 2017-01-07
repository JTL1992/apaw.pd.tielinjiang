package es.upm.miw.SVC.apaw.pd.tielin.jiang.visitor.figure;

public interface Visitor {

	void visitTriangle(Triangle triangle);

	void visitSquare(Square square);

	void visitCircle(Circle circle);

}

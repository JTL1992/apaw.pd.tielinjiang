package es.upm.miw.SVC.apwd.pd.tielin.jiang.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int value) {

		return new NaturalNumberFr(value);

	}

}
